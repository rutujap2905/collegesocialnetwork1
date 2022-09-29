package com.socialnetwork.service;

import java.util.List;

import javax.validation.Valid;

import com.socialnetwork.entity.Staff;
import com.socialnetwork.entity.StaffDTO;
import com.socialnetwork.exception.StaffNotFoundException;



public interface StaffService {
	
	public Staff addStaff(Staff staff);

	public Staff updateStaff(StaffDTO staffDTO)throws StaffNotFoundException;

	public List<Staff> showStaffs();

	public Staff getStaffById(@Valid Integer staffId) throws StaffNotFoundException;

	public Staff deleteStaffById(Integer id) throws StaffNotFoundException;


}
