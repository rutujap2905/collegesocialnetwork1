package com.socialnetwork;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.socialnetwork.entity.Staff;
import com.socialnetwork.entity.StaffDTO;
import com.socialnetwork.exception.StaffNotFoundException;
import com.socialnetwork.service.StaffService;

@SpringBootTest
class Collegesocialnetwork1ApplicationTests {
	
	 @Autowired
	    private StaffService staffService;

	 
	 @Test
     void addStaffTest() {
         Staff staff =  new Staff( 1, "Aditya Patil", "Computer", "aditya123@gmail.com" );
         Staff testStaff = this.staffService.addStaff(staff);
         assertNotNull(testStaff);
     }
     
	 
	 @Test
     void updateStaffTest() {
         StaffDTO staffDTO= new StaffDTO(3, "Mansi Naik", "Electronics", "mansinaik88@gmail.com");
         
         
         try {
            Staff updateStaff = this.staffService.updateStaff(staffDTO);
            assertEquals("3",updateStaff.getStaffName());
         } catch (StaffNotFoundException e) {
             
             e.printStackTrace();
         }
         
         
	 }
	 
}

	


