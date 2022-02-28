package com.hyperskill.springmvcdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// Extending the adapter and adding the annotation
@EnableWebSecurity
public class WebSecurityConfigurerImpl extends WebSecurityConfigurerAdapter {

    // Acquiring the builder
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // storing users in memory
        auth.inMemoryAuthentication()
                .withUser("user1").password(getEncoder().encode("pass1")).roles()
                .and()
                .withUser("user2").password(getEncoder().encode("pass2")).roles("USER")
                .and()
                .withUser("user3").password(getEncoder().encode("pass3")).roles("ADMIN")
                .and()
                .passwordEncoder(getEncoder());
    }

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic();
        http.authorizeRequests()
//               Caution: antMatchers will cause a huge security problem! Any authenticated user can access /admin/  because  .mvcMatchers("/**").authenticated()
//                .antMatchers("/admin").hasRole("ADMIN")
                .mvcMatchers("/admin").hasRole("ADMIN")
                .mvcMatchers("/user", "/test").hasAnyRole("ADMIN", "USER")
                .mvcMatchers("/", "/public").permitAll()
                .mvcMatchers("/**").authenticated()
                .and().httpBasic()
                .and().formLogin()
//        Cross-Site Request Forgery is enabled by default.
                .and().csrf().disable();
    }






}
