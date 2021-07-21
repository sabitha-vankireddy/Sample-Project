package com.observepoint.test.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sabitha.vankireddy
 */
@Entity
@Table
public class Employees {

    //Defining employee id as primary key
    @Id
    @Column
    private int empid;
    @Column
    private String empname;
    @Column
    private int empage;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }


}
