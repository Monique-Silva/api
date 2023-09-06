package com.apicreation.api.controller;

import com.apicreation.api.model.Car;
import com.apicreation.api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/carslist")
     public List<Car> showAllCars() {
     return this.service.getAllCars();
    }

    @GetMapping("/carbyid/{id}") //revisar o path
    public Car getCar(@PathVariable(name = "id") int id) {
        return this.service.getCarById(id);
    }

    }

    /**
 * public class VoitureService implements Iterable {
 * @Autowired
 *     private VoitureRepository voitureRepository;
 *
 * /**
 *     public Iterable List<Voiture> getVoitures() {
 *  *         List<Hero> heroes = new ArrayList<Hero>(); //initialisation de la liste des hero
 *
 *public Optional<Voiture> getVoiture(final Long id){
 *return voitureRepository.findById(id);
 *}
 *public Iterable<Voiture> getVoitures(){
 *return voitureRepository.findAll();
 *}
 *
 *public void deleteVoiture(final Long id){
 *voitureRepository.deleteById(id);
 *}
 *
 *public Voiture saveVoiture(Voiture voiture){
 *Voiture savedVoiture=voitureRepository.save(voiture);
 *return savedVoiture;
 *}
 *
 *}
 */