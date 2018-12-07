package com.commune.communepro.item.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.commune.communepro.product.domain.Product;

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemName;
    private Long itemTypeId;
    private Long itemSubtypeId;
    private Long itemCreatedBy;
    private Date itemCreatedDate;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;
     
    public Item() {
    }

    public Item(Long id, String itemName, Long itemTypeId, Long itemSubtypeId, Long itemCreatedBy, Date itemCreatedDate,Product product) {
        this.id = id;
        this.itemName = itemName;
        this.itemTypeId = itemTypeId;
        this.itemSubtypeId = itemSubtypeId;
        this.itemCreatedBy = itemCreatedBy;
        this.itemCreatedDate = itemCreatedDate;
        this.product=product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
    
}
