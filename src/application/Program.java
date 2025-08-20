package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.StatusPedido;

public class Program {
 

 public static void main(String[] args) throws ParseException {
	 Locale.setDefault(Locale.US);
	 Scanner scn = new Scanner(System.in);
	 
	 StatusPedido status;
 
	
	 //Date date = new Date("DD/MM/YYYY");
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	 System.out.println("Insira os dados do cliente");
	 System.out.print("Nome: ");
	 String nomeCliente = scn.nextLine();
	 System.out.print("Email: ");
	 String emailCliente = scn.nextLine();
	 System.out.print("Data de Aniversário (DD/MM/YYYY): ");
	 Date dataAniversario = sdf.parse(scn.next());
	 
	 Cliente cliente = new Cliente(nomeCliente,emailCliente,dataAniversario);
	 System.out.print("Status: ");
	 StatusPedido stts = StatusPedido.valueOf(scn.next());
	 Pedido pedido = new Pedido(new Date(),stts,cliente);
	 
	 int n = 1;
	 System.out.print("Quantos pedidos você deseja realizar? ");
	 n = scn.nextInt();
	 scn.nextLine();
	 
	 for(int i = 1; i<=n;i++) {
		 System.out.println("Insira os dados do Pedido");
		 System.out.println("Digite #" + i + " item: ");
		 System.out.print("Nome do Produto: ");
		 String nomeProduto = scn.nextLine();
		 System.out.print("Preço do Produto: ");
		 double precoDoProduto = scn.nextDouble();
		 scn.nextLine();
		 System.out.print("Quantidade: ");
		 int qtdProduto = scn.nextInt();
		 scn.nextLine();
		 System.out.println();
		 Produto produto = new Produto(nomeProduto, precoDoProduto);
		 PedidoItem pedidoitem = new PedidoItem(i,precoDoProduto,produto);
		 pedido.addItem(pedidoitem) ;
	 }
	 System.out.println();
	 System.out.println(pedido);
 }
}
