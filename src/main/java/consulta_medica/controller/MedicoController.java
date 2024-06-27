package consulta_medica.controller;

import consulta_medica.dto.NovoMedico;
import consulta_medica.model.Medico;
import consulta_medica.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Medico>> buscarTodosMedicos() {
        return ResponseEntity.ok(medicoService.buscarTodosMedicos());
    }

    @GetMapping("/{medicoId}")
    public ResponseEntity<Optional<Medico>> buscarMedicoPorId(@PathVariable Long medicoId) {
        return ResponseEntity.ok(medicoService.buscarMedicoPorId(medicoId));
    }

    @PostMapping
    public ResponseEntity<NovoMedico> cadastrarMedico(@RequestBody NovoMedico novoMedico) {
        medicoService.cadastrarMedico(novoMedico);
        return ResponseEntity.ok(novoMedico);
    }

    @DeleteMapping("/{medicoId}")
    public ResponseEntity<Void> deletarMedico(@PathVariable Long medicoId) {
        medicoService.deletarMedico(medicoId);
        return ResponseEntity.ok().build();
    }
}
