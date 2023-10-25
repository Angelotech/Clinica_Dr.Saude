package br.com.Clinica_DrSaude.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Clinica_DrSaude.Model.PacModel;

import java.util.UUID;


public interface PacienteRepository extends JpaRepository<PacModel, UUID> {
    //buscar pelo nome do paciente
    PacModel findByNome (String Nome);

    
} 
    

