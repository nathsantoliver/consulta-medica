package consulta_medica.service.impl;

import consulta_medica.controller.exception.GlobalExceptionHandler;
import consulta_medica.dto.NovaConsulta;
import consulta_medica.model.Consulta;
import consulta_medica.model.Medico;
import consulta_medica.model.Paciente;
import consulta_medica.repository.ConsultaRepository;
import consulta_medica.service.ConsultaService;
import consulta_medica.service.MedicoService;
import consulta_medica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ConsultaServiceImpl implements ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private PacienteService pacienteService;

    @Override
    public Iterable<Consulta> buscarTodasConsultas() {
        return consultaRepository.findAll();
    }

    @Override
    public Optional<Consulta> buscarConsultaPorId(Long consultaId) {
        return consultaRepository.findById(consultaId);
    }

    @Override
    public void novaConsulta(Long medicoId, String pacCpf, NovaConsulta novaConsulta) {
        Optional<Medico> medico = medicoService.buscarMedicoPorId(medicoId);
        Optional<Paciente> paciente = pacienteService.buscarPacientePorId(pacCpf);

        Consulta consulta = new Consulta();

        consulta.setDataConsulta(LocalDateTime.now());
        consulta.setEspecialidade(medico.get().getEspecialidade());
        consulta.setMedico(medico.get().getMedNome());
        consulta.setPaciente(paciente.get().getPacNome());
        consulta.setPrescricao(novaConsulta.getPrescricao());

        consultaRepository.save(consulta);
    }
}
