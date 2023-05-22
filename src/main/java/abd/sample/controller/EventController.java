package abd.sample.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import abd.sample.service.EventService;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EventController {
	
	@Autowired
	EventService eventService;
	
	@ResponseBody
	@RequestMapping(value="/event",method={RequestMethod.POST, RequestMethod.OPTIONS})
	public List<Map<String,Object>> event(@RequestBody Map<String,String> paramMap, HttpServletRequest request){
		
		return eventService.retrieveEvent();
	}
	
	@ResponseBody
	@RequestMapping(value="/eventDetail",method={RequestMethod.POST, RequestMethod.OPTIONS})
	public List<Map<String,Object>> eventDetail(@RequestBody Map<String,String> paramMap, HttpServletRequest request){
		
		return eventService.retrieveEventByEventCode(paramMap);
	}
}
