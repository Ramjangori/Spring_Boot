package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity 
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) {
		   System.out.println("Security locading ");
		
		 http.csrf(Customizer-> Customizer.disable());
		 http.authorizeHttpRequests(auth-> auth.anyRequest().authenticated());
		 http.httpBasic(Customizer.withDefaults());

		// http.sessionManagement(session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		 return http.build();
	}
	
	@Bean
	public UserDetailsService userDetails() {
		   System.out.println("Loading users...");
		UserDetails admin = User.withDefaultPasswordEncoder()
				         .username("Ramjan").password("1234").roles("Adimn").build();
		
		UserDetails user = User.withDefaultPasswordEncoder().username("aman")
				        .password("aman123").roles("User").build();
		
		return new InMemoryUserDetailsManager(admin,user);
	}
}
