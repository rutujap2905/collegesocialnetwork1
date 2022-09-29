package com.socialnetwork.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialnetwork.entity.Staff;
import com.socialnetwork.entity.StaffDTO;
import com.socialnetwork.exception.StaffNotFoundException;
import com.socialnetwork.repository.StaffRepository;

@Service
public class StaffImp implements StaffService{
	
	@Autowired
	private StaffRepository staffReop;
	
	@Override
	public Staff addStaff(Staff staff) {
		return this.staffReop.save(staff);
	}

	

	@Override
	public Staff updateStaff(StaffDTO staffDTO) throws StaffNotFoundException {
		Optional<Staff> staffOpt = this.staffReop.findById(staffDTO.getStaffId());
		if(staffOpt.isEmpty())
			throw new StaffNotFoundException("staff Id does not exist to update. ");
		Staff updateStaff = staffOpt.get();
		updateStaff.setStaffName(staffDTO.getStaffName());
		updateStaff.setStaffBranch(staffDTO.getStaffBranch());
		updateStaff.setStaffEmailId(staffDTO.getStaffEmailId());
		return this.staffReop.save(updateStaff);
	}

	@Override
	public List<Staff> showStaffs() {
		return this.staffReop.findAll();
	}

	@Override
	public Staff getStaffById(@Valid Integer staff) throws StaffNotFoundException {
		Optional<Staff> staffOpt = this.staffReop.findById(staff);
		if(staffOpt.isEmpty())
			throw new StaffNotFoundException("Id Not Found ");
		return staffOpt.get();
	}

	@Override
	public Staff deleteStaffById(Integer id) throws StaffNotFoundException {
		Optional<Staff> optstaff = this.staffReop.findById(id);
		if(optstaff.isEmpty())
			throw new StaffNotFoundException("Staff Id does not exist to delet. ");
		this.staffReop.deleteById(id);
		return optstaff.get();
	}

}
