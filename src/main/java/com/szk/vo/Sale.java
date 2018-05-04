package com.szk.vo;

import java.sql.Timestamp;

public class Sale {
	private Integer id;						//销售编号
	private String Car_Name,                //车辆名称
				   Sale_Buyer, 				//购买者
				   Sale_Num, 				//销售
				   Sale_Head, 				//负责人姓名
				   Car_Supplier,			//车辆提供商
				   Buyer_Phone;				//购买者联系方式
	private Float Sale_Price; 				//销售价格
	private Integer Car_Num;				//车辆编号
    private Timestamp Sale_Date;			//销售时间
	public Sale() {
		super();
	}
	public Sale(Integer id, String car_Name, String sale_Buyer, String sale_Num, String sale_Head, String car_Supplier,
			String buyer_Phone, Float sale_Price, Integer car_Num, Timestamp sale_Date) {
		super();
		this.id = id;
		Car_Name = car_Name;
		Sale_Buyer = sale_Buyer;
		Sale_Num = sale_Num;
		Sale_Head = sale_Head;
		Car_Supplier = car_Supplier;
		Buyer_Phone = buyer_Phone;
		Sale_Price = sale_Price;
		Car_Num = car_Num;
		Sale_Date = sale_Date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCar_Name() {
		return Car_Name;
	}
	public void setCar_Name(String car_Name) {
		Car_Name = car_Name;
	}
	public String getSale_Buyer() {
		return Sale_Buyer;
	}
	public void setSale_Buyer(String sale_Buyer) {
		Sale_Buyer = sale_Buyer;
	}
	public String getSale_Num() {
		return Sale_Num;
	}
	public void setSale_Num(String sale_Num) {
		Sale_Num = sale_Num;
	}
	public String getSale_Head() {
		return Sale_Head;
	}
	public void setSale_Head(String sale_Head) {
		Sale_Head = sale_Head;
	}
	public String getCar_Supplier() {
		return Car_Supplier;
	}
	public void setCar_Supplier(String car_Supplier) {
		Car_Supplier = car_Supplier;
	}
	public String getBuyer_Phone() {
		return Buyer_Phone;
	}
	public void setBuyer_Phone(String buyer_Phone) {
		Buyer_Phone = buyer_Phone;
	}
	public Float getSale_Price() {
		return Sale_Price;
	}
	public void setSale_Price(Float sale_Price) {
		Sale_Price = sale_Price;
	}
	public Integer getCar_Num() {
		return Car_Num;
	}
	public void setCar_Num(Integer car_Num) {
		Car_Num = car_Num;
	}
	public Timestamp getSale_Date() {
		return Sale_Date;
	}
	public void setSale_Date(Timestamp sale_Date) {
		Sale_Date = sale_Date;
	}
	@Override
	public String toString() {
		return "Sale [id=" + id + ", Car_Name=" + Car_Name + ", Sale_Buyer=" + Sale_Buyer + ", Sale_Num=" + Sale_Num
				+ ", Sale_Head=" + Sale_Head + ", Car_Supplier=" + Car_Supplier + ", Buyer_Phone=" + Buyer_Phone
				+ ", Sale_Price=" + Sale_Price + ", Car_Num=" + Car_Num + ", Sale_Date=" + Sale_Date + "]";
	}


}
