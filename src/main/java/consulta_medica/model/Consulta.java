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

    @ManyToOne(cascade = CascadeType.ALL)
    private Medico medico;

    @ManyToOne(cascade = CascadeType.ALL)
    private Paciente paciente;

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

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

}
