package sky.demo.oauth2resource.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * 资源服务器配置
 */
@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET,"/test").permitAll()
                .antMatchers(HttpMethod.GET,"/tt1").hasRole("USER")
                .antMatchers(HttpMethod.GET,"/tt2").hasAuthority("ROLE_USER")
                .antMatchers(HttpMethod.GET,"/tt3").hasAuthority("USER")
                .anyRequest().authenticated();
    }

}

