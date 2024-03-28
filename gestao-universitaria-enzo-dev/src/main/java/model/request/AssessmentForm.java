package model.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentForm {


    @Positive
    @NotNull
    private Long studentId;


    @Positive
    @NotNull
    private Long courseId;


    @NotNull
    private double grade;


    @NotNull
    private Date date;
}
