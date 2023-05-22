package abd.sample.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EventRepository {
	public List<Map<String,Object>> retrieveEvent();
	public List<Map<String,Object>> retrieveEventByEventCode(Map<String,String>paramMap);
}
