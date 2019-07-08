package com.sda.steelprofiles.finalApp.repositories;

import com.sda.steelprofiles.finalApp.entities.Csection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CsectionRepository extends JpaRepository<Csection, Long> {
}
