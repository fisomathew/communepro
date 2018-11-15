package com.commune.communepro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * This settings are for getting h2 console. Can be removed.
         */
        http.headers().frameOptions().disable();
        /**
         * Spring security related configuration.
         */
        http
                .authorizeRequests()
                .antMatchers("/css/**" ,"/fonts/**", "/img/**", "/js/**", "/index").permitAll()
                //.antMatchers("/pboard/**").hasRole("Board")
                .and()
                .formLogin()
                .loginPage("/login").failureUrl("/login-error").and()
                .csrf().disable();
    }

}
