package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private Date momento;
	private	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private StatusPedido status;
	private List<PedidoItem>items = new ArrayList<>();
	private Cliente cliente;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	public Pedido(Date momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPedido getStatus() {
		return status;
	}
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	public List<PedidoItem> getPedido() {
		return items;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(PedidoItem item) {
		items.add(item);
	}
	public void removeItem(PedidoItem item) {
		items.remove(item);
	}
	public double total() {
		double soma = 0.0;
		for(PedidoItem it : items) {
			soma = soma + it.subTotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(status + "\n");
		sb.append("Cliente: " + "\n");
		sb.append(cliente + "\n");
		sb.append("ordem dos itens: \n");
		for(PedidoItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: $" );
		sb.append(String.format("%2f", total()));
		return sb.toString();
		}
	}

