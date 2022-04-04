package com.example.testapi.controller;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.auth.WebIdentityTokenCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.retry.PredefinedBackoffStrategies;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsync;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBAsyncClientBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
@RequestMapping("/api/v1/sdktest")
public class SdkTestServiceController {
    ;
//    @GetMapping()
//    @ResponseBody
//    public String sdkTest() throws InterruptedException, UnknownHostException {
//        return dynamoDBClient().describeTable("test-table").toString();
//    }
//
//    AmazonDynamoDBAsync dynamoDBClient() {
//        RetryPolicy retryPolicy = new RetryPolicy(
//                null,
//                null,
//                PredefinedRetryPolicies.DYNAMODB_DEFAULT_MAX_ERROR_RETRY,
//                false
//        );
//        ClientConfiguration config = new ClientConfiguration();
//
//        config.setMaxConnections(5);
//
//        {
//
//            return AmazonDynamoDBAsyncClientBuilder.standard().withCredentials()
//                    .withClientConfiguration(config)
//                    .withRegion(Regions.fromName("us-east-1"))
//                    .build();
//        }
//    }
}
