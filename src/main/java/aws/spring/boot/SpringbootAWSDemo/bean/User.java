/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aws.spring.boot.SpringbootAWSDemo.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author wajid
 */
@Entity
public class User implements Serializable {

    public User() {
    }

    public User(int id, String fname, String lname, String dept, String degree, String institute) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.dept = dept;
        this.degree = degree;
        this.institute = institute;
    }
    
    @Id
    @Column(name="id")
    int id;
    @Column(name="fname")
    String fname;
    @Column(name="lname")
    String lname;
    @Column(name="dept")
    String dept;
    @Column(name="degree")
    String degree;
    @Column(name="institute")
    String institute;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", dept=" + dept + ", degree=" + degree + ", institute=" + institute + '}';
    }
    
}
