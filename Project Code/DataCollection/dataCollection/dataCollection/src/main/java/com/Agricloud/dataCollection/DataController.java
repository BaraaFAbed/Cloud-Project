package com.Agricloud.dataCollection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController{

    private DataService dataService = new DataService();
    
    @GetMapping(path = "/data/{username}")
    public ArrayList<Entry> getData(@PathVariable("username")String username){
        return dataService.getData(username);
    }

    @GetMapping(path = "/data/{username}/entries/{numEntries}")  // this is probably wrong ngl
    public List<Entry> getEntries(@PathVariable("username")String username, @PathVariable("numEntries")int numEntries){
        return dataService.getEntries(username, numEntries);
    }
}