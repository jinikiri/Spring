package course.Course;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	
	@RequestMapping("/courses")
	public ModelAndView courses(@RequestParam("cname") String cname,HttpSession session)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("cname",cname);
    	mv.setViewName("course");
    	System.out.println(cname);
		return mv;
	}
}
