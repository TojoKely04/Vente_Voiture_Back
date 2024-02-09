package com.projetS5.back.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.projetS5.back.model.AnnoncesStatus;

public interface AnnonceStatusRepository extends JpaRepository<AnnoncesStatus,Long> {
    @Query(value = "select * from annoncesstatus a where a.idannonces = :idUser",nativeQuery= true)
    AnnoncesStatus findAnnoncesStatusUser(@Param("idUser") Long idUser);
}
