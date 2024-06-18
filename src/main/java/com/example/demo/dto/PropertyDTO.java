package com.example.demo.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PropertyDTO {

    private Long id;
    private String title;
    private String description;
    private String ownerName;
    private String ownerEmail;
    private double price;
    private String address;

    @Override
    public String toString() {
        return "PropertyDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerEmail='" + ownerEmail + '\'' +
                ", price=" + price +
                ", address='" + address + '\'' +
                '}';
    }


//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getOwnerName() {
//        return ownerName;
//    }
//
//    public void setOwnerName(String ownerName) {
//        this.ownerName = ownerName;
//    }
//
//    public String getOwnerEmail() {
//        return ownerEmail;
//    }
//
//    public void setOwnerEmail(String ownerEmail) {
//        this.ownerEmail = ownerEmail;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}
