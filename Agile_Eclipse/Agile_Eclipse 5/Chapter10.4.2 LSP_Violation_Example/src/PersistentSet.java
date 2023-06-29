import java.util.Iterator;


public class PersistentSet<T> extends Set<T> {

	ThirdPartyPersistentSet itsThirdPartyPersisentSet = new ThirdPartyPersistentSet();
	
	@Override
	void Add(T obj) {
		if (obj instanceof PersistentObject) {
			itsThirdPartyPersisentSet.Add((PersistentObject) obj);
		}
	}

	@Override
	void Delete(T obj) {
			itsThirdPartyPersisentSet.Delete((PersistentObject) obj);
	}

	@Override
	boolean IsMember(T obj) {
		if (obj instanceof PersistentObject) {
			return itsThirdPartyPersisentSet.IsMember((PersistentObject) obj);
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public Iterator<T> iterator() {
			return (Iterator<T>) itsThirdPartyPersisentSet.iterator();
	}
}
