package com.mjukvare.demos.persistence;

 import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InMemoryUserRepository implements UserRepository {
    @Override
    public String getUsername() {
        log.info("Getting username");

        return "hello";
    }
}
