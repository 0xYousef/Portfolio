package com.eagle0eye.metrics_api.assets.service;

import com.eagle0eye.metrics_api.assets.dto.ReadAsset;

import java.util.List;

public interface AssetService {
    List<ReadAsset> viewAssets();
    List<ReadAsset> findAssetsByIds(List<String> id);
    ReadAsset getAssetById(String id);


}
