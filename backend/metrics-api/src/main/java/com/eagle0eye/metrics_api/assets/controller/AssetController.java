package com.eagle0eye.metrics_api.assets.controller;

import com.eagle0eye.metrics_api.assets.dto.ReadAsset;
import com.eagle0eye.metrics_api.assets.service.AssetServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/portfolio/api/media")
public class AssetController {

    private final AssetServiceImpl assetService;


    @GetMapping("/")
    public ResponseEntity<List<ReadAsset>> getAllAssets() {
        return ResponseEntity.ok(assetService.viewAssets());
    }
    @GetMapping("/links")
    public ResponseEntity<List<ReadAsset>> getAllAssets(@RequestParam List<String> ids) {
        return ResponseEntity.ok(assetService.findAssetsByIds(ids));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReadAsset> getAssetById(@PathVariable String id) {
        ReadAsset asset = assetService.getAssetById(id);
        if (asset == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(asset);
    }

}
