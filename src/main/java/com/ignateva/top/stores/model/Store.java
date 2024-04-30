package com.ignateva.top.stores.model;

public class Store {

    private int id;
    private String title;
    private String address;
    private String phone;
    private String email;
    private String site;
    private int categoryid;
    private String description;

    public Store() {
    }

    public Store(String title, String address, String phone, String email, String site, int categoryid, String description) {
        this.title = title;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.site = site;
        this.categoryid = categoryid;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getCategoryid() {
        return categoryid;
    }
    public String getCategoryName() {
        switch (categoryid)
        {
            case 1: return  "Food";
            case 2: return  "House";
            case 3: return "Sport";
            case 4: return " Pet";
        }
        return "unknown category";
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
