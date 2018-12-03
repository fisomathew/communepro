package com.commune.communepro.item.domain;

import java.util.Date;

public class Item {
    private int itemId;
    private String itemName;
    private int itemTypeId;
    private int itemSubtypeId;
    private int itemCreatedBy;
    private Date itemCreatedDate;

    public Item() {
    }

    public Item(int itemId, String itemName, int itemTypeId, int itemSubtypeId, int itemCreatedBy, Date itemCreatedDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemTypeId = itemTypeId;
        this.itemSubtypeId = itemSubtypeId;
        this.itemCreatedBy = itemCreatedBy;
        this.itemCreatedDate = itemCreatedDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(int itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public int getItemSubtypeId() {
        return itemSubtypeId;
    }

    public void setItemSubtypeId(int itemSubtypeId) {
        this.itemSubtypeId = itemSubtypeId;
    }

    public int getItemCreatedBy() {
        return itemCreatedBy;
    }

    public void setItemCreatedBy(int itemCreatedBy) {
        this.itemCreatedBy = itemCreatedBy;
    }

    public Date getItemCreatedDate() {
        return itemCreatedDate;
    }

    public void setItemCreatedDate(Date itemCreatedDate) {
        this.itemCreatedDate = itemCreatedDate;
    }
}
