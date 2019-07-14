package com.sda.steelprofiles.finalApp.services.servicesImpl;

import com.sda.steelprofiles.finalApp.dtos.CsectionDTO;
import com.sda.steelprofiles.finalApp.entities.Csection;
import com.sda.steelprofiles.finalApp.repositories.CsectionRepository;
import com.sda.steelprofiles.finalApp.services.CsectionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CsectionServiceImpl implements CsectionService {

    private CsectionRepository csectionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CsectionServiceImpl(CsectionRepository csectionRepository, ModelMapper modelMapper) {
        this.csectionRepository = csectionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Csection findByName(String name) {
        return csectionRepository.findByName(name);
    }

    @Override
    public Csection save(CsectionDTO newProfile) {
        Csection csection = new Csection();
        csection.setName(newProfile.getName());
        csection.setHeight(newProfile.getHeight());
        csection.setWeight(newProfile.getWeight());
        csection.setPrice(newProfile.getPrice());
        csection.setQuantity(newProfile.getQuantity());

        return csectionRepository.save(csection);
    }

    @Override
    public Csection update(CsectionDTO newProfile) {
        Csection csection = csectionRepository.findByName(newProfile.getName());
        csection.setHeight(newProfile.getHeight());
        csection.setWeight(newProfile.getWeight());
        csection.setPrice(newProfile.getPrice());
        csection.setQuantity(newProfile.getQuantity());
        return csectionRepository.save(csection);
    }

    public List<CsectionDTO> findAll() {
        return csectionRepository
                .findAll()
                .stream()
                .map(csection -> modelMapper.map(csection, CsectionDTO.class))
                .sorted(Comparator.comparing(CsectionDTO::getPrice))
                .collect(Collectors.toList());
    }
}