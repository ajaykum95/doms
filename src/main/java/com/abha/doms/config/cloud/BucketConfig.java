package com.abha.doms.config.cloud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BucketConfig {
    private Bucket publicBucket;
    private Bucket privateBucket;
}
