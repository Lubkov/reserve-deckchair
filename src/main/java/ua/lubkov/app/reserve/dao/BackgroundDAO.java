package ua.lubkov.app.reserve.dao;

import java.util.List;

import ua.lubkov.app.reserve.domain.Background;

public interface BackgroundDAO {
	
	public List<Background> selectAll() throws Exception;
	public Background selectAt(Long id) throws Exception;
	public Background add(Background item) throws Exception;
	public void update(Background item) throws Exception;
	public void delete(Background item) throws Exception;
}
