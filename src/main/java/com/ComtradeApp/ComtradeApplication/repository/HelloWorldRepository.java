package com.ComtradeApp.ComtradeApplication.repository;

import com.ComtradeApp.ComtradeApplication.model.HelloWorldModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HelloWorldRepository
        extends JpaRepository<HelloWorldModel, Long> {

    //@Query(value = "SELECT * FROM HelloWorldModel t WHERE " +
    //        "LOWER(t.lang) LIKE LOWER(CONCAT('%',:searchLang, '%'))",
    //        nativeQuery = true
    //)
    //HelloWorldModel findByLanguage(@Param("searchTerm") String searchTerm);
}
