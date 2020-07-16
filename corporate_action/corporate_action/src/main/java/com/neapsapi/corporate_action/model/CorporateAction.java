package com.neapsapi.corporate_action.model;

import java.util.Arrays;
import java.util.Date;

public class CorporateAction {
	
	private int status;
	private String message;
	private String[] data;
	private Date date;
	private String security_name;
	private String symbol;
	private String series;
	private Date record_date;
	private Date bc_start_date;
	private Date bc_end_date;
	private Date nd_start_date;
	private Date nd_end_date;
	private String purpose;
	private String announcementText;
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
	public Date getRecord_date() {
		return record_date;
	}
	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}
	public Date getBc_start_date() {
		return bc_start_date;
	}
	public void setBc_start_date(Date bc_start_date) {
		this.bc_start_date = bc_start_date;
	}
	public Date getBc_end_date() {
		return bc_end_date;
	}
	public void setBc_end_date(Date bc_end_date) {
		this.bc_end_date = bc_end_date;
	}
	public Date getNd_start_date() {
		return nd_start_date;
	}
	public void setNd_start_date(Date nd_start_date) {
		this.nd_start_date = nd_start_date;
	}
	public Date getNd_end_date() {
		return nd_end_date;
	}
	public void setNd_end_date(Date nd_end_date) {
		this.nd_end_date = nd_end_date;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getAnnouncementText() {
		return announcementText;
	}
	public void setAnnouncementText(String announcementText) {
		this.announcementText = announcementText;
	}
	@Override
	public String toString() {
		return "CorporateAction [status=" + status + ", message=" + message + ", data=" + Arrays.toString(data)
				+ ", date=" + date + ", security_name=" + security_name + ", symbol=" + symbol + ", series=" + series
				+ ", record_date=" + record_date + ", bc_start_date=" + bc_start_date + ", bc_end_date=" + bc_end_date
				+ ", nd_start_date=" + nd_start_date + ", nd_end_date=" + nd_end_date + ", purpose=" + purpose
				+ ", announcementText=" + announcementText + "]";
	}
	
	
	
	

}
