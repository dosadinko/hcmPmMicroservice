package com.infostudio.ba.repository;

import com.infostudio.ba.domain.PmGoalEvalQstCompl;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the PmGoalEvalQstCompl entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PmGoalEvalQstComplRepository extends JpaRepository<PmGoalEvalQstCompl, Long> {

}