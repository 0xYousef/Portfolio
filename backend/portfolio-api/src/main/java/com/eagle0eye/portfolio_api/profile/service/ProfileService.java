package com.eagle0eye.portfolio_api.profile.service;

import com.eagle0eye.portfolio_api.profile.dto.*;
import org.apache.catalina.User;

import java.util.List;

public interface ProfileService {
    List<ServiceDTO> getServices();
    UserInfoDTO getUserInfo();
    AboutUser getAboutUser();
    List<AccountDTO> getAccounts();
}
