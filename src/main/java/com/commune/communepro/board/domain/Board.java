package com.commune.communepro.board.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "board")
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long boardId;
	
    private String boardName;
    private Long boardTypeId;
    private Long boardSubtypeId;
    private Long boardCreatedBy;
    private Date boardCreatedDate;

    public Board() {
    }

    public Board(Long boardId, String boardName, Long boardTypeId, Long boardSubtypeId, Long boardCreatedBy, Date boardCreatedDate) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardTypeId = boardTypeId;
        this.boardSubtypeId = boardSubtypeId;
        this.boardCreatedBy = boardCreatedBy;
        this.boardCreatedDate = boardCreatedDate;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public Long getBoardTypeId() {
        return boardTypeId;
    }

    public void setBoardTypeId(Long boardTypeId) {
        this.boardTypeId = boardTypeId;
    }

    public Long getBoardSubtypeId() {
        return boardSubtypeId;
    }

    public void setBoardSubtypeId(Long boardSubtypeId) {
        this.boardSubtypeId = boardSubtypeId;
    }

    public Long getBoardCreatedBy() {
        return boardCreatedBy;
    }

    public void setBoardCreatedBy(Long boardCreatedBy) {
        this.boardCreatedBy = boardCreatedBy;
    }

    public Date getBoardCreatedDate() {
        return boardCreatedDate;
    }

    public void setBoardCreatedDate(Date boardCreatedDate) {
        this.boardCreatedDate = boardCreatedDate;
    }
}
