//package com.JPA.JPArelation.Config;
//
//import com.fasterxml.jackson.core.JsonFactory;
//import com.fasterxml.jackson.core.StreamWriteConstraints;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JacksonConfig {
//
//    @Bean
//    public ObjectMapper objectMapper(){
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonFactory jsonFactory = objectMapper.getFactory();
//        StreamWriteConstraints constraints = StreamWriteConstraints.builder()
//                .maxNestingDepth(2000)
//                .build();
//
//        jsonFactory.setStreamWriteConstraints(constraints);
//        return objectMapper;
//    }
//}
