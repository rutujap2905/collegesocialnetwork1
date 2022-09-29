package com.socialnetwork.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer studentId;
	private String studentName;
	private Integer year;
	private Long mobileNo;
	private String branch;
	

	@ManyToOne
	private PlacementOfficer placementOfficer;
	
	@ManyToOne
	private OfficeSection officeSection;
	
	@OneToMany
	List<Staff>staff=new ArrayList<Staff>();
	
	@OneToMany
	List<EventManagement>eventManagement=new ArrayList<EventManagement>();

	public Student(Integer studentId, String studentName, Integer year, Long mobileNo, String branch,
			PlacementOfficer placementOfficer, OfficeSection officeSection, List<Staff> staff,
			List<EventManagement> eventManagement) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.year = year;
		this.mobileNo = mobileNo;
		this.branch = branch;
		this.placementOfficer = placementOfficer;
		this.officeSection = officeSection;
		this.staff = staff;
		this.eventManagement = eventManagement;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public PlacementOfficer getPlacementOfficer() {
		return placementOfficer;
	}

	public void setPlacementOfficer(PlacementOfficer placementOfficer) {
		this.placementOfficer = placementOfficer;
	}

	public OfficeSection getOfficeSection() {
		return officeSection;
	}

	public void setOfficeSection(OfficeSection officeSection) {
		this.officeSection = officeSection;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public List<EventManagement> getEventManagement() {
		return eventManagement;
	}

	public void setEventManagement(List<EventManagement> eventManagement) {
		this.eventManagement = eventManagement;
	}
	
	
	

}