package com.socialnetwork.entity;

public class StaffDTO {
	
	private Integer staffId;
	private String staffName;
	private String staffBranch;
	private String staffEmailId;
	
	
	
	public StaffDTO() {
		super();	
	}



	public StaffDTO(Integer staffId, String staffName, String staffBranch, String staffEmailId) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffBranch = staffBranch;
		this.staffEmailId = staffEmailId;
	}



	public Integer getStaffId() {
		return staffId;
	}



	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}



	public String getStaffName() {
		return staffName;
	}



	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}



	public String getStaffBranch() {
		return staffBranch;
	}



	public void setStaffBranch(String staffBranch) {
		this.staffBranch = staffBranch;
	}



	public String getStaffEmailId() {
		return staffEmailId;
	}



	public void setStaffEmailId(String staffEmailId) {
		this.staffEmailId = staffEmailId;
	}


	
}
