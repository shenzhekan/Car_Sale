package com.szk.vo;

import java.sql.Timestamp;

public class Storage {
	private String Car_Name, 		//车辆名称
				   Car_Head, 		//入库负责人
				   Car_Color, 		//车辆颜色
				   Car_Supplier; 	//车辆提供商
	private Integer Car_Num; 		//车辆编号
	private Float Car_Price; 		//入库价格
	private Float Car_Sale;			//预期销售价格
	private Timestamp Car_Date;		//入库时间
	private int sum;

	public Storage() {
		super();
	}
	

	public Storage(String car_Name, String car_Head, String car_Color, String car_Supplier, Integer car_Num,
			Float car_Price, Float car_Sale, Timestamp car_Date, int sum) {
		super();
		Car_Name = car_Name;
		Car_Head = car_Head;
		Car_Color = car_Color;
		Car_Supplier = car_Supplier;
		Car_Num = car_Num;
		Car_Price = car_Price;
		Car_Sale = car_Sale;
		Car_Date = car_Date;
		this.sum = sum;
	}
	


	public String getCar_Name() {
		return Car_Name;
	}


	public void setCar_Name(String car_Name) {
		Car_Name = car_Name;
	}


	public String getCar_Head() {
		return Car_Head;
	}


	public void setCar_Head(String car_Head) {
		Car_Head = car_Head;
	}


	public String getCar_Color() {
		return Car_Color;
	}


	public void setCar_Color(String car_Color) {
		Car_Color = car_Color;
	}


	public String getCar_Supplier() {
		return Car_Supplier;
	}


	public void setCar_Supplier(String car_Supplier) {
		Car_Supplier = car_Supplier;
	}


	public Integer getCar_Num() {
		return Car_Num;
	}


	public void setCar_Num(Integer car_Num) {
		Car_Num = car_Num;
	}


	public Float getCar_Price() {
		return Car_Price;
	}


	public void setCar_Price(Float car_Price) {
		Car_Price = car_Price;
	}


	public Float getCar_Sale() {
		return Car_Sale;
	}


	public void setCar_Sale(Float car_Sale) {
		Car_Sale = car_Sale;
	}


	public Timestamp getCar_Date() {
		return Car_Date;
	}


	public void setCar_Date(Timestamp car_Date) {
		Car_Date = car_Date;
	}

	

	@Override
	public String toString() {
		return "Storage [Car_Name=" + Car_Name + ", Car_Head=" + Car_Head + ", Car_Color=" + Car_Color
				+ ", Car_Supplier=" + Car_Supplier + ", Car_Num=" + Car_Num + ", Car_Price=" + Car_Price + ", Car_Sale="
				+ Car_Sale + ", Car_Date=" + Car_Date + ", sum=" + sum + "]";
	}


	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

}
