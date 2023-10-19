package ProjectPet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    	System.out.println("\n-------- Lista de Produtos -------- ");
    	
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Ração", "Alimento", 10.99, 100));
        produtos.add(new Produto("Coleira", "Acessório", 5.99, 50));

        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());

       
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
            System.out.println();
        }
        
    	System.out.println("\n-------- Vendas de produtos -------- ");
    	
        Produto produtoAVender = produtos.get(0); // Ração
        int quantidadeAVender = 5; 
        produtoAVender.vender(quantidadeAVender);

 
        System.out.println("Quantidade em estoque de " + produtos.get(0).getNome() + ": " + produtoAVender.getQuantidadeEmEstoque());


        System.out.println("\n-------- Lista de Serviços -------- ");
        for (Servico servico : servicos) {
            System.out.println("Descrição: " + servico.descricao());
            System.out.println("Preço: R$" + servico.preco());
            System.out.println();
        }
        
        System.out.println("\n-------- Agendamento -------- ");

        Agenda minhaAgenda = new Agenda();
        Animal meuAnimal = new Animal("Tapioca", "Cachorro", "Golden Retriever", "2014-03-10", "Michel");
        
        List<Servico> meusServicos = new ArrayList<>();
        meusServicos.add(servicos.get(0));  // Banho
        meusServicos.add(servicos.get(1));  // Tosa

        String dataAgendamento = "2023-10-19";
        String horarioAgendamento = "17:00";

        minhaAgenda.agendarServico(meuAnimal, meusServicos, dataAgendamento, horarioAgendamento);

        System.out.println("Agendamento:");
        System.out.println("Animal: " + minhaAgenda.getAnimal().getNome());
        System.out.println("Serviços agendados:");
        for (Servico servico : minhaAgenda.getServicos()) {
            System.out.println("- " + servico.descricao());
        }
        System.out.println("Data: " + minhaAgenda.getData());
        System.out.println("Horário: " + minhaAgenda.getHorario());

        double valorTotal = minhaAgenda.calcularValorTotal();
        System.out.println("Valor total: R$" + valorTotal);
    }
}
