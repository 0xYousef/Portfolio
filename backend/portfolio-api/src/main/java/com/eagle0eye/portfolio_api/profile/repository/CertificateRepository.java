package com.eagle0eye.portfolio_api.profile.repository;

import com.eagle0eye.portfolio_api.profile.model.Certificate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepository extends MongoRepository<Certificate, String> {
}
