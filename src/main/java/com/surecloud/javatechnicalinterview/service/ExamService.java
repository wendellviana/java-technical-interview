package com.surecloud.javatechnicalinterview.service;

import com.surecloud.javatechnicalinterview.dto.ExamDTO;
import com.surecloud.javatechnicalinterview.entity.Exam;

import java.util.List;


public interface ExamService{
    List<Exam> getExams();
    Exam saveExam(Exam Exam);
    Exam getExamById(String id);

}
