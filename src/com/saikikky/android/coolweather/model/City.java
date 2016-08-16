package com.saikikky.android.coolweather.model;

public class City {

	private int id; //自增长主键
	private String cityName; //城市名
	private String cityCode; //市级代号
	private int ProvinceId; //City关联Province表的外键
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityCode() {
		return cityCode;
	}
	
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	
	public int getProvinceId() {
		return ProvinceId;
	}
	
	public void setProvinceId(int provinceId) {
		ProvinceId = provinceId;
	}	
}
