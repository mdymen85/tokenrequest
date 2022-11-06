package com.security.tokenrequest;

import feign.RequestInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.security.OAuth2AccessTokenInterceptor;
import org.springframework.cloud.openfeign.security.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.oauth2.client.*;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

import static org.springframework.security.core.authority.AuthorityUtils.createAuthorityList;

@Configuration
public class ServiceToServiceFeignConfiguration  {

    @Bean
    OAuth2AccessTokenInterceptor oAuth2AccessTokenInterceptor(ClientRegistrationRepository clientRegistrationRepository, OAuth2AuthorizedClientService authorizedClientService) {
        return new OAuth2AccessTokenInterceptor("tag-name", new AuthorizedClientServiceOAuth2AuthorizedClientManager(clientRegistrationRepository, authorizedClientService));
    }
}