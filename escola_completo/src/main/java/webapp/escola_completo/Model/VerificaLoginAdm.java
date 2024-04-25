package webapp.escola_completo.Model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VerificaLoginAdm implements Serializable {
    //atributos
    @Id
    private String cpf;
    private String senha;
    //métodos
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getSenha() {
        return senha;
    }
    public void setsenha(String senha) {
        this.senha = senha;
    }
    
}
