package ua.lubkov.app.reserve.dao;

import java.util.List;

import ua.lubkov.app.reserve.domain.Goods;

public interface GoodsTypeDAO {
	
	public List<Goods> selectAll() throws Exception;
	public Goods selectAt(Long id) throws Exception;
	public Goods add(Goods item) throws Exception;
	public void update(Goods item) throws Exception;
	public void delete(Goods item) throws Exception;
}
