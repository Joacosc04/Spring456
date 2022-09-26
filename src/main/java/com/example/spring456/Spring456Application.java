package com.example.spring456;

import com.example.spring456.entities.Laptop;
import com.example.spring456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring456Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Spring456Application.class, args);
        LaptopRepository repository = context.getBean(LaptopRepository.class);


        Laptop laptop1 = new Laptop(null, "HP", "Notebook Pavilion 15", "Windows 8", "Intel 5", 8, 950, 270000);
        Laptop laptop2 = new Laptop(null, "HP", "Notebook HP 15\"", "Windows 10", "Ryzen 15", 8, 690, 310000);
        Laptop laptop3 = new Laptop(null, "HP", "Notebook MAX L4 I1", "Windows 11", "Intel Celeron", 4, 450, 350000);

        repository.save(laptop1);
        repository.save(laptop2);
        repository.save(laptop3);
    }

}
