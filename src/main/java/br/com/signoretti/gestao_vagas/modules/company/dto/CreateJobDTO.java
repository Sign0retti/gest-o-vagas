package br.com.signoretti.gestao_vagas.modules.company.dto;

import lombok.Data;

@Data
public class CreateJobDTO {
    
    private String description;
    private String beneficios;
    private String level;

}
