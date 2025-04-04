package com.JJC.Social_midia.configs;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated());
		
		http.httpBasic(withDefaults()); 

		http.csrf(csrf -> csrf.disable());

		return http.build();
	}

}