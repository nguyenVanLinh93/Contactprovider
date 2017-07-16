package com.example.nguyenlinh.contactprovider;

/**
 * Created by nguyenlinh on 16/07/2017.
 */

public class Contact {
    private String _ID;
    private String name;
    private String phoneNumber;

    public Contact(String _ID, String name, String phoneNumber) {
        this._ID = _ID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String get_ID() {
        return _ID;
    }

    public void set_ID(String _ID) {
        this._ID = _ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
