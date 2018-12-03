package com.commune.communepro.board.domain;

import java.util.Date;

public class Board {
    private int boardId;
    private String boardName;
    private int boardTypeId;
    private int boardSubtypeId;
    private int boardCreatedBy;
    private Date boardCreatedDate;

    public Board() {
    }

    public Board(int boardId, String boardName, int boardTypeId, int boardSubtypeId, int boardCreatedBy, Date boardCreatedDate) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardTypeId = boardTypeId;
        this.boardSubtypeId = boardSubtypeId;
        this.boardCreatedBy = boardCreatedBy;
        this.boardCreatedDate = boardCreatedDate;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public int getBoardTypeId() {
        return boardTypeId;
    }

    public void setBoardTypeId(int boardTypeId) {
        this.boardTypeId = boardTypeId;
    }

    public int getBoardSubtypeId() {
        return boardSubtypeId;
    }

    public void setBoardSubtypeId(int boardSubtypeId) {
        this.boardSubtypeId = boardSubtypeId;
    }

    public int getBoardCreatedBy() {
        return boardCreatedBy;
    }

    public void setBoardCreatedBy(int boardCreatedBy) {
        this.boardCreatedBy = boardCreatedBy;
    }

    public Date getBoardCreatedDate() {
        return boardCreatedDate;
    }

    public void setBoardCreatedDate(Date boardCreatedDate) {
        this.boardCreatedDate = boardCreatedDate;
    }
}
