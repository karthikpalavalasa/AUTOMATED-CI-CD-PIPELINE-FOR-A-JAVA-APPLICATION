package com.karthikraj.ProfileApplication.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.karthikraj.ProfileApplication.Model.ProfileTable;
import com.karthikraj.ProfileApplication.ProfileRepository.ProfileRepo;

@Service
public class ProfileService {
	ArrayList<ProfileTable> list=new ArrayList<>();
	@Autowired
	ProfileRepo profileRepository;
	public ArrayList<ProfileTable> getProfile() {
		return  (ArrayList<ProfileTable>) profileRepository.findAll();
	}
	public  ProfileTable setProfile(ProfileTable details) {
		return profileRepository.save(details);
	}

}
