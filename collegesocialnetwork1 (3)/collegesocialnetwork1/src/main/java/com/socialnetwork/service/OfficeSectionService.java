package com.socialnetwork.service;
import java.util.List;

import javax.validation.Valid;

import com.socialnetwork.entity.OfficeSection;
import com.socialnetwork.entity.OfficeSectionDTO;
import com.socialnetwork.exception.OfficeSectionNotFoundException;

public interface OfficeSectionService {

	public OfficeSection addOfficeSection(OfficeSection officeSection);

	public OfficeSection updateOfficeSection(OfficeSectionDTO officeSectionDTO)throws OfficeSectionNotFoundException;

	public List<OfficeSection> showOfficeSections();

	public OfficeSection getOfficeSectionById(@Valid Integer officeSectionId) throws OfficeSectionNotFoundException;

	public OfficeSection deleteOfficeSectionById(Integer id) throws OfficeSectionNotFoundException;

	

	





}



