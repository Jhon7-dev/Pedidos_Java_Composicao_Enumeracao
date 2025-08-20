package entities;

public class PedidoItem {
	private int qtd;
	private Double preco;
	private Produto produto;
	
	public PedidoItem() {
		// TODO Auto-generated constructor stub
	}
	public PedidoItem(int qtd, Double preco, Produto produto) {
		super();
		this.qtd = qtd;
		this.preco = preco;
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Double subTotal() {
		return qtd * preco;
	}
	@Override
	public String toString() {
		return getProduto().getName()
				+ ", $"
				+ String.format("%.2f",preco)
				+ ", Quantidade: "
				+ qtd 
				+ ", Subtotal: $ "
				+ String.format("%.2f", subTotal());
	}
}
