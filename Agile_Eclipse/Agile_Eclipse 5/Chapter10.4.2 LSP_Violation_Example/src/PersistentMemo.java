import java.util.UUID;

public class PersistentMemo extends PersistentObject {
	String itsMemo = "";
	PersistentMemo(String memo) {
		persistentId = UUID.randomUUID();
		itsMemo = memo;
	}
	public String toString() {
		return itsMemo;
	}
}
