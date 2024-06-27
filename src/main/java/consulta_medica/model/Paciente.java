package consulta_medica.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity(name = "tb_paciente")
public class Paciente {

    @Id
    @Column(name = "pac_cpf", columnDefinition = "VARCHAR(11)", nullable = false)
    private String pacCpf;

    @Column(name = "pac_nome", columnDefinition = "VARCHAR(100)", nullable = false)
    private String pacNome;

    @Column(name = "pac_telefone")
    private String pacTelefone;

    public String getPacCpf() {
        return pacCpf;
    }

    public void setPacCpf(String pacCpf) {
        this.pacCpf = pacCpf;
    }

    public String getPacNome() {
        return pacNome;
    }

    public void setPacNome(String pacNome) {
        this.pacNome = pacNome;
    }

    public String getPacTelefone() {
        return pacTelefone;
    }

    public void setPacTelefone(String pacTelefone) {
        this.pacTelefone = pacTelefone;
    }

}
