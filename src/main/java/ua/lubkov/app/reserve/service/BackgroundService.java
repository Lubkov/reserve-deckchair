package ua.lubkov.app.reserve.service;

import java.util.List;

import ua.lubkov.app.reserve.domain.Background;

public interface BackgroundService {
	
	public List<Background> getAll() throws Exception;
	public Background getAt(Long id) throws Exception;
	public Background save(Background item) throws Exception;
	public void remove(Background item) throws Exception;
}
