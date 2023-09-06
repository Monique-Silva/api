//cette classe est une interface qui contient des actions pour communiquer avec la base des données. elle utilise le code de la classe entité (voiture)
//le code doit faire une requete à la bdd, et le résultat est retourné sous forme d'instances de l'objet Voiture

package com.apicreation.api.repository;

import com.apicreation.api.model.Car;
import com.apicreation.api.service.CarService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Repository //spécialisation de @Component pour indiquer le rôle de la class et que la même est un bean à exploiter
//public interface CarRepository extends CrudRepository<Car, Long> {
//}

@Component
public class CarRepository {

    private final List<Car> carsList;

    public CarRepository() {
        this.carsList = new ArrayList<Car>();
        Car newCar1 = new Car(1, "Peugeot", "206", "Bleue");
        Car newCar2 = new Car(2, "Wolkswagen", "Kombi", "Blanche");
        Car newCar3 = new Car(3, "Chevrolet", "Monza", "Gris");
        this.carsList.add(newCar1);
        this.carsList.add(newCar2);
        this.carsList.add(newCar3);
    }

    public List<Car> getCars() {
        return carsList;
    }

}
