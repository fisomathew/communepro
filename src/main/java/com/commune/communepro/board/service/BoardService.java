package com.commune.communepro.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commune.communepro.board.domain.Board;
import com.commune.communepro.board.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	public List<Board> getAllBoards(){

		List<Board> boards=new ArrayList<>();
		boardRepository.findAll().forEach(boards::add);
		return boards;

	}
	
}
