package com.eagle0eye.portfolio_api.profile.repository;

import com.eagle0eye.portfolio_api.profile.model.Volunteer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteerRepository extends MongoRepository<Volunteer, String> {
}
