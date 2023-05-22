package abd.sample.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abd.sample.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {

	@Autowired
	EventRepository eventRepository;
	
	@Override
	public List<Map<String, Object>> retrieveEvent() {
		// TODO Auto-generated method stub
		return eventRepository.retrieveEvent();
	}

	@Override
	public List<Map<String, Object>> retrieveEventByEventCode(Map<String,String>paramMap) {
		// TODO Auto-generated method stub
		return eventRepository.retrieveEventByEventCode(paramMap);
	}

}
