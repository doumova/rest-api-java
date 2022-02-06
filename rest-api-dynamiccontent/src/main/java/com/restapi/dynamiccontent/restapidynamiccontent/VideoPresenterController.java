package com.restapi.dynamiccontent.restapidynamiccontent;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoPresenterController {
	@Autowired
    VideoRepositoryController videoRepositoryController;
      
    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String HomePage(){
        return "Bienvenue Modou";
    }
    
    
    @RequestMapping(method = RequestMethod.GET, path = "/GetVideos")
    public String HomePage1(){
        return "Bienvenue chez moi";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/GetVideos/{videoTopic}")
    public String GetVideos(@PathVariable String videoTopic){
        switch(videoTopic){
            case "python":
                return "This is all our Python videos";
            case "java":
                return "This is all our Java videos";
            case "html/css":
                return "This is all our Html/css videos";
            case "ruby":
                return "This is all our Ruby videos";
            default:
                return "Sorry, we don't found your search";
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getAll")
    public List<Videos> getAllVideos(){
        return videoRepositoryController.getAllVideos();
    }
    
}
