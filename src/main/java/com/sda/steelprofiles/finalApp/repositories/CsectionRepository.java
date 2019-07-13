package com.sda.steelprofiles.finalApp.repositories;

import com.sda.steelprofiles.finalApp.entities.Csection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CsectionRepository extends JpaRepository<Csection, Long> {
    Csection findByName(String name);
    Optional<Csection> findById(Long id);
}
