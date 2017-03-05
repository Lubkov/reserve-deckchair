package ua.lubkov.app.reserve.dao;

import java.util.List;

import ua.lubkov.app.reserve.domain.LayoutComposition;

public interface LayoutCompositionDAO {
	
	public List<LayoutComposition> selectAll() throws Exception;
	public LayoutComposition selectAt(Long id) throws Exception;
	public LayoutComposition add(LayoutComposition item) throws Exception;
	public void update(LayoutComposition item) throws Exception;
	public void delete(LayoutComposition item) throws Exception;
}
