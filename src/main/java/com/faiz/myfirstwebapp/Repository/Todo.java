package com.faiz.myfirstwebapp.Repository;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Repository
public class Todo {

    private Integer id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private Boolean done;
}
