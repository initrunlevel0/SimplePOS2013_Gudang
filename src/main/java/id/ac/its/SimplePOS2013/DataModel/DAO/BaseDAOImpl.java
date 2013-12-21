package id.ac.its.SimplePOS2013.DataModel.DAO;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "baseDao")
@Transactional
public class BaseDAOImpl<T, U> implements BaseDAO<T, U> {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(T t) {
		em.persist(t);
		
	}

	@Override
	public void update(T t) {
		em.merge(t);
		
	}

	@Override
	public void delete(U id, Class<T> clazz) {
		T obj = (T) em.find(clazz, id);
		if(obj != null) {
			em.remove(obj);
		}
		*/
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T view(U id, Class<T> clazz) {
		return em.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll(Class <T> clazz) {
		TypedQuery<T> query = em.createQuery(" from " + clazz.getName(), clazz);
		return query.getResultList();
	}

	@Override
	public List<T> doQuery(String query, Class <T> clazz) {
		TypedQuery<T> queryResult = em.createQuery(query, clazz);
		return queryResult.getResultList();
		
	}

	

}
