package com.juaracoding.ujian6.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {

	@Value("${browser}")
	private String browser;
	
	@Value("${myusername}")
	private String userName;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${displayname}")
	private String displayName;
	
	@Value("${displayname1}")
	private String displayName1;
	
	@Value("${displayname2}")
	private String displayName2;
	
	@Value("${displayname3}")
	private String displayName3;
	
	@Value("${search}")
	private String search;
	
	@Value("${txtdashboard}")
	private String txtDashboard;

	public String getBrowser() {
		return browser;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public String getDisplayName1() {
		return displayName1;
	}
	
	public String getDisplayName2() {
		return displayName2;
	}
	
	public String getDisplayName3() {
		return displayName3;
	}
	
	public String getSearch() {
		return search;
	}
	
	public String getTxtDashboard() {
		return txtDashboard;
	}
	
}
