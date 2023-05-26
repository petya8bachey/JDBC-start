package org.petya8bachey.presentation;

import org.petya8bachey.application.*;
import org.petya8bachey.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;


@SpringBootApplication
@EnableJpaRepositories("org.petya8bachey.repository")
@EntityScan("org.petya8bachey.domain")
@ComponentScan("org.petya8bachey")
public class Main implements CommandLineRunner {
    @Autowired
    DataBase dataBase;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Organization ngtu = new Organization();
//        Employee me = dataBase.findEmployeeById(6).get();
//        ngtu.head = me;
//        ngtu.name = "NGTU";
//        ngtu.address = "NN";
//        dataBase.add(ngtu);
//        dataBase.setEmployeeInfo(dataBase.findDepartment("IRIT").get(0), 6);
        for (Department department: dataBase.getAllDepartment()) {
            System.out.println(department);
        }
        for (Employee employee1 : dataBase.findEmployee("scvortcov"))
            System.out.println(employee1);
        for (Organization organization: dataBase.getAllOrganization()) {
            System.out.println(organization);
        }
        /* */
    }
}
