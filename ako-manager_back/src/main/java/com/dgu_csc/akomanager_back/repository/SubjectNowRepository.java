package com.dgu_csc.akomanager_back.repository;

import com.dgu_csc.akomanager_back.model.SubjectNow;
import com.dgu_csc.akomanager_back.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectNowRepository extends JpaRepository<SubjectNow, Long> {
    List<SubjectNow> findBySnStudentid(Users users);
}
