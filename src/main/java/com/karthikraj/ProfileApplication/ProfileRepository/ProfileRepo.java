package com.karthikraj.ProfileApplication.ProfileRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.karthikraj.ProfileApplication.Model.ProfileTable;

public interface ProfileRepo extends JpaRepository<ProfileTable, Integer> {




}
