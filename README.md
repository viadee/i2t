<h1>i2t (informatica to talend) - Migrations-Tool</h1>


<p>Das i2t ist ein halbautomatisches Migrationstool zur vielf�ltigen Unterst�tzung
beim Wechsel von Informatica nach Talend.Es werden nicht nur die grundlegenden
Talend-Jobs aus den Informatica-Modellen generiert, sondern es unterst�tzt ebenfalls
Bereiche wie der Sch�tzung des Migrationsprojektes sowie des Projektcontrollings.
Dar�ber gibt es dem Entwickler einen sehr guten Ausgangspunkt f�r die
Fortentwicklung der erzeugten Talend-Jobs.</p>

<h2>Getting started</h2>

<p>Vorrausetzung f�r das bauen einer Version ist Maven:</p>

<blockquote>
mvn clean install
</blockquote>

<p>Migration des Informatica-Export <b>/input/m_Rank.xml</b> starten</p>

<blockquote>
mvn exec:java -Dexec.args="m_Rank"
</blockquote>

<p>
Das migrierte Talend-Projekt befindet sich unter
</p>
<blockquote>
/output/m_Rank.item<br>
/output/m_Rank.properties<br>
/output/talend.project
</blockquote>


<p>
</p>

<p>
This tool is currently in a proof-of-concept stage.
It is available under an Apache Licence v2.0 (http://www.apache.org/licenses/LICENSE-2.0)
</p>
