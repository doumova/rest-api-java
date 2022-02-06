package com.restapi.dynamiccontent.restapidynamiccontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhotoPresenterController {
	@Autowired
	PhotoRepositoryController photoRepositoryController;
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/getAllPhotos")
	public List<Photos>getAllPhotos(){
		return photoRepositoryController.getAllPhotos();
	}

}
