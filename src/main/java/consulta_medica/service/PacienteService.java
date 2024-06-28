package consulta_medica.service;

import consulta_medica.dto.NovoPaciente;
import consulta_medica.model.Paciente;

import java.util.Optional;

public interface PacienteService {

    Iterable<Paciente> buscarTodosPacientes();

    Optional<Paciente> buscarPacientePorId(String pacCpf);

    void cadastrarPaciente(NovoPaciente novoPaciente);

    void deletarPaciente(String pacCpf);

}
