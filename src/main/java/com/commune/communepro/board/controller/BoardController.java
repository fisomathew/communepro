package com.commune.communepro.board.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.commune.communepro.board.service.BoardService;
import com.commune.communepro.item.service.ItemService;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private ItemService itemService;

	@RequestMapping("/")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pboardlist", boardService.getAllBoards());
		modelAndView.setViewName("board/index");
		return modelAndView;
	}

	
	@RequestMapping("/{id}/{typeid}/{subtypeid}")
	public ModelAndView getBoardDeatils(@PathVariable Long id,@PathVariable Long typeid,@PathVariable Long subtypeid){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemlist", itemService.getItemBySubType(subtypeid));
		return modelAndView;
	}
	@RequestMapping("/{id}/{typeid}")
	public ModelAndView getBoardDeatils(@PathVariable Long id,@PathVariable Long typeid){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemlist", itemService.getItemByType(typeid));
		modelAndView.setViewName("board/board_panel :: list");
		return modelAndView;
	}

}
