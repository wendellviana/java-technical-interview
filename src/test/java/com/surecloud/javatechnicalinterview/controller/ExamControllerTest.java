package com.surecloud.javatechnicalinterview.controller;

import com.surecloud.javatechnicalinterview.entity.Exam;
import com.surecloud.javatechnicalinterview.service.ExamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ExamControllerTest {
    @Autowired
    private ExamService examService;

    @Test
    void getExams(){
        List<Exam> examsList = examService.getExams();
        Assertions.assertNotNull(examsList);
    }

    @Test
    void getExamById() {
        String superId = "0c428cfb-34b5-4d57-8627-2f31a59f2abd";
        Exam exam = examService.getExamById(superId);
        Assertions.assertNotNull(exam);
        Assertions.assertEquals(exam.getScore(), 92);
        Assertions.assertEquals(exam.getName(), "Jameson Shields");
    }

    @Test
    void saveExam() {
        Exam exam = new Exam();
        exam.setName("TestInterview");
        exam.setScore(102);
        exam.setDateTaken(new Date());

        exam = examService.saveExam(exam);
        Assertions.assertNotNull(exam.getId());
    }
}