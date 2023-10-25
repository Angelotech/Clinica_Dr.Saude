package br.com.Clinica_DrSaude.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import br.com.Clinica_DrSaude.Model.MedModel;
import java.util.List;



public interface MedicosRepository extends JpaRepository<MedModel, UUID>{
    //buscar pelo nome do medico
    MedModel findByNome(String nome);

    //buscar pela especialidade
    List<MedModel> findByCargo(String cargo);

    //buscar pelos dias de atendimento
    List<MedModel> findByAtendimento(String atendimento);

    
} 
