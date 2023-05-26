package org.petya8bachey.domain;

import javax.persistence.*;

@Entity
public class Organization {
    @Id
    @GeneratedValue()
    public Integer ID;
    public String name;
    public String address;
    @OneToOne
    public Employee head;
    @Override
    public String toString(){
        return String.format("ID: %d Name: %s Address: %s Head: %s %s",
                ID, name, address, (head == null? "not info" : head.firstname), (head == null? "not info" : head.lastname));
    }
}
