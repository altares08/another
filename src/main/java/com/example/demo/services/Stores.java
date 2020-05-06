package com.example.demo.services;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface Stores {
    String getStoresByZipCode(final String zipcode) throws JsonProcessingException;
}
