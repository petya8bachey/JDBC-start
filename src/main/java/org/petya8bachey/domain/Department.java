package org.petya8bachey.domain;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue()
    public Integer ID;
    public String name;
    public Integer numberOfEmployees;
    public String listOfRooms;
    @OneToOne
    public Employee head;

    @Override
    public String toString(){
        return String.format("ID: %d Name: %s Number of employees: %d List of rooms: %s Head: %s %s",
                ID, name, numberOfEmployees, listOfRooms, (head == null? "not info" : head.firstname), head.lastname);
    }
}
