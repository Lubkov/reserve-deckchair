package ua.lubkov.app.reserve.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ua.lubkov.app.reserve.domain.Goods;

@Repository
public class GoodsTypeDAOImpl implements GoodsTypeDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<Goods> selectAll() throws Exception {
		Query query = sessionFactory.getCurrentSession().createQuery("from Goods");
		
		return (List<Goods>) query.list();
	}

	@Override
	public Goods selectAt(Long id) throws Exception {
		Goods item = null;
		Query query = sessionFactory.getCurrentSession().createQuery("from Goods where id = ?");
		query.setLong(0, id);
		
		if (query.list().size() > 0) {
			item = (Goods) query.list().get(0);
		}
		
		return item;
	}

	@Override
	public Goods add(Goods item) throws Exception {
		Long id = (Long) sessionFactory.getCurrentSession().save(item);
		item.setId(id);
		
		return item;
	}

	@Override
	public void update(Goods item) throws Exception {
		
		sessionFactory.getCurrentSession().update(item);
	}

	@Override
	public void delete(Goods item) throws Exception {
		
		sessionFactory.getCurrentSession().delete(item);
	}

}
