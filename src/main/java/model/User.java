package model;

import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

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
public class User {
	
	@Id
	@NonNull
	private Long id;

	private String name;

	private String email;

	private String password;

	private String enroll;

	private Date birthday;

	private Integer cpf;
	
	private Integer role;

}
