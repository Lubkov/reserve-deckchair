package ua.lubkov.app.reserve.dao;

import java.util.List;

import ua.lubkov.app.reserve.domain.Layout;

public interface LayoutDAO {
	public List<Layout> selectAll() throws Exception;
	public Layout selectAt(Long id) throws Exception;
	public Layout add(Layout item) throws Exception;
	public void update(Layout item) throws Exception;
	public void delete(Layout item) throws Exception;
}
