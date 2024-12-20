package com.tatastrive.lokesh.pos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatastrive.lokesh.pos.entity.Report;



public interface ReportRepository extends JpaRepository<Report, Long> {

}
