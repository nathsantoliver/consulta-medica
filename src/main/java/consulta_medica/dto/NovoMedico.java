package consulta_medica.dto;

import consulta_medica.model.Especialidade;

public class NovoMedico {

    private String medNome;
    private Especialidade especialidade;

    public String getMedNome() {
        return medNome;
    }

    public void setMedNome(String medNome) {
        this.medNome = medNome;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

}
