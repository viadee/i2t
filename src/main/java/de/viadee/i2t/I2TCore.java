package de.viadee.i2t;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * I2TCore contains main method for an executes the I2TApplication.
 * @author GrS 17.11.2011
 */
public class I2TCore {

    static Logger logger = Logger.getLogger(I2TCore.class);
    
    /**
     * DOC B03 Comment method "main".
     * @param args - First argument is name of Informatica model, second and third argument may contain paths for input and output directories
     */
    public static void main(String[] args) {     
        // Set up a simple configuration that logs on the console.
        PropertyConfigurator.configure("log4j.properties");
     
        //initialize spring context from applicationContext.xml in src/main/resources
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-common.xml","applicationContext-prod.xml"});
        BeanFactory factory = (BeanFactory)context;

        //Get both required processing beans
        @SuppressWarnings("unchecked")
        I2TPowrmartVisitor powrmartVisitor = (I2TPowrmartVisitor)factory.getBean("I2TPowrmartVisitor");
        @SuppressWarnings("unchecked")
        I2TPreprocessorVisitor preprocessorVisitor = (I2TPreprocessorVisitor)factory.getBean("I2TPreprocessorVisitor");
        
        if(args.length == 0){
            logger.fatal("No input model name found, expected as first parameter");
        }
        else{
            String modelName = args[0];
            
            I2TApplication application = new I2TApplication(modelName, preprocessorVisitor, powrmartVisitor);
            try {
                for(int i = 1; i<args.length; i++){
                    if(args[i].equals("-in") && !args[i+1].equals("")){
                        application.setInputPath(args[i+1]);
                    }
                    else if(args[i].equals("-out") && !args[i+1].equals("")){
                        application.setOutputPath(args[i+1]);
                    }
                    else if(args[i].equals("-showgraph")){
                        application.setShowGraph(true);
                    }
                }
                application.run();
            } catch (I2TApplicationException e) {
                logger.fatal(e.getMessage());
                e.printStackTrace();
            }
            finally{
                application.close();
            }
        }
    }
}



