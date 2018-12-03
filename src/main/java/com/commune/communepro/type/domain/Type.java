package com.commune.communepro.type.domain;

import java.util.Date;

public class Type {
    private int typeId;
    private String typeName;
    private int typeCreatedBy;
    private Date typeCreatedDate;

    public Type() {
    }

    public Type(int typeId, String typeName, int typeCreatedBy, Date typeCreatedDate) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeCreatedBy = typeCreatedBy;
        this.typeCreatedDate = typeCreatedDate;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getTypeCreatedBy() {
        return typeCreatedBy;
    }

    public void setTypeCreatedBy(int typeCreatedBy) {
        this.typeCreatedBy = typeCreatedBy;
    }

    public Date getTypeCreatedDate() {
        return typeCreatedDate;
    }

    public void setTypeCreatedDate(Date typeCreatedDate) {
        this.typeCreatedDate = typeCreatedDate;
    }
}
