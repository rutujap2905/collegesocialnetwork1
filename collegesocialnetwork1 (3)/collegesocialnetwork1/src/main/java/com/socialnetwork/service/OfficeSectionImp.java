package com.socialnetwork.service;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.socialnetwork.entity.OfficeSection;
import com.socialnetwork.entity.OfficeSectionDTO;
import com.socialnetwork.exception.OfficeSectionNotFoundException;
import com.socialnetwork.repository.OfficeSectionRepository;


@Service
public class OfficeSectionImp implements OfficeSectionService {
	
	@Autowired
	private OfficeSectionRepository officeSectionRepo;
	
	@Override
	public OfficeSection addOfficeSection(OfficeSection officeSection) {
		return this.officeSectionRepo.save(officeSection);
	}
	
	@Override
	public OfficeSection updateOfficeSection(OfficeSectionDTO officeSectionDTO) throws OfficeSectionNotFoundException {
		Optional<OfficeSection> officeSectionOpt = this.officeSectionRepo.findById(officeSectionDTO.getOfficeId());
		if(officeSectionOpt.isEmpty())
			throw new OfficeSectionNotFoundException("office section id does not exist to update. ");
		OfficeSection updateOfficeSection = officeSectionOpt.get();
		updateOfficeSection.setDocumentType(officeSectionDTO.getDocumentType());
		updateOfficeSection.setLocalDate(officeSectionDTO.getEndDate());
		return this.officeSectionRepo.save(updateOfficeSection);
		
		
	}
	
	@Override
	public List<OfficeSection> showOfficeSections() {
		
		return this.officeSectionRepo.findAll();
	}

	@Override
	public OfficeSection getOfficeSectionById(@Valid Integer officeSectionId) throws OfficeSectionNotFoundException {
		Optional<OfficeSection> officeSectionOpt=this.officeSectionRepo.findById(officeSectionId);
		if(officeSectionOpt.isEmpty())
			throw new OfficeSectionNotFoundException("Id Not Found ");
		return officeSectionOpt.get();
	}

	@Override
	public OfficeSection deleteOfficeSectionById(Integer id) throws OfficeSectionNotFoundException {
		Optional<OfficeSection> optofficeSection = this.officeSectionRepo.findById(id);
		if(optofficeSection.isEmpty())
			throw new OfficeSectionNotFoundException("Office Section Id does not exists to delete.");
		this.officeSectionRepo.deleteById(id);
		return optofficeSection.get();
	}
	

	
}
