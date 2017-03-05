package ua.lubkov.app.reserve.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ua.lubkov.app.reserve.domain.Layout;

@Repository
public class LayoutDAOImpl implements LayoutDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<Layout> selectAll() throws Exception {
		Query query = sessionFactory.getCurrentSession().createQuery("from Layout");
		
		return (List<Layout>) query.list();
	}

	@Override
	public Layout selectAt(Long id) throws Exception {
		Layout item = null;
		Query query = sessionFactory.getCurrentSession().createQuery("from Layout where id = ?");
		query.setLong(0, id);
		
		if (query.list().size() > 0) {
			item = (Layout) query.list().get(0);
		}
		
		return item;
	}

	@Override
	public Layout add(Layout item) throws Exception {
		Long id = (Long) sessionFactory.getCurrentSession().save(item);
		item.setId(id);
		
		return item;
	}

	@Override
	public void update(Layout item) throws Exception {
		
		sessionFactory.getCurrentSession().update(item);
	}

	@Override
	public void delete(Layout item) throws Exception {
		
		sessionFactory.getCurrentSession().delete(item);
	}

}
