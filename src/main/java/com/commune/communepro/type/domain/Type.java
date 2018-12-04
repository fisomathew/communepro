package com.commune.communepro.type.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "type")
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long typeId;
    private String typeName;
    private int typeCreatedBy;
    private Date typeCreatedDate;

    public Type() {
    }

    public Type(Long typeId, String typeName, int typeCreatedBy, Date typeCreatedDate) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeCreatedBy = typeCreatedBy;
        this.typeCreatedDate = typeCreatedDate;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
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
