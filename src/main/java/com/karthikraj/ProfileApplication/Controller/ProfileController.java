package com.karthikraj.ProfileApplication.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.karthikraj.ProfileApplication.Model.ProfileTable;
import com.karthikraj.ProfileApplication.Service.ProfileService;

@RestController
@RequestMapping("/Home")
public class ProfileController {
    @Autowired
	public ProfileService profileService;
   
  
    @GetMapping("/get")
	public ArrayList<ProfileTable> getProfile() {
		return profileService.getProfile();
	}
   
    @PostMapping("/post")
    public ProfileTable setProfile(@RequestBody ProfileTable d) {
		return profileService.setProfile(d);
	}
}
