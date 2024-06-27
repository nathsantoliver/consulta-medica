package consulta_medica.service;

import consulta_medica.dto.NovoMedico;
import consulta_medica.model.Medico;

import java.util.Optional;

public interface MedicoService {

    Iterable<Medico> buscarTodosMedicos();

    Optional<Medico> buscarMedicoPorId(Long medicoId);

    void cadastrarMedico(NovoMedico novoMedico);

    void deletarMedico(Long medicoId);

}
