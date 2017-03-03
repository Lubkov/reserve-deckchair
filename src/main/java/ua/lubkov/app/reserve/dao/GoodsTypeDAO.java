package ua.lubkov.app.reserve.dao;

import java.util.List;

import ua.lubkov.app.reserve.domain.GoodsType;

public interface GoodsTypeDAO {
	
	public List<GoodsType> selectAll() throws Exception;
	public GoodsType selectAt(Long id) throws Exception;
	public GoodsType add(GoodsType item) throws Exception;
	public void update(GoodsType item) throws Exception;
	public void delete(GoodsType item) throws Exception;
}
