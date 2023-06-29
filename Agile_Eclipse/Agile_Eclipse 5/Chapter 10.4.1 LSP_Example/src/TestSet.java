import junit.framework.TestCase;

public class TestSet extends TestCase {

	public void testPrintSet() {
		Set<String> set = new UnoundedSet<String>();
		set.Add("1: Hello!");
		set.Add("2: How are you?");
		set.Add("3: I'm fine, thank you.");
		SetUtility.PrintSet(set);
	}
}
