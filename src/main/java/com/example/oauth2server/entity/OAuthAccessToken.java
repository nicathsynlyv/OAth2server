package com.example.oauth2server.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "oauth_access_token")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OAuthAccessToken implements Serializable {
    @Id
    private String tokenId;

    private String authenticationId;

    //    @Lob
    @Column(columnDefinition = "bytea")
    private byte[] token;

    //    @Lob
    @Column(columnDefinition = "bytea")
    private byte[] authentication;

    private String userName;

    private String clientId;

    private String refreshToken;
}
