import org.junit.Test;

public class TestCase2 {
	@Test
	public void testcase2() {
		HealthConditions hc = new HealthConditions();
		hc.ill = true;
		hc.contactedWithInfectedPerson = true;
		hc.contactedWithSuspectedSymptoms = true;
		hc.hasCovidPassport = false;
		hc.checkboard();
	}

}
