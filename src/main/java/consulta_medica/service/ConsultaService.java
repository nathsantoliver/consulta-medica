package consulta_medica.service;

import consulta_medica.dto.NovaConsulta;
import consulta_medica.model.Consulta;

import java.util.Optional;

public interface ConsultaService {

    Iterable<Consulta> buscarTodasConsultas();

    Optional<Consulta> buscarConsultaPorId(Long consultaId);

    void novaConsulta(Long medicoId, String pacCpf, NovaConsulta novaConsulta);

}
