package com.abha.doms.config.cloud;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig {
    private final AwsCloudConfig awsCloudConfig;

    public CloudConfig(CloudConfigMap cloudConfigMap) {
        this.awsCloudConfig = cloudConfigMap.getAws();
    }

    @Bean
    public AmazonS3 getS3Client(){
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(
                awsCloudConfig.getCredential().getAccessKey(),
                awsCloudConfig.getCredential().getSecretKey());
        return AmazonS3ClientBuilder.standard()
                .withRegion(awsCloudConfig.getRegion())
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .build();
    }
}
