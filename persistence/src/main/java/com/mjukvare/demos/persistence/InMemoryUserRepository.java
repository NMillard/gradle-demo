package com.mjukvare.demos.persistence;

public class InMemoryUserRepository implements UserRepository {
    @Override
    public String getUsername() {
        return "hello";
    }
}
