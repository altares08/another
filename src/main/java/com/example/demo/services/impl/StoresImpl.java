package com.example.demo.services.impl;

import com.example.demo.services.Stores;
import com.example.demo.Entity.repository.StoresRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoresImpl implements Stores {

    @Autowired
    private StoresRepository storesRepository;

    @Override
    public String getStoresByZipCode(final String zipcode) throws JsonProcessingException {
        List<com.example.demo.Entity.Stores> storesList = storesRepository.findByZipcode(zipcode);
        StringBuffer storeData = new StringBuffer();
        if (storesList.isEmpty()) {
            return "No Stores found for the zip code "+zipcode;
        }
        for (com.example.demo.Entity.Stores store : storesList) {
            storeData.append(store.getStoreName());
            storeData.append(System.lineSeparator());
            storeData.append(store.getStoreAddress1());
            storeData.append(System.lineSeparator());
            storeData.append(store.getStoreAddress2());
            storeData.append(System.lineSeparator());
            storeData.append("https://www.google.com/maps/search/?api=1&query="+store.getLatitude()+","+store.getLongitude());
            storeData.append(System.lineSeparator());
            storeData.append(System.lineSeparator());
        }
        return storeData.toString();
    }
}
