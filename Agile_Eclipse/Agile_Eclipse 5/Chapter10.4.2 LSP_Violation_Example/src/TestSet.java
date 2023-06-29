import junit.framework.TestCase;

public class TestSet extends TestCase {

	public void testPrintSet() {
		Set<PersistentObject> set = new PersistentSet<PersistentObject>();
		set.Add(new PersistentMemo("1: Hello!"));
		set.Add(new PersistentMemo("2: How are you?"));
		set.Add(new PersistentMemo("3: I'm fine, thank you."));
		SetUtility.PrintSet(set);
	}
}
