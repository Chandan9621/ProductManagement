package com.Bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ProductBean implements Serializable{
private Integer pId;
private String pName;
private int pPrice;
private int pQty;
public ProductBean()
{
	
}
public Integer getpId() {
	return pId;
}
public void setpId(Integer pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getpPrice() {
	return pPrice;
}
public void setpPrice(int pPrice) {
	this.pPrice = pPrice;
}
public int getpQty() {
	return pQty;
}
public void setpQty(int pQty) {
	this.pQty = pQty;
}
@Override
public String toString() {
	return "ProductBean [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pQty=" + pQty + "]";
}



}