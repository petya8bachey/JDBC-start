package org.petya8bachey.domain;

import java.util.Date;
import javax.persistence.*;

import static java.lang.String.valueOf;

@Entity
public class Employee {
    @Id
    @GeneratedValue()
    public Integer ID;
    public String firstname;
    public String lastname;
    public String address;
    @ManyToOne
    public Department affiliation;
    @Temporal(TemporalType.DATE)
    public Date birthdate;
    public String job;

    @Override
    public String toString(){
        return String.format("ID: %d Firstname: %s Lastname: %s Address: %s Department: %s Birthdate: %s Job: %s",
                ID, firstname, lastname, address, (affiliation == null? "not info" :affiliation.name), birthdate.toString(), job);
    }
}
