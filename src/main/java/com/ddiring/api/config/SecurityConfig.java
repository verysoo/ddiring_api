package com.ddiring.api.config;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@AllArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                    .antMatchers("/api/**").permitAll();

        http.csrf()
                .disable()
                .headers()
                .frameOptions()
                .disable();
    }


    /*@Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic().disable(); // rest api 이므로 기본설정 사용안함
        http.csrf()
                .disable()
                .headers()
                .frameOptions()
                .disable();

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.authorizeRequests()
                    .antMatchers("/api/**").permitAll()
                    .anyRequest().hasRole("USER") // 그외 나머지 요청은 모두 인증된 회원만 접근 가능
                .and()
                    // 403 예외처리 핸들링
                    .exceptionHandling().accessDeniedPage("/user/denied");

    }*/


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
