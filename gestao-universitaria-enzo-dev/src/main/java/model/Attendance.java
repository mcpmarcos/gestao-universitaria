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
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "date")
    private Date date;

    @Column(name = "present")
    private boolean present;

    public Attendance(Long studentId, Long courseId, Date date, boolean present) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.date = date;
        this.present = present;
    }
}
