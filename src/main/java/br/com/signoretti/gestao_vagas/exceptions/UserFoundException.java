package br.com.signoretti.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    
    public UserFoundException(){
        super("Usuário ja existe!");
    }

}
