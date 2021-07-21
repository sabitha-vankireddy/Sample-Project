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
public class Departments {

    //Defining department id as primary key
    @Id
    @Column
    private int depid;
    @Column
    private String depname;
    @Column
    private String dephead;

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getDephead() {
        return dephead;
    }

    public void setDephead(String dephead) {
        this.dephead = dephead;
    }


}
