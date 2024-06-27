package consulta_medica.controller;

import consulta_medica.dto.NovaConsulta;
import consulta_medica.model.Consulta;
import consulta_medica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public ResponseEntity<Iterable<Consulta>> buscarTodasConsultas() {
        return ResponseEntity.ok(consultaService.buscarTodasConsultas());
    }

    @GetMapping("/{consultaId}")
    public ResponseEntity<Optional<Consulta>> buscarConsultaPorId(@PathVariable Long consultaId) {
        return ResponseEntity.ok(consultaService.buscarConsultaPorId(consultaId));
    }

    @PutMapping("/{medicoId}-{pacCpf}")
    public ResponseEntity<NovaConsulta> novaConsulta(@PathVariable Long medicoId, @PathVariable String pacCpf, @RequestBody NovaConsulta novaConsulta) {
        consultaService.novaConsulta(medicoId, pacCpf, novaConsulta);
        return ResponseEntity.ok(novaConsulta);
    }
}
