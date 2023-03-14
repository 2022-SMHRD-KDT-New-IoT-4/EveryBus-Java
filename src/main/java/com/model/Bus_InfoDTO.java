package com.model;

public class Bus_InfoDTO {
	
	private String line_id;
	private String line_name;
	private String dir_up_name;
	private String dir_down_name;
	private String line_kind;
	
	
	
	
	public Bus_InfoDTO() {
		super();
	}
	
	public Bus_InfoDTO(String line_id, String line_name, String dir_up_name, String dir_down_name, String line_kind) {
		super();
		this.line_id = line_id;
		this.line_name = line_name;
		this.dir_up_name = dir_up_name;
		this.dir_down_name = dir_down_name;
		this.line_kind = line_kind;
	}
	
	public String getLine_id() {
		return line_id;
	}
	public void setLine_id(String line_id) {
		this.line_id = line_id;
	}
	public String getLine_name() {
		return line_name;
	}
	public void setLine_name(String line_name) {
		this.line_name = line_name;
	}
	public String getDir_up_name() {
		return dir_up_name;
	}
	public void setDir_up_name(String dir_up_name) {
		this.dir_up_name = dir_up_name;
	}
	public String getDir_down_name() {
		return dir_down_name;
	}
	public void setDir_down_name(String dir_down_name) {
		this.dir_down_name = dir_down_name;
	}
	public String getLine_kind() {
		return line_kind;
	}
	public void setLine_kind(String line_kind) {
		this.line_kind = line_kind;
	}
	
	
	
	
	
	
	

}
