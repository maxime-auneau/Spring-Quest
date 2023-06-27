package com.wildcodeschool.myProject.repository;

import com.wildcodeschool.myProject.model.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WizardRepository extends JpaRepository<Wizard, Long> {

}
