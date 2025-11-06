package com.eagle0eye.portfolio_api.shared.assets;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter @Setter
public class ReadAsset {
    private String title;
    private String link;
}
