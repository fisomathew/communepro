package com.commune.communepro.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.commune.communepro.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	
}
