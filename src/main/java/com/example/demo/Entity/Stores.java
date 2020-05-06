package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stores")
public class Stores {

    @Id
    private String storeId;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "store_name")
    private String storeName;

    private String latitude;

    private String longitude;

    @Column(name = "store_address1")
    private String storeAddress1;

    @Column(name = "store_address2")
    private String storeAddress2;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStoreAddress1() {
        return storeAddress1;
    }

    public void setStoreAddress1(String storeAddress1) {
        this.storeAddress1 = storeAddress1;
    }

    public String getStoreAddress2() {
        return storeAddress2;
    }

    public void setStoreAddress2(String storeAddress2) {
        this.storeAddress2 = storeAddress2;
    }
}
