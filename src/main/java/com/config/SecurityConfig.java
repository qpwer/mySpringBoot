package com.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/stu/*").hasRole("Role1")
                .antMatchers("/user/*").hasRole("Role1");
        http.csrf().disable();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())//必须开启加密验证 才能访问成功 不然登录失败
                //添加一个joker_dj用户 账号为joker_dj 密码为加密的密码new BCryptPasswordEncoder().encode("1234")  拥有的权限为 addRole
                .withUser("sec").password(new BCryptPasswordEncoder().encode("1234")).roles("Role1");
    }


}
