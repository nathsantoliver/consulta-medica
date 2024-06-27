package consulta_medica.service.impl;

import consulta_medica.dto.NovoPaciente;
import consulta_medica.model.Paciente;
import consulta_medica.repository.PacienteRepository;
import consulta_medica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public Iterable<Paciente> buscarTodosPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> buscarPacientePorId(String pacCpf) {
        return pacienteRepository.findById(pacCpf);
    }

    @Override
    public void cadastrarPaciente(NovoPaciente novoPaciente) {
        Paciente paciente = new Paciente();

        paciente.setPacNome(novoPaciente.getPacNome());
        paciente.setPacCpf(novoPaciente.getPacCpf());
        paciente.setPacTelefone(novoPaciente.getPacTelefone());

        pacienteRepository.save(paciente);
    }

    @Override
    public void atualizarPaciente(String pacCpf, Paciente paciente) {
        for(Paciente p : buscarTodosPacientes()) {
            if(Objects.equals(p.getPacCpf(), paciente.getPacCpf())) {
                p.setPacCpf(paciente.getPacCpf());
                p.setPacNome(paciente.getPacNome());
                p.setPacTelefone(paciente.getPacTelefone());

                pacienteRepository.save(p);
                break;
            }
        }
    }

    @Override
    public void deletarPaciente(String pacCpf) {
        pacienteRepository.deleteById(pacCpf);
    }
}
