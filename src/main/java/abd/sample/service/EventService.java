package abd.sample.service;

import java.util.List;
import java.util.Map;

public interface EventService {
	List<Map<String,Object>> retrieveEvent();
	List<Map<String,Object>> retrieveEventByEventCode(Map<String,String>paramMap);
}
