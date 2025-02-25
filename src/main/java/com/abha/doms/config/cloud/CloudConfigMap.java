package com.abha.doms.config.cloud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("cloud")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CloudConfigMap {
    private AwsCloudConfig aws;
}
