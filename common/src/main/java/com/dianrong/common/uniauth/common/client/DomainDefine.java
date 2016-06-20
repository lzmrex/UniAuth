package com.dianrong.common.uniauth.common.client;

import java.io.Serializable;

public class DomainDefine implements Serializable {
	private String domainCode;
	private String userInfoClass;
	private boolean rejectPublicInvocations;
	private String customizedSavedRequestUrl; 
	
	private static Integer domainId;

	public String getDomainCode() {
		return domainCode;
	}

	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
	}

	public String getUserInfoClass() {
		return userInfoClass;
	}

	public void setUserInfoClass(String userInfoClass) {
		this.userInfoClass = userInfoClass;
	}

	public boolean isRejectPublicInvocations() {
		return rejectPublicInvocations;
	}

	public void setRejectPublicInvocations(boolean rejectPublicInvocations) {
		this.rejectPublicInvocations = rejectPublicInvocations;
	}

	public String getCustomizedSavedRequestUrl() {
		return customizedSavedRequestUrl;
	}

	public void setCustomizedSavedRequestUrl(String customizedSavedRequestUrl) {
		this.customizedSavedRequestUrl = customizedSavedRequestUrl;
	}
	
}
