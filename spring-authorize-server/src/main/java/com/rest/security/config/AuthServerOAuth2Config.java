package com.rest.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AuthServerOAuth2Config extends GlobalAuthenticationConfigurerAdapter{
	
	private PasswordEncoder passwordEncoder;
	
	public AuthServerOAuth2Config(PasswordEncoder passwordEncoder){
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.passwordEncoder(passwordEncoder)
		.withUser("user").password("$2a$10$xR60MzthDxsW6kUuDvC0lOqgJZK.WTVGHyNmZlz8TUmV6Sfnf1rz.").roles("USER")
		.and()
		.withUser("user1").password("$2a$10$D/1yG1xe4dQAIJTwUeUSieYH4UMAj4D/W416PMYpTkX3NFtTkEFUi").roles("ADMIN");
	}

}
