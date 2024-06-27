package consulta_medica.dto;

public class NovoPaciente {

    private String pacCpf;
    private String pacNome;
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
