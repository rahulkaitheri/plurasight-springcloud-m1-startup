package plurasight.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlurasightController {

	@RequestMapping(value="/greeting" , method=RequestMethod.GET)
	public String sayHello() {
		return "say hello";
	}
}
