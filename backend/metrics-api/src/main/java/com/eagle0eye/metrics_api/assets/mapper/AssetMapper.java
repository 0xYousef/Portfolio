package com.eagle0eye.metrics_api.assets.mapper;

import com.eagle0eye.metrics_api.assets.dto.ReadAsset;
import com.eagle0eye.metrics_api.assets.model.Asset;

public class AssetMapper {
    public static ReadAsset assetToReadAsset(Asset asset) {
        return ReadAsset.builder()
                .title(asset.getTitle())
                .link(asset.getLink())
                .build();
    }
}
