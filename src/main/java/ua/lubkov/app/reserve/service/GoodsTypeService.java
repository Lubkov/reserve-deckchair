package ua.lubkov.app.reserve.service;

import java.util.List;

import ua.lubkov.app.reserve.domain.GoodsType;

public interface GoodsTypeService {

	public List<GoodsType> getAll() throws Exception;
	public GoodsType getAt(Long id) throws Exception;
	public GoodsType save(GoodsType item) throws Exception;
	public void remove(GoodsType item) throws Exception;
}
