import java.util.ArrayList;
import java.util.Iterator;


public class UnoundedSet<T> extends Set<T> {

    ArrayList<T> arrayList = new ArrayList<T>();
    
	@Override
	void Add(T obj) {
		arrayList.add(obj);
	}

	@Override
	void Delete(T obj) {
		arrayList.remove(obj);
	}

	@Override
	boolean IsMember(T obj) {
		return arrayList.contains(obj);
	}

	public Iterator<T> iterator() {
		return arrayList.iterator();
	}

}
