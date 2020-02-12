package com.richa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
   @Id
   @GeneratedValue
    private int id;
    private String fName;
    private String lName;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<StudentAddress> addressList;

    public Student() {
    }

    public Student(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public List<StudentAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<StudentAddress> addressList) {
        this.addressList = addressList;
    }
}
