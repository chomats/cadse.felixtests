package felixtests

import fr.imag.adele.cadse.platform.gr.*
import fr.imag.adele.cadse.platform.*


public class SamTest extends FelixTestCase {
	public void init() {
		String gId = "fr.imag.adele.cadse.runtime";
		String vId = "2.3.0-SNAPSHOT";
		
		/* Libraries */
		run.addBundelInM2("forfelix", gId, "forfelix", vId)
		
		run.addBundelInM2("Model.Workspace.sam.composite", gId, "Model.Workspace.sam.composite", vId)
		run.addBundelInM2("Model.Workspace.sam.core", gId, "Model.Workspace.sam.core", vId)
		run.addBundelInM2("Selecta.constraint.language.extension", 'fr.imag.adele.cadse', "Selecta.constraint.language.extension", vId)
		run.addBundelInM2("fr.imag.adele.cadse.test.runtime", gId, "fr.imag.adele.cadse.test.runtime", vId)
		
		run.addBundelInM2('org.eclipse.jdt.junit4.runtime', 'org.eclipse', 'org.eclipse.jdt.junit4.runtime','1.1.100-v20100526.0800')
		
		/* TEST */
		CadseTestPart tp = addTestPart(null, 'SamTest',
			'fr.imag.adele.cadse.test.runtime','fr.imag.adele.cadse.test.runtime.SamRuntime_ts')
		
	}
	
	public static void main(String[] args) {
		main(new SamTest())
	}

}