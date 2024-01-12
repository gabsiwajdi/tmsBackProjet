package com.Tmsreview.tms.Repository.RH;

import com.Tmsreview.tms.Models.RH.Employe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeRepository extends JpaRepository <Employe,Long> {






}
