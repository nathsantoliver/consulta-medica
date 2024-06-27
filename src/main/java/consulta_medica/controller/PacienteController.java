package consulta_medica.controller;

import consulta_medica.dto.NovoPaciente;
import consulta_medica.model.Paciente;
import consulta_medica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/")
    public ResponseEntity<Iterable<Paciente>> buscarTodosPacientes() {
        return ResponseEntity.ok(pacienteService.buscarTodosPacientes());
    }

    @GetMapping("/{pacienteId}")
    public ResponseEntity<Optional<Paciente>> buscarPacientePorId(@PathVariable String pacCpf) {
        return ResponseEntity.ok(pacienteService.buscarPacientePorId(pacCpf));
    }

    @PostMapping
    public ResponseEntity<NovoPaciente> cadastrarPaciente(@RequestBody NovoPaciente novoPaciente) {
        pacienteService.cadastrarPaciente(novoPaciente);
        return ResponseEntity.ok(novoPaciente);
    }

    @PutMapping("/{pacienteId}")
    public ResponseEntity<Paciente> atualizarPaciente(@PathVariable String pacCpf, @RequestBody Paciente paciente) {
        pacienteService.atualizarPaciente(pacCpf, paciente);
        return ResponseEntity.ok(paciente);
    }

    @DeleteMapping("/{pacienteId}")
    public ResponseEntity<Void> deletarPaciente(@PathVariable String pacCpf) {
        pacienteService.deletarPaciente(pacCpf);
        return ResponseEntity.ok().build();
    }
}
