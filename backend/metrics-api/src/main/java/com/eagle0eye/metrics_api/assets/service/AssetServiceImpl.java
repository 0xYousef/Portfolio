package com.eagle0eye.metrics_api.assets.service;

import com.eagle0eye.metrics_api.assets.dto.ReadAsset;
import com.eagle0eye.metrics_api.assets.model.Asset;
import com.eagle0eye.metrics_api.assets.repository.AssetsRepository;
import com.eagle0eye.metrics_api.mapper.AssetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AssetServiceImpl implements AssetService {

    private final AssetsRepository assetRepository;

    @Override
    public List<ReadAsset> viewAssets() {
        return assetRepository.findAll().stream().map(AssetMapper::assetToReadAsset).toList();
    }

    @Override
    public List<ReadAsset> findAssetsByIds(List<String> ids) {
        return assetRepository.findByIdIn(ids)
                .stream()
                .map(AssetMapper::assetToReadAsset)
                .toList();
    }

    @Override
    public ReadAsset getAssetById(String id) {
        Optional<Asset> asset = assetRepository.findById(id);
        return asset.map(AssetMapper::assetToReadAsset).orElse(null);
    }

    public Resource loadFileAsResource(String path) {
        File file = new File(path);
        return file.exists() ? new FileSystemResource(file) : null;
    }
}