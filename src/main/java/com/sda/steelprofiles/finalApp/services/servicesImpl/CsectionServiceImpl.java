package com.sda.steelprofiles.finalApp.services.servicesImpl;

import com.sda.steelprofiles.finalApp.dtos.CsectionDTO;
import com.sda.steelprofiles.finalApp.entities.Csection;
import com.sda.steelprofiles.finalApp.repositories.CsectionRepository;
import com.sda.steelprofiles.finalApp.services.CsectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CsectionServiceImpl implements CsectionService {

    @Autowired
    private CsectionRepository csectionRepository;


    @Override
    public Csection findByName(String name) {
        return csectionRepository.findByName(name);
    }

    @Override
    public Csection seve(CsectionDTO newProfile) {
        Csection csection = new Csection();
        csection.setName(newProfile.getName());
        csection.setHeight(newProfile.getHeight());
        csection.setWeight(newProfile.getWeight());
        csection.setPrice(newProfile.getPrice());
        csection.setQuantity(newProfile.getQuantity());

        return csectionRepository.save(csection);
    }
}
