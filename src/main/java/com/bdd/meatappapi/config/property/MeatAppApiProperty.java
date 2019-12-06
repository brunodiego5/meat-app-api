package com.bdd.meatappapi.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("meatapp")
public class MeatAppApiProperty {

	private String originPermitida = "http://localhost";
	
	private final Seguranca seguranca = new Seguranca();
	
	public String getOriginPermitida() {
		return originPermitida;
	}
	
	public Seguranca getSeguranca() {
		return seguranca;
	}

	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}
	
	public static class Seguranca {

		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}

	}
}
