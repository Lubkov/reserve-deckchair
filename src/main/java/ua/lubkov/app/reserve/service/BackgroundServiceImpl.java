package ua.lubkov.app.reserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lubkov.app.reserve.dao.BackgroundDAO;
import ua.lubkov.app.reserve.domain.Background;

@Service("background")
public class BackgroundServiceImpl implements BackgroundService {
	
	@Autowired
	private BackgroundDAO backgroundDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Background> getAll() throws Exception {
		
		return backgroundDAO.selectAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Background getAt(Long id) throws Exception {
		
		return backgroundDAO.selectAt(id);
	}

	@Override
	@Transactional(readOnly = false)
	public Background save(Background item) throws Exception {
		
		if (item.getId() == null) {
			item = backgroundDAO.add(item);
		} else {
			backgroundDAO.update(item);
		}
			
		return item;
	}

	@Override
	@Transactional(readOnly = false)
	public void remove(Background item) throws Exception {
		
		backgroundDAO.delete(item);
	}

}
