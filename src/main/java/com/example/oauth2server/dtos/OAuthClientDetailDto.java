package com.example.oauth2server.dtos;


import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OAuthClientDetailDto {
    private String clientId;
    private String clientSecret;
    private String scope;
    private String authorizedGrantTypes;
    private String webServerRedirectUri;
    private String authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    private String additionalInformation;
    private String autoapprove;
    private Long resourceId;
}
