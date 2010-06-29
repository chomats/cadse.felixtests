package felixtests

import fr.imag.adele.cadse.platform.gr.*
import fr.imag.adele.cadse.platform.*


public class SamTest extends FelixTestCase {
	public void init() {
		String gId = "fr.imag.adele.cadse.runtime";
		String vId = "2.3.0-SNAPSHOT";
		
		/* Libraries */
		run.addBundelInM2("javax.servlet", 'org.eclipse', "javax.servlet", '2.5.0-v200910301333')
		run.addBundelInM2("org.apache.log4j", 'org.eclipse', "org.apache.log4j", '1.2.15-v201005080500')
		run.addBundelInM2("bak.pcj", 'bak.pcj', "bak.pcj", '1.2.0-SNAPSHOT')
		run.addBundelInM2("js.bundle", 'rhino', "js.bundle", '1.7.0-R2-SNAPSHOT')
		run.addBundelInM2("com.google.collect", 'org.eclipse', "com.google.collect", '0.8.0-v201006010502')
		run.addBundelInM2("mysql-connector-java", 'mysql', "mysql-connector-java", '5.1.11')
		run.addBundelInM2("org.apache.xbean.xbean-reflect", 'org.eclipse', "org.apache.xbean.xbean-reflect", '3.4.0')
		run.addBundelInM2("org.junit.bundle", 'org.eclipse', "org.junit.bundle", '3.8.2.v20090203-1005')
		run.addBundelInM2("org.objectweb.asm", 'org.eclipse', "org.objectweb.asm", '3.2.0-v200909071300')
		
		run.addBundelInM2("fr.imag.adele.cadse.compatility", gId, "compatility", vId)
		run.addBundelInM2("fr.imag.adele.cadse.util", gId, "util", vId)
		run.addBundelInM2("fr.imag.adele.cadse.util.io", gId, "util.io", vId)
		
		run.addBundelInM2("fr.imag.adele.cadse.as.classreferencer", gId, "as.classreferencer", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.cu", gId, "as.cu", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.findmodel", gId, "as.findmodel", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.initmodel", gId, "as.initmodel", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.loadservice", gId, "as.loadservice", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.modelversiondbservice", gId, "as.modelversiondbservice", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.operationfactory", gId, "as.operationfactory", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.persistence", gId, "as.persistence", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.platformeIDE", gId, "as.platformeIDE", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.scmservice", gId, "as.scmservice", vId)
		run.addBundelInM2("fr.imag.adele.cadse.as.test", gId, "as.test", vId)
		
		run.addBundelInM2("fr.imag.adele.cadse.cu.core", gId, "cu.core", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.ModelVersionDB", gId, "si.ModelVersionDB", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.defaultclassreferencer", gId, "si.defaultclassreferencer", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.defaultloadfactory", gId, "si.defaultloadfactory", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.defaultoperationfactory.nl1", gId, "si.defaultoperationfactory.nl1", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.defaultoperationfactory", gId, "si.defaultoperationfactory", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.findmodel", gId, "si.findmodel", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.initmodel", gId, "si.initmodel", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.loadall", gId, "si.loadall", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.persistence", gId, "si.persistence", vId)
		run.addBundelInM2("fr.imag.adele.cadse.si.platformcmd", gId, "si.platformcmd", vId)
		
		run.addBundelInM2("fr.imag.adele.cadse.si.scmservice", gId, "si.scmservice", vId)
		run.addBundelInM2("fr.imag.adele.cadse.ipojo.model", gId, "ipojo.model", vId)
		run.addBundelInM2("fr.imag.adele.cadse.Model.Workspace.CadseG", gId, "Model.Workspace.CadseG", vId)
		run.addBundelInM2('org.apache.felix.ipojo.metadata', 'org.apache.felix', 'org.apache.felix.ipojo.metadata', '1.4.0')
		run.addBundelInM2('org.apache.commons.logging', 'org.eclipse', 'org.apache.commons.logging', '1.1.1-v201005080502')
		
		run.addBundelInM2("Model.Workspace.sam.composite", gId, "Model.Workspace.sam.composite", vId)
		run.addBundelInM2("Model.Workspace.sam.core", gId, "Model.Workspace.sam.core", vId)
		run.addBundelInM2("Selecta.constraint.language.extension", 'fr.imag.adele.cadse', "Selecta.constraint.language.extension", vId)
		run.addBundelInM2("fr.imag.adele.cadse.test.runtime", gId, "fr.imag.adele.cadse.test.runtime", vId)
		
		
		/* TEST */
		CadseTestPart tp = addTestPart(null, 'SamTest',
			'fr.imag.adele.cadse.test.runtime','fr.imag.adele.cadse.test.runtime.SamRuntime_ts')
		
	}
	
	public static void main(String[] args) {
		main(new SamTest())
	}

}