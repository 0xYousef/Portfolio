package com.eagle0eye.metrics_api.assets.repository;

import com.eagle0eye.metrics_api.assets.model.Asset;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetsRepository extends MongoRepository<Asset, String> {
    List<Asset> findByIdIn(List<String> ids);

}
