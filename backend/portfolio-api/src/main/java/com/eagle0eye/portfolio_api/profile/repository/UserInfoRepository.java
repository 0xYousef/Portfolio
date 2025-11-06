package com.eagle0eye.portfolio_api.profile.repository;

import com.eagle0eye.portfolio_api.profile.model.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends MongoRepository<UserInfo,String> {
}
