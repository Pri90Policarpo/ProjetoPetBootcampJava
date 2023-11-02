package ProjectPet;

public class ConsultaVeterinaria extends Servico {
    @Override
    public String descricao() {
        return "Consulta Veterinaria";
    }

    @Override
    public double preco() {
        return 120.00;
    }
}
