package com.dianrong.common.uniauth.client.custom.redirect;

import com.dianrong.common.uniauth.client.custom.model.SimpleRedirectInfo;
import com.dianrong.common.uniauth.common.cons.AppConstants;
import javax.servlet.http.HttpServletRequest;

public class SimpleRedirectFormat implements UniauthRedirectFormat {

  @Override
  public Object getRedirectInfo(HttpServletRequest request, String loginUrl) {
    return new SimpleRedirectInfo(AppConstants.LOGIN_REDIRECT_URL, loginUrl);
  }
}
