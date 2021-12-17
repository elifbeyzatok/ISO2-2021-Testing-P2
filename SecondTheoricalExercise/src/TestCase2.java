import org.junit.Test;

public class TestCase2 {
	@Test
	public void testcase2() {
		HealthConditions hc = new HealthConditions();
		hc.ill = true;
		hc.contactedWithInfectedPerson = false;
		hc.contactedWithSuspectedSymptoms = false;
		hc.hasCovidPassport = true;
		hc.checkboard();
	}

}
