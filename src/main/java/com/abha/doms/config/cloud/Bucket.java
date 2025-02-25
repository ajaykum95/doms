package com.abha.doms.config.cloud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bucket {
    private String name;
    private String path;
    private long expirationTime;
}
