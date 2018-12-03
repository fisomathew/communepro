package com.commune.communepro.subtype.domain;

import java.util.Date;

public class Subtype {
    private int subtypeId;
    private String subtypeName;
    private int subtypeTypeId;
    private int subtypeCreatedBy;
    private Date subtypeCreatedDate;

    public Subtype(int subtypeId, String subtypeName, int subtypeTypeId, int subtypeCreatedBy, Date subtypeCreatedDate) {
        this.subtypeId = subtypeId;
        this.subtypeName = subtypeName;
        this.subtypeTypeId = subtypeTypeId;
        this.subtypeCreatedBy = subtypeCreatedBy;
        this.subtypeCreatedDate = subtypeCreatedDate;
    }

    public Subtype() {
    }

    public int getSubtypeId() {
        return subtypeId;
    }

    public void setSubtypeId(int subtypeId) {
        this.subtypeId = subtypeId;
    }

    public String getSubtypeName() {
        return subtypeName;
    }

    public void setSubtypeName(String subtypeName) {
        this.subtypeName = subtypeName;
    }

    public int getSubtypeTypeId() {
        return subtypeTypeId;
    }

    public void setSubtypeTypeId(int subtypeTypeId) {
        this.subtypeTypeId = subtypeTypeId;
    }

    public int getSubtypeCreatedBy() {
        return subtypeCreatedBy;
    }

    public void setSubtypeCreatedBy(int subtypeCreatedBy) {
        this.subtypeCreatedBy = subtypeCreatedBy;
    }

    public Date getSubtypeCreatedDate() {
        return subtypeCreatedDate;
    }

    public void setSubtypeCreatedDate(Date subtypeCreatedDate) {
        this.subtypeCreatedDate = subtypeCreatedDate;
    }
}
