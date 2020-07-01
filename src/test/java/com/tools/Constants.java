package com.tools;

import java.io.File;

public class Constants {
	
	public static final String CONFIG_RESOURCES_PATH = "src" + File.separator + "test" + File.separator + "resources" + File.separator + "config" + File.separator;
	public static final String TEMP_RESOURCES_PATH = "target" + File.separator;


	public static final String API_REQRES_CREATE_USER = "/api/users";
	
	
	// key matches the item found in the src/test/resources/config/local-config.properties
	public static String BASE_URL = ConfigUtils.getProperty("API_BASE_URL");
}
