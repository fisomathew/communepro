package com.commune.communepro.board.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commune.communepro.board.domain.Board;
import com.commune.communepro.board.service.BoardService;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping("/")
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pboardlist", boardService.getAllBoards());
		modelAndView.setViewName("board/index");
		return modelAndView;
	}
	@RequestMapping("/test")
	public ModelAndView test(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board/board_panel :: list");
		return modelAndView;
	}
}
