package com.sda.steelprofiles.finalApp.services;

import com.sda.steelprofiles.finalApp.dtos.CsectionDTO;
import com.sda.steelprofiles.finalApp.entities.Csection;

public interface CsectionService {
    Csection findByName(String name);

    Csection seve(CsectionDTO newProfile);
}