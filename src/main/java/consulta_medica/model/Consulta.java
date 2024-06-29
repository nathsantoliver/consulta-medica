package consulta_medica.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consultaId;

    @Column(name = "data_hora")
    private LocalDateTime dataConsulta;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Column(name = "medico")
    private String medico;

    @Column(name = "paciente")
    private String paciente;

    @Column(columnDefinition = "VARCHAR(500)")
    private String prescricao;

    public Long getConsultaId() {
        return consultaId;
    }

    public void setConsultaId(Long consultaId) {
        this.consultaId = consultaId;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

}
