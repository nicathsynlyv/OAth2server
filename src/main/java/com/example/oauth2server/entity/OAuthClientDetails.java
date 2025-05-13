package com.example.oauth2server.entity;

import com.example.oauth2server.resources.Resource;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "oauth_client_details")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OAuthClientDetails {
    @Id
    @Column(name = "client_id")
    private String clientId;

    @Column(name = "client_secret")
    private String clientSecret;

    private String scope;
    private String authorizedGrantTypes;
    private String webServerRedirectUri;
    private String authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    private String additionalInformation;
    private String autoapprove;

//    @OneToMany(mappedBy = "oauthClient")
//    private List<Resource> resources;

    @ManyToOne
    @JoinColumn(name = "resource_ids", referencedColumnName = "id")
    private Resource resource;
}
