
public abstract class Set<T> implements Iterable<T> {
	abstract void Add(T obj);
	abstract void Delete(T obj);
	abstract boolean IsMember(T obj);
}
