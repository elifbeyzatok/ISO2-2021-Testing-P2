import org.junit.Test;

public class TestCase3 {
	@Test
	public void testcase3() {
		HealthConditions hc = new HealthConditions();
		hc.ill = false;
		hc.contactedWithInfectedPerson = true;
		hc.contactedWithSuspectedSymptoms = true;
		hc.hasCovidPassport = true;
		hc.checkboard();
	}

}
