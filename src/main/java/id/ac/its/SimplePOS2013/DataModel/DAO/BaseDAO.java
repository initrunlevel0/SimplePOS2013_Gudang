package id.ac.its.SimplePOS2013.DataModel.DAO;

import java.util.List;

public interface BaseDAO<T, U> {
	void add(T t);
	void update(T t);
	void delete(U id, Class <T> clazz);
	T view(U id, Class <T> clazz);
	List<T> listAll(Class <T> clazz);
	List<T> doQuery(String query, Class <T> clazz);
}
