package com.bdd.meatappapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import com.bdd.meatappapi.config.token.CustomTokenEnhacer;

@Profile("oauth-security")
@Configuration
public class AuthorizationServerConfig  extends AuthorizationServerConfigurerAdapter {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;	
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
				.withClient("angular")
				.secret("$2a$10$hq60dvZ7cWaakJ/60OYdTemfUMJ1SX7ZZAVqKYMi2cFzWkLG6QGfq") // @ngul@r0
				.scopes("read", "write") //* <= string não define
				.authorizedGrantTypes("password", "refresh_token")   /* qual fluxo utilizar */
				.accessTokenValiditySeconds(1800) /*quanto tempo o access toke vai funcionar*/
				.refreshTokenValiditySeconds(3600 * 24)
			.and()
				.withClient("mobile")
				.secret("$2a$10$HhaLplvjJna5nNdUqcyhbOF0CnRwQpspNjCOe6jWI8PHZ5C8KeC8y") //m0b1l30
				.scopes("read") //* <= string não define
				.authorizedGrantTypes("password", "refresh_token")   /* qual fluxo utilizar */
				.accessTokenValiditySeconds(1800) /*quanto tempo o access toke vai funcionar*/
				.refreshTokenValiditySeconds(3600 * 24);    /*um dia */
	}
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
		tokenEnhancerChain.setTokenEnhancers(Arrays.asList(tokenEnhancer(), accessTokenConverter()));
		
		endpoints
			.tokenStore(tokenStore())    /*onde armazenar a string do token*/
			.tokenEnhancer(tokenEnhancerChain)
			.reuseRefreshTokens(false) /*Não reutilizar o refresh_token*/
			.userDetailsService(userDetailsService)
			.authenticationManager(authenticationManager); /*injetar a autentificação*/
	}
	

	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter(); 
		accessTokenConverter.setSigningKey("meat-api-password");
		return accessTokenConverter;
	}

	@Bean
	public TokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}
	
	@Bean
	public TokenEnhancer tokenEnhancer() {
		return new CustomTokenEnhacer();
	}


}
