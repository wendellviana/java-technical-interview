package com.surecloud.javatechnicalinterview.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExamDTO {

    public ExamDTO(String name, Integer score, Date dateTaken){
        this.name = name;
        this.score = score;
        this.dateTaken = dateTaken;
    }

    private Integer id;
    private String name;
    private Integer score;
    private Date dateTaken;
}
