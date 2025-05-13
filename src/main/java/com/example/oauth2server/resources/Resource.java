package com.example.oauth2server.resources;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "resources")
//@Getter
//@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String resourceName;

    private String owner;

    private String note;

    private LocalDateTime createdAt;
}
