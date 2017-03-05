package ua.lubkov.app.reserve.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.lubkov.app.reserve.dao.GoodsTypeDAO;
import ua.lubkov.app.reserve.domain.GoodsType;

@Service("goodsType")
public class GoodsTypeServiceImpl implements GoodsTypeService {
	
	@Autowired
	private GoodsTypeDAO goodsTypeDAO;

	@Override
	@Transactional(readOnly = true)
	public List<GoodsType> getAll() throws Exception {

		return goodsTypeDAO.selectAll();
	}

	@Override
	@Transactional(readOnly = true)
	public GoodsType getAt(Long id) throws Exception {

		return goodsTypeDAO.selectAt(id);
	}

	@Override
	@Transactional(readOnly = false)
	public GoodsType save(GoodsType item) throws Exception {
	
		if (item.getId() == null) {
			item = goodsTypeDAO.add(item);
		} else {
			goodsTypeDAO.update(item);
		}
			
		return item;
	}

	@Override
	@Transactional(readOnly = false)
	public void remove(GoodsType item) throws Exception {

		goodsTypeDAO.delete(item);
	}

}
