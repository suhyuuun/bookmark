package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dto.BookmarkDTO;
import service.BookmarkService;

//http://localhost:8090/myapp/bookmark.do

@Controller
public class BookmarkController {
	private BookmarkService service;
	
	public BookmarkController() {

	}
	
	public void setService(BookmarkService service) {
		this.service = service;
	}
	
	@RequestMapping("/bookmark.do")
	public String bookmarkForm() {
		return "bookmark";
	}
	
	
	@RequestMapping("/list.do")
	public ModelAndView listMethod(BookmarkDTO dto, ModelAndView mav) {
		List<BookmarkDTO> aList = service.listProcess(dto);
		mav.addObject("aList", aList);
		mav.addObject("dto", dto);
		mav.setViewName("list");
		return mav;
	}
	
	//ajax 활용해볼것
	@ResponseBody
	@RequestMapping("/delete_list.do")
	public String bookmark_list_delete(int num) {
		service.list_deleteProcess(num);
		return "list";
	}

}
