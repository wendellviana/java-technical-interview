package com.surecloud.javatechnicalinterview.controller;

import com.surecloud.javatechnicalinterview.dto.ExamDTO;
import com.surecloud.javatechnicalinterview.entity.Exam;
import com.surecloud.javatechnicalinterview.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExamController {
    private final ExamService examService;

    @Autowired
    public ExamController(ExamService examService){
        this.examService = examService;
    }

    @GetMapping("/exams")
    public List<Exam> getExams(){
        return examService.getExams();
    }

    @GetMapping("/exams/{id}")
    public Exam getExamById(@PathVariable("id") String examId){
        return examService.getExamById(examId);
    }

    @PostMapping("/exams")
    public Exam saveExam(@Validated @RequestBody Exam exam) {
       return examService.saveExam(exam);
    }
}
