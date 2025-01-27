package sn.edu.sid.bambey.collections;

import java.util.List;
/**
 * Crud functionality of an entity {@link T}. Use of java genericity.
 * @param <T>
 */
public interface Crud<T> {
	public T  add(T t);

	public List<T> getAll();

	public List<T> findBy(String key);

	public void update(Integer id, T t);

	public void delete(Integer id);
}
