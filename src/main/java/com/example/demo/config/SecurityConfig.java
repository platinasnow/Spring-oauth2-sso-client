package com.example.demo.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	//Security URL 설정
	@Override
	public void configure(HttpSecurity http) throws Exception{
		http.antMatcher("/**")
			.authorizeRequests()
			.antMatchers("/", "/login**", "/home")
			.permitAll()
			.anyRequest()
			.authenticated();
	}

}
