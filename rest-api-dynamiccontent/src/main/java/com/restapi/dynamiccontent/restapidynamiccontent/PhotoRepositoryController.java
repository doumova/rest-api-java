package com.restapi.dynamiccontent.restapidynamiccontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhotoRepositoryController {
	@Autowired
	PhotoRepository photoRepository;
	
	
	public List<Photos>getAllPhotos(){
		return photoRepository.findAll();
	}
	

}
