package ProjectPet;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, String categoria, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
    
	 // Método para vender um produto
	 
	 public void vender(int quantidade) {
		 if (quantidade <= quantidadeEmEstoque) {
	       quantidadeEmEstoque -= quantidade;
		 }else { 
	       System.out.println("Produto fora de estoque.");
	    
		 }
	 }
    
}
