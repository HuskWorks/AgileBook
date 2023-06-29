
public class SetUtility {
	static <T> void PrintSet(Set<T> set) {
		for (T obj: set) {
			System.out.println(obj.toString());
		}
	}
}
