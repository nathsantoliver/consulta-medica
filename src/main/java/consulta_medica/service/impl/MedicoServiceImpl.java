package consulta_medica.service.impl;

import consulta_medica.dto.NovoMedico;
import consulta_medica.model.Medico;
import consulta_medica.repository.MedicoRepository;
import consulta_medica.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public Iterable<Medico> buscarTodosMedicos() {
        return medicoRepository.findAll();
    }

    @Override
    public Optional<Medico> buscarMedicoPorId(Long medicoId) {
        return medicoRepository.findById(medicoId);
    }

    @Override
    public void cadastrarMedico(NovoMedico novoMedico) {
        Medico medico = new Medico();

        medico.setMedNome(novoMedico.getMedNome());
        medico.setEspecialidade(novoMedico.getEspecialidade());

        medicoRepository.save(medico);
    }

    @Override
    public void deletarMedico(Long medicoId) {
        medicoRepository.deleteById(medicoId);
    }

}
