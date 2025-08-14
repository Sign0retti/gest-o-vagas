package br.com.signoretti.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não pode conter espaços.")
    private String username;

    @Email(message = "O campo deve conter um e-mail válido.")
    private String email;

    @Length(min = 5, max = 200, message = "A senha deve conter entre 5 e 20 caracteres")
    private String password;
    
    private String website;
    private String name;
    private String description;
    private LocalDateTime createdAt;

    
}
