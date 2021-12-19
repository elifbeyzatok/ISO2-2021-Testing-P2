import org.junit.Test;

public class TestCase3 {
	@Test
	public void testcase3() {
		HealthConditions hc = new HealthConditions();
		hc.ill = true;
		hc.contactedWithInfectedPerson = false;
		hc.contactedWithSuspectedSymptoms = false;
		hc.hasCovidPassport = true;
		hc.checkboard();
	}

}
