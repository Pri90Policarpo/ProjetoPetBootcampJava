package ProjectPet;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private Animal animal;
    private List<Servico> servicos;  // Usando uma lista para armazenar os serviços
    private String data;
    private String horario;

    public void agendarServico(Animal animal, List<Servico> servicos, String data, String horario) {
        this.animal = animal;
        this.servicos = servicos;
        this.data = data;
        this.horario = horario;
    }

    public Agenda() {
        servicos = new ArrayList<>();
    }
    
    // Getters e Setters
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Servico servico : servicos) {
            valorTotal += servico.preco();
        }
        return valorTotal;
    }
    
    
}
