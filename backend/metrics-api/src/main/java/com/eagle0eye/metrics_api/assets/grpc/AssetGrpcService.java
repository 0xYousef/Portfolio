package com.eagle0eye.metrics_api.assets.grpc;
import com.eagle0eye.metrics_api.assets.dto.ReadAsset;
import com.eagle0eye.metrics_api.assets.service.AssetServiceImpl;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@RequiredArgsConstructor
@GrpcService
public class AssetGrpcService extends AssetServiceGrpc.AssetServiceImplBase {

    private final AssetServiceImpl assetService;

    @Override
    public void getAssetById(AssetRequest request, StreamObserver<AssetResponse> responseObserver) {
        ReadAsset asset = assetService.getAssetById(request.getId());
        if (asset != null) {
            System.out.println(asset.getTitle()+asset.getTitle());
            AssetResponse response = AssetResponse.newBuilder()
                    .setTitle(asset.getTitle())
                    .setLink(asset.getLink())
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getAssetsByIds(AssetIdsRequest request, StreamObserver<AssetResponse> responseObserver) {
        assetService.findAssetsByIds(request.getIdsList()).forEach(asset -> {
            AssetResponse response = AssetResponse.newBuilder()
                    .setTitle(asset.getTitle())
                    .setLink(asset.getLink())
                    .build();
            responseObserver.onNext(response);
        });
        responseObserver.onCompleted();
    }
}
