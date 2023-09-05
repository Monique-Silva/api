package com.apicreation.api.service;

import com.apicreation.api.model.Voitures;
import com.apicreation.api.repository.VoitureRepository;
//import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Data
@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public <Voitures> Optional<Voitures> getVoiture(final Long id) {
        return (Optional<Voitures>) voitureRepository.findById(id);
    }

    public Iterable<Voitures> getVoitures() {
        return voitureRepository.findAll();
    }

    public void deleteVoiture(final Long id) {
        voitureRepository.deleteById(id);
    }

    public Voitures saveVoiture(Voitures voitures) {
        Voitures savedVoiture = voitureRepository.save(voitures);
        return savedVoiture;
    }
}