package id.ac.its.SimplePOS2013.DataModel.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class BaseDAOImpl<T, U> implements BaseDAO<T, U> {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(T t) {
		em.persist(t);
		
	}

	@Override
	public void update(T t) {
		//sessionFactory.getCurrentSession().update(t);
		
	}

	@Override
	public void delete(U id, Class<T> clazz) {
		/*
		@SuppressWarnings("unchecked")
		
		T obj = (T) sessionFactory.getCurrentSession().load(clazz, (Serializable) id);
		if(obj != null) {
			sessionFactory.getCurrentSession().delete(obj);
		}
		*/
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T view(U id, Class<T> clazz) {
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll(Class <T> clazz) {
		return null;
	}

	@Override
	public List<T> doQuery(String query, Class <T> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
