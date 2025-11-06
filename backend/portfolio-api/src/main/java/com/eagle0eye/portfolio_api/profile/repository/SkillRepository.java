package com.eagle0eye.portfolio_api.profile.repository;

import com.eagle0eye.portfolio_api.profile.model.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends MongoRepository<Skill, String> {
}
