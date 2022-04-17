package com.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration //설정
@EnableWebSecurity
//WebSecurityConfigurerAdapter 상속 받는 클래스에 @EnableWebSecurity 선언을 하면
//SpringSecurityFilterChain이 자동 포함 메소드를 오버라이딩 할 수 있다
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception{

    }
    @Bean // 원두 -> 객체 빈객체 -> SpringContainer  들어감. 이 객체 하나로 돌려씀 (싱글톤)
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();  // 비밀번호를 암호화하는 해시함수
    }
    // 디코더 없음

}
