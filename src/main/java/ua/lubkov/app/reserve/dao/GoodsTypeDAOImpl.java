package ua.lubkov.app.reserve.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ua.lubkov.app.reserve.domain.GoodsType;

@Repository
public class GoodsTypeDAOImpl implements GoodsTypeDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<GoodsType> selectAll() throws Exception {
		Query query = sessionFactory.getCurrentSession().createQuery("from GoodsType");
		
		return (List<GoodsType>) query.list();
	}

	@Override
	public GoodsType selectAt(Long id) throws Exception {
		GoodsType item = null;
		Query query = sessionFactory.getCurrentSession().createQuery("from GoodsType where id = ?");
		query.setLong(0, id);
		
		if (query.list().size() > 0) {
			item = (GoodsType) query.list().get(0);
		}
		
		return item;
	}

	@Override
	public GoodsType add(GoodsType item) throws Exception {
		Long id = (Long) sessionFactory.getCurrentSession().save(item);
		item.setId(id);
		
		return item;
	}

	@Override
	public void update(GoodsType item) throws Exception {
		
		sessionFactory.getCurrentSession().update(item);
	}

	@Override
	public void delete(GoodsType item) throws Exception {
		
		sessionFactory.getCurrentSession().delete(item);
	}

}
