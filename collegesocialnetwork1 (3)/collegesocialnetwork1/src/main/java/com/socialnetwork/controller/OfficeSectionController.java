package com.socialnetwork.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.socialnetwork.entity.OfficeSection;
import com.socialnetwork.entity.OfficeSectionDTO;
import com.socialnetwork.exception.OfficeSectionNotFoundException;
import com.socialnetwork.service.OfficeSectionService;



@RestController
@RequestMapping
public class OfficeSectionController {

	@Autowired
	private OfficeSectionService officeSectionService;
	
	@PostMapping("officeSection")
	public OfficeSection addofficeSection(@Valid@RequestBody OfficeSectionDTO officeSectionDTO){
		OfficeSection officeSection = new OfficeSection(officeSectionDTO.getOfficeId(), officeSectionDTO.getDocumentType(), officeSectionDTO.getEndDate());
				return this.officeSectionService.addOfficeSection(officeSection);
	}

	@PutMapping("officeSection")
	public OfficeSection updateofficeSection(@RequestBody OfficeSectionDTO officeSectionDTO) throws OfficeSectionNotFoundException {
		return this.officeSectionService.updateOfficeSection(officeSectionDTO);
	}
	
	@GetMapping("officeSections")
	public List<OfficeSection> getAllOfficeSections(){
		return this.officeSectionService.showOfficeSections();
	}
	
	@GetMapping("officeSection/{id}")
	public OfficeSection getOfficeSectionDetailsById(@Valid@PathVariable("id") Integer officeSectionId) throws OfficeSectionNotFoundException {
		return this.officeSectionService.getOfficeSectionById(officeSectionId);
		
	}
	@DeleteMapping("officeSection/{id}")
	public OfficeSection deleteOfficeSectionById(@PathVariable("id") Integer id )throws  OfficeSectionNotFoundException {
		return this. officeSectionService.deleteOfficeSectionById(id);
	
	}
}

