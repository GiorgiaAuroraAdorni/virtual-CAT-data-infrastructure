package com.online.cat.helper;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("cat.itas")
public class ItasModelProperties {
	
	private Model model;
	
	@Getter
	@Setter
	public static class Model{
		private String path;
		private final boolean constrained = false;
	}
}
