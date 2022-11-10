package com.apoorv.jpa.repositories;

import com.apoorv.jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Apoorv Vardhman
 * @Github Apoorv-Vardhman
 * @LinkedIN apoorv-vardhman
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
