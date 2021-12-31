package com.example.testjava.entity;

import com.example.testjava.annotation.Column;
import com.example.testjava.annotation.Entity;
import com.example.testjava.annotation.Id;
import com.example.testjava.util.SQLDataTypes;

import java.util.HashMap;

@Entity(tableName = "product")
public class Product {

    @Id(autoIncrement = true)
    @Column(columnName = "id", columnType = SQLDataTypes.INTEGER)
    private int id;
    @Column(columnName = "name", columnType = SQLDataTypes.VARCHAR50)
    private String name;
    @Column(columnName = "description", columnType = SQLDataTypes.VARCHAR255)
    private String description;
    @Column(columnName = "price", columnType = SQLDataTypes.DOUBLE)
    private double price;


    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // kiểm tra đối tượng có hợp lệ hay ko
    public boolean isValid() {
        return getErrors().size() == 0  ;
    }
    // trả về danh sách lỗi
    public HashMap<String, String> getErrors(){
        //map chứa thông tin lỗi của đối tượng product
        HashMap<String, String> errors = new HashMap<>();
        if (name == null || name.length() == 0){
            errors.put("name", "Vui long nhap ten san pham.");
        }
        if (description == null || description.length() == 0){
            errors.put("description", "Vui long nhap mo ta cho san pham.");
        }

        if (price == 0){
            errors.put("price", "Vui long nhap gia cho san pham.");
        }
        return errors;
    }
}
