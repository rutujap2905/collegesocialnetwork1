package com.socialnetwork.entity;

import java.time.LocalDate;

public class OfficeSectionDTO {

	
	private Integer officeId;
	
	private String documentType;
	private LocalDate endDate;
	
	
	public OfficeSectionDTO() {
		super();
	}


	public OfficeSectionDTO(Integer officeId, String documentType, LocalDate endDate) {
		super();
		this.officeId = officeId;
		this.documentType = documentType;
		this.endDate = endDate;
	}


	public Integer getOfficeId() {
		return officeId;
	}


	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}


	public String getDocumentType() {
		return documentType;
	}


	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	

	
	
}
