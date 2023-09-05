//cette classe est une interface qui contient des actions pour communiquer avec la base des données. elle utilise le code de la classe entité (voiture)
//le code doit faire une requete à la bdd, et le résultat est retourné sous forme d'instances de l'objet Voiture

package com.apicreation.api.repository;

import com.apicreation.api.model.Voiture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //spécialisation de @Component pour indiquer le rôle de la class et que la même est un bean à exploiter
public interface VoitureRepository extends CrudRepository<Voiture, Long> {
}
