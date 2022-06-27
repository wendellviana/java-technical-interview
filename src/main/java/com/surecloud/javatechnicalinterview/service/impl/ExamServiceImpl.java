package com.surecloud.javatechnicalinterview.service.impl;

import com.surecloud.javatechnicalinterview.entity.Exam;
import com.surecloud.javatechnicalinterview.repository.ExamRepository;
import com.surecloud.javatechnicalinterview.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamRepository examRepository;

    @Autowired
    public ExamServiceImpl( ExamRepository examRepository){
        this.examRepository = examRepository;
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Exam> getExams() {
        return examRepository.findAll();
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public Exam saveExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Exam getExamById(String id) {
        return examRepository.findById(UUID.fromString(id)).get();
    }
}
