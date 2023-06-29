import java.util.ArrayList;
import java.util.Iterator;


public class ThirdPartyPersistentSet {
    ArrayList<PersistentObject> arrayList = new ArrayList<PersistentObject>();
    
	void Add(PersistentObject obj) {
		arrayList.add(obj);
		persist(obj);
	}

	void Delete(PersistentObject obj) {
		arrayList.remove(obj);
		remove(obj);
	}

	boolean IsMember(PersistentObject obj) {
		return arrayList.contains(obj);
	}

	public Iterator<PersistentObject> iterator() {
		return arrayList.iterator();
	}
	
	void persist(PersistentObject obj) {
		// put 'obj' into Database
	}
	
	void remove(PersistentObject obj) {
		// remove 'obj' from Database
	}
}
