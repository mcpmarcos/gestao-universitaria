package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "assessment")
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "grade")
    private double grade;

    @Column(name = "date")
    private Date date;


    public Assessment(Long studentId, Long courseId, double grade, Date date) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
        this.date = date;
    }
}
