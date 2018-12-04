package com.commune.communepro.board.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.commune.communepro.board.domain.Board;
import com.commune.communepro.board.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Board> getAllBoards(){
		return boardService.getAllBoards();
	}
	

}
