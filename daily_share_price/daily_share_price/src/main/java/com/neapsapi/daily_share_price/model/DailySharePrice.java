package com.neapsapi.daily_share_price.model;

import java.util.Arrays;
import java.util.Date;

public class DailySharePrice {
	
	private int status;
	private String message;
	private String[] data;
	private Date date;
	private String security_name;
	private String symbol;
	private String series;
	private int open;
	private int close;
	private int high;
	private int low;
	private int pre_close;
	private int no_of_shares_traded;
	private int net_traded_value;
	private int high_52_weeks;
	private int low_52_weeks;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String[] getData() {
		return data;
	}
	public void setData(String[] data) {
		this.data = data;
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
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getClose() {
		return close;
	}
	public void setClose(int close) {
		this.close = close;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getPre_close() {
		return pre_close;
	}
	public void setPre_close(int pre_close) {
		this.pre_close = pre_close;
	}
	public int getNo_of_shares_traded() {
		return no_of_shares_traded;
	}
	public void setNo_of_shares_traded(int no_of_shares_traded) {
		this.no_of_shares_traded = no_of_shares_traded;
	}
	public int getNet_traded_value() {
		return net_traded_value;
	}
	public void setNet_traded_value(int net_traded_value) {
		this.net_traded_value = net_traded_value;
	}
	public int getHigh_52_weeks() {
		return high_52_weeks;
	}
	public void setHigh_52_weeks(int high_52_weeks) {
		this.high_52_weeks = high_52_weeks;
	}
	public int getLow_52_weeks() {
		return low_52_weeks;
	}
	public void setLow_52_weeks(int low_52_weeks) {
		this.low_52_weeks = low_52_weeks;
	}
	@Override
	public String toString() {
		return "DailySharePrice [status=" + status + ", message=" + message + ", data=" + Arrays.toString(data)
				+ ", date=" + date + ", security_name=" + security_name + ", symbol=" + symbol + ", series=" + series
				+ ", open=" + open + ", close=" + close + ", high=" + high + ", low=" + low + ", pre_close=" + pre_close
				+ ", no_of_shares_traded=" + no_of_shares_traded + ", net_traded_value=" + net_traded_value
				+ ", high_52_weeks=" + high_52_weeks + ", low_52_weeks=" + low_52_weeks + "]";
	}
	
	

}
