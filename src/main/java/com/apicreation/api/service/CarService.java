package com.apicreation.api.service;

import com.apicreation.api.model.Car;
import com.apicreation.api.repository.CarRepository;
//import lombok.Data;
//import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@Data
@Service
public class CarService {

    @Autowired
    private CarRepository repository;

    public List<Car> getAllCars() {
        return this.repository.getCars();
    }
    public Car getCarById(int id) {
        List<Car> carsList = this.repository.getCars();
        for (int i = 0; i < carsList.size(); i++) {
            Car car = carsList.get(i);
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }
}