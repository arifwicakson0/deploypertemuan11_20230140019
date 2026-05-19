package com.deploy.pertemuan11.repository;

import org.springframework.stereotype.Repository;
import com.deploy.pertemuan11.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String> {

}