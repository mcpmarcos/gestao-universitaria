package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grade {

    @Id
    @NonNull
    private Long id;

    private Long idUser;

    private Long idSubject;

    private Double grade1;

    private Double grade2;
    
    private Double finalScore;


}
