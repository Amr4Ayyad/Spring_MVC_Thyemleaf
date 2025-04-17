package com.amr.journey.StoreCrudOperations.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDTO {
    @NotEmpty(message = "Name is required")
    private String name;
    @NotEmpty(message = "Brand is required")
    private String brand;
    @Min(0)
    private double price;
    @NotEmpty(message = "Description is required")
    @Size(min = 10, message = "The description must be at least 10 characters long")
    @Size(max = 200, message = "The description cannot exceed 200 characters")
    private String description;
    private MultipartFile imageFileName;
    private String imageFileNameString;

    // Add getter and setter for the new field in ProductDTO.java
    public String getImageFileNameString() {
        return imageFileNameString;
    }

    public void setImageFileNameString(String imageFileNameString) {
        this.imageFileNameString = imageFileNameString;
    }

    public @NotEmpty(message = "Name is required") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Name is required") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Brand is required") String getBrand() {
        return brand;
    }

    public void setBrand(@NotEmpty(message = "Brand is required") String brand) {
        this.brand = brand;
    }


    public @NotEmpty(message = "Description is required") @Size(min = 10, message = "The description must be at least 10 characters long") @Size(max = 200, message = "The description cannot exceed 200 characters") String getDescription() {
        return description;
    }

    public void setDescription(@NotEmpty(message = "Description is required") @Size(min = 10, message = "The description must be at least 10 characters long") @Size(max = 200, message = "The description cannot exceed 200 characters") String description) {
        this.description = description;
    }

    @Min(0)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(0) double price) {
        this.price = price;
    }

    public MultipartFile getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(MultipartFile imageFileName) {
        this.imageFileName = imageFileName;
    }
}
