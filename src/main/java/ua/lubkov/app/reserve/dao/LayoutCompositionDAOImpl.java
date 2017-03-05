package ua.lubkov.app.reserve.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ua.lubkov.app.reserve.domain.LayoutComposition;

@Repository
public class LayoutCompositionDAOImpl implements LayoutCompositionDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<LayoutComposition> selectAll() throws Exception {
		Query query = sessionFactory.getCurrentSession().createQuery("from LayoutComposition");
		
		return (List<LayoutComposition>) query.list();
	}

	@Override
	public LayoutComposition selectAt(Long id) throws Exception {
		LayoutComposition item = null;
		Query query = sessionFactory.getCurrentSession().createQuery("from LayoutComposition where id = ?");
		query.setLong(0, id);
		
		if (query.list().size() > 0) {
			item = (LayoutComposition) query.list().get(0);
		}
		
		return item;
	}

	@Override
	public LayoutComposition add(LayoutComposition item) throws Exception {
		Long id = (Long) sessionFactory.getCurrentSession().save(item);
		item.setId(id);
		
		return item;
	}

	@Override
	public void update(LayoutComposition item) throws Exception {
		
		sessionFactory.getCurrentSession().update(item);
	}

	@Override
	public void delete(LayoutComposition item) throws Exception {
		
		sessionFactory.getCurrentSession().delete(item);
	}

}
