package com.apicreation.api.service;

import com.apicreation.api.model.Voiture;
import com.apicreation.api.repository.VoitureRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Data
@Service
public class VoitureService implements Iterable {
@Autowired
    private VoitureRepository voitureRepository;

/**
    public Iterable List<Voiture> getVoitures() {
 *         List<Hero> heroes = new ArrayList<Hero>(); //initialisation de la liste des hero
 */
public Optional<Voiture> getVoiture(final Long id) {
    return voitureRepository.findById(id);
}
public Iterable<Voiture> getVoitures() {
    return voitureRepository.findAll();
}

public void deleteVoiture(final Long id) {
    voitureRepository.deleteById(id);
}

public Voiture saveVoiture(Voiture voiture) {
    Voiture savedVoiture = voitureRepository.save(voiture);
    return savedVoiture;
}

}
