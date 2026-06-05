package com.ramjan.springsecurity0001.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfToken;

@Configuration
@EnableWebSecurity
public class Springsecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/getUsers").permitAll()
                        .requestMatchers("/getdoctors").hasRole("ADMIN")
                        .requestMatchers("/Students").hasRole("TEACHER")
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults());

        http.csrf(csrf->csrf.disable());
        return http.build();
    }

     @Bean
     public UserDetailsService userDetailsService(){

         UserDetails user1 = User.withUsername("RamjanAdmin").password("{noop}1234").roles("ADMIN").build();
         UserDetails user2 = User.withUsername("RohitDoctor").password("{noop}1234").roles("DOCTOR").build();
         UserDetails user3 = User.withUsername("AmanAdmin").password("{noop}1234").roles("TEACHER").build();

         return  new InMemoryUserDetailsManager(user1,user2,user3);



     }


}
