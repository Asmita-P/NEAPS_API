package com.neapsapi.shareholders.model;

import java.util.Arrays;
import java.util.Date;

public class Shareholders {
	
	private Date from_date;
	private Date to_date;
	private String message;
	private Date date;
	private String security_name;
	private String symbol;
	private String series;
	private String security_status;
	private String security_type;
	private String[] shareholder_details;
	private String name;
	private String pan;
	private String address;
	private String cin_din;
	private int no_of_shares_held;
	private int percentage_holding;
	private Date as_on_date;
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSecurity_name() {
		return security_name;
	}
	public void setSecurity_name(String security_name) {
		this.security_name = security_name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSecurity_status() {
		return security_status;
	}
	public void setSecurity_status(String security_status) {
		this.security_status = security_status;
	}
	public String getSecurity_type() {
		return security_type;
	}
	public void setSecurity_type(String security_type) {
		this.security_type = security_type;
	}
	public String[] getShareholder_details() {
		return shareholder_details;
	}
	public void setShareholder_details(String[] shareholder_details) {
		this.shareholder_details = shareholder_details;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCin_din() {
		return cin_din;
	}
	public void setCin_din(String cin_din) {
		this.cin_din = cin_din;
	}
	public int getNo_of_shares_held() {
		return no_of_shares_held;
	}
	public void setNo_of_shares_held(int no_of_shares_held) {
		this.no_of_shares_held = no_of_shares_held;
	}
	public int getPercentage_holding() {
		return percentage_holding;
	}
	public void setPercentage_holding(int percentage_holding) {
		this.percentage_holding = percentage_holding;
	}
	public Date getAs_on_date() {
		return as_on_date;
	}
	public void setAs_on_date(Date as_on_date) {
		this.as_on_date = as_on_date;
	}
	@Override
	public String toString() {
		return "Shareholders [from_date=" + from_date + ", to_date=" + to_date + ", message=" + message + ", date="
				+ date + ", security_name=" + security_name + ", symbol=" + symbol + ", series=" + series
				+ ", security_status=" + security_status + ", security_type=" + security_type + ", shareholder_details="
				+ Arrays.toString(shareholder_details) + ", name=" + name + ", pan=" + pan + ", address=" + address
				+ ", cin_din=" + cin_din + ", no_of_shares_held=" + no_of_shares_held + ", percentage_holding="
				+ percentage_holding + ", as_on_date=" + as_on_date + "]";
	}
	
	
	

}
