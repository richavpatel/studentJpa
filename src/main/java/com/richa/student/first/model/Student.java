package com.richa.student.first.model;

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
    private List<Address> addressList;

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

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
