import org.junit.Test;

public class TestCase1 {
	@Test
	public void testcase1() {
		HealthConditions hc = new HealthConditions();
		hc.ill = false;
		hc.contactedWithInfectedPerson = false;
		hc.contactedWithSuspectedSymptoms = false;
		hc.hasCovidPassport = true;
		hc.checkboard();
		
	}
	
	

}
