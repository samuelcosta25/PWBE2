package webapp.escola_completo.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_completo.Model.VerificaCadastroAdm;

public interface VerificaCadastroAdmRepository extends CrudRepository<VerificaCadastroAdmRepository, String> {
    VerificaCadastroAdm findByIdCpf (String cpf);
}
