package com.example.productmanagement.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    @Bean
    public MongoTemplate mongoTemplate() {
        ConnectionString connectionString = new ConnectionString("mongodb://user_43ascdexz:p43ascdexz@bytexldb.com:5050/db_43ascdexz?authSource=db_43ascdexz");
        return new MongoTemplate(MongoClients.create(connectionString), "db_43ascdexz");
    }
}
