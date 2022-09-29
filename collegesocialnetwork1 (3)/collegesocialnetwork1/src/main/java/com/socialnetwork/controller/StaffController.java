package com.socialnetwork.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialnetwork.entity.Staff;
import com.socialnetwork.entity.StaffDTO;
import com.socialnetwork.exception.StaffNotFoundException;
import com.socialnetwork.service.StaffService;



@RestController
@RequestMapping

public class StaffController {

	@Autowired
	private StaffService staffService;
	
	@PostMapping("staff")
	public Staff addofficeSection(@Valid@RequestBody StaffDTO staffDTO){
		Staff staff = new Staff(staffDTO.getStaffId(), staffDTO.getStaffName(), staffDTO.getStaffBranch(),staffDTO.getStaffEmailId());
				return this.staffService.addStaff(staff);
	}

	@PutMapping("staff")
	public Staff updatestaff(@RequestBody StaffDTO staffDTO) throws StaffNotFoundException {
		return this.staffService.updateStaff(staffDTO);
	}
	
	@GetMapping("staff")
	public List<Staff> getAllStaff(){
		return this.staffService.showStaffs();
	}
	
	@GetMapping("staff/{id}")
	public Staff getStaffDetailsById(@Valid@PathVariable("id") Integer staff) throws StaffNotFoundException {
		return this.staffService.getStaffById(staff);
		
	}
	@DeleteMapping("staff/{id}")
	public Staff deleteStaffById(@PathVariable("id") Integer id )throws  StaffNotFoundException {
		return this. staffService.deleteStaffById(id);
	
	}
}

