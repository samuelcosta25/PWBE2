package webapp.escola_completo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import webapp.escola_completo.Model.Administrador;
import webapp.escola_completo.Repository.AdministradorRepository;


@Controller
public class AdministradorController {
    private AdministradorRepository ar;
//Metodos
    @PostMapping("cadastrar-adm")
    public String cadastroAdmBD(Administrador adm) {
        ar.save(adm);
        System.out.println("Cadastro realizado com sucesso!");
        return "login/login-adm";
    }
    
}
