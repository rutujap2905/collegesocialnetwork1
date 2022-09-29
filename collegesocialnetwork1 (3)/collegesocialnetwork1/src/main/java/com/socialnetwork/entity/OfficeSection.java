package com.socialnetwork.entity;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OfficeSection {
	
	@Id
    @GeneratedValue
    private Integer officeId;
	
	private String documentType;
	private LocalDate endDate;
	
	public OfficeSection() {
		super();
	}

	public OfficeSection(Integer officeId, String documentType, LocalDate endDate) {
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

	public void setLocalDate(LocalDate endDate2) {
		// TODO Auto-generated method stub
		
	}


	
}
