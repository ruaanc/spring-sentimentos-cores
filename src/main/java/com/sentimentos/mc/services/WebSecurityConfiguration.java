package com.sentimentos.mc.services;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	    @Override
	    public void configure(HttpSecurity http) throws Exception {
	       http.csrf().disable().authorizeRequests()
	        .antMatchers("/dados").permitAll()
	        .antMatchers(HttpMethod.POST,"/dados").permitAll()
	        .antMatchers(HttpMethod.POST, "/dados").permitAll()
	        .antMatchers(HttpMethod.POST,"/dados/{id}").permitAll()
	        .antMatchers(HttpMethod.GET,"/dados/*").permitAll()
	         .antMatchers(HttpMethod.GET,"/dados").permitAll()
		        .antMatchers("/cores").permitAll()
		        .antMatchers(HttpMethod.POST,"/cores").permitAll()
		        .antMatchers(HttpMethod.POST, "/cores").permitAll()
		        .antMatchers(HttpMethod.POST,"/cores/{id}").permitAll()
		        .antMatchers(HttpMethod.GET,"/cores/*").permitAll()
		         .antMatchers(HttpMethod.GET,"/cores").permitAll()
		         .antMatchers(HttpMethod.PUT,"/cores/*").permitAll()
	         .antMatchers(HttpMethod.PUT,"/dados/*").permitAll().anyRequest().authenticated();
	       

	       	
	    }

}
