package com.commune.communepro.item.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String itemName;
    private Long itemTypeId;
    private Long itemSubtypeId;
    private Long itemCreatedBy;
    private Date itemCreatedDate;

    public Item() {
    }

    public Item(Long itemId, String itemName, Long itemTypeId, Long itemSubtypeId, Long itemCreatedBy, Date itemCreatedDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemTypeId = itemTypeId;
        this.itemSubtypeId = itemSubtypeId;
        this.itemCreatedBy = itemCreatedBy;
        this.itemCreatedDate = itemCreatedDate;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Long itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public Long getItemSubtypeId() {
        return itemSubtypeId;
    }

    public void setItemSubtypeId(Long itemSubtypeId) {
        this.itemSubtypeId = itemSubtypeId;
    }

    public Long getItemCreatedBy() {
        return itemCreatedBy;
    }

    public void setItemCreatedBy(Long itemCreatedBy) {
        this.itemCreatedBy = itemCreatedBy;
    }

    public Date getItemCreatedDate() {
        return itemCreatedDate;
    }

    public void setItemCreatedDate(Date itemCreatedDate) {
        this.itemCreatedDate = itemCreatedDate;
    }
}
