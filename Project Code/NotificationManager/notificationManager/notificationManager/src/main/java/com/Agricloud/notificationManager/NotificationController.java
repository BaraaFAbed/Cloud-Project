package com.Agricloud.notificationManager;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController{

    private NotificationService notificationService = new NotificationService();// why dont we do this in the constructor (same applies for the other controller classes)

    @PostMapping(path = "/notifications")
    public Notification addNotif(@RequestBody Notification notif){
        // ID from DB here instead of service class?
        return notificationService.addNotif(notif);
    }

    @PostMapping(path = "/preferences")
    public Preference addPref(@RequestBody Preference pref){
    	pref.setEmail(pref.getEmail().toLowerCase());
    	pref.setUsername(pref.getUsername().toLowerCase());
    	return notificationService.addPref(pref);
    }

    @PutMapping(path = "/preferences/{username}")
    public Preference updatePref(@PathVariable("username")String username, @RequestBody Preference pref){
        pref.setUsername(username.toLowerCase());
        return notificationService.updatePref(pref);
    }

    @GetMapping(path = "/notifications/{username}")
    public ArrayList<Notification> getNotif(@PathVariable("username")String username){
        return notificationService.getNotif(username.toLowerCase());
    }
}