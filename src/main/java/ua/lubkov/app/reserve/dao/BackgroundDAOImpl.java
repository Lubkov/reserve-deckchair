package ua.lubkov.app.reserve.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ua.lubkov.app.reserve.domain.Background;

@Repository
public class BackgroundDAOImpl implements BackgroundDAO {
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<Background> selectAll() throws Exception {
		Query query = sessionFactory.getCurrentSession().createQuery("from Background");
		
		return (List<Background>) query.list();
	}

	@Override
	public Background selectAt(Long id) throws Exception {
		Background item = null;
		Query query = sessionFactory.getCurrentSession().createQuery("from Background where id = ?");
		query.setLong(0, id);
		
		if (query.list().size() > 0) {
			item = (Background) query.list().get(0);
		}
		
		return item;
	}

	@Override
	public Background add(Background item) throws Exception {
		Long id = (Long) sessionFactory.getCurrentSession().save(item);
		item.setId(id);
		
		return item;
	}

	@Override
	public void update(Background item) throws Exception {
		
		sessionFactory.getCurrentSession().update(item);
	}

	@Override
	public void delete(Background item) throws Exception {
		
		sessionFactory.getCurrentSession().delete(item);
	}

}
