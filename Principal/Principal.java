package Principal;
import Classes.Bebidas;
import Classes.Comidas;
import Classes.Sobremesas;
import Classes.CalcPedido;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
				
		//scanner
		Scanner scanner = new Scanner(System.in);
		
		//bebidas
		Bebidas b1 = new Bebidas();
		b1.setNome("Coca-Cola");
		b1.setPreço(8.00);
		b1.setTipo("Bebida");
		
		Bebidas b2 = new Bebidas();
		b2.setNome("Guaraná");
		b2.setPreço(7.00);
		b2.setTipo("Bebida");

		Bebidas b3 = new Bebidas();
		b3.setNome("Fanta");
		b3.setPreço(7.00);
		b3.setTipo("Bebida");
		
		Bebidas b4 = new Bebidas();
		b4.setNome("Água");
		b4.setPreço(4.00);
		b4.setTipo("Bebida");
		
		Bebidas b5 = new Bebidas();
		b5.setNome("Sprite");
		b5.setPreço(7.00);
		b5.setTipo("Bebida");
		
		Bebidas b6 = new Bebidas();
		b6.setNome("Suco");
		b6.setPreço(6.00);
		b6.setTipo("Bebida");
		
		//comidas
		Comidas c1 = new Comidas();
		c1.setNome("Pizza");
		c1.setPreço(25.00);
		c1.setTipo("Comida");
		
		Comidas c2 = new Comidas();
		c2.setNome("Coxinha");
		c2.setPreço(5.00);
		c2.setTipo("Comida");
		
		Comidas c3 = new Comidas();
		c3.setNome("Pastel");
		c3.setPreço(5.00);
		c3.setTipo("Comida");
		
		Comidas c4 = new Comidas();
		c4.setNome("Lasanha");
		c4.setPreço(25.00);
		c4.setTipo("Comida");
		
		Comidas c5 = new Comidas();
		c5.setNome("Fritas");
		c5.setPreço(8.00);
		c5.setTipo("Comida");
		
		Comidas c6 = new Comidas();
		c6.setNome("Hamburguer");
		c6.setPreço(10.00);
		c6.setTipo("Comida");
		
		//sobremesas
		Sobremesas s1 = new Sobremesas();
		s1.setNome("Sorvete");
		s1.setPreço(10.0);
		s1.setTipo("Sobremesa");
		
		Sobremesas s2 = new Sobremesas();
		s2.setNome("Açai");
		s2.setPreço(10.00);
		s2.setTipo("Sobremesa");
		
		Sobremesas s3 = new Sobremesas();
		s3.setNome("Chocolate");
		s3.setPreço(5.00);
		s3.setTipo("Sobremesa");
		
		Sobremesas s4 = new Sobremesas();
		s4.setNome("Bolo");
		s4.setPreço(5.00);
		s4.setTipo("Sobremesa");
		
		Sobremesas s5 = new Sobremesas();
		s5.setNome("Mousse");
		s5.setPreço(8.00);
		s5.setTipo("Sobremesa");
		
		Sobremesas s6 = new Sobremesas();
		s6.setNome("Salada de Frutas");
		s6.setPreço(8.00);
		s6.setTipo("Sobremesa");

		//CalcPedido
		CalcPedido v1 = new CalcPedido();
		
		
		//Inicio
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		
		//Menu
		System.out.println("Bem vindo " + nome + "!");
		System.out.println("----- MENU DE LANCHES -----");
		System.out.println("1- " + c1.getNome() + " (R$" + c1.getPreço() +  "0) | 2- " + c2.getNome() + " (R$" + c2.getPreço() + "0)");
		System.out.println("3- " + c3.getNome() + " (R$" + c3.getPreço() +  "0) | 4- " + c4.getNome() + " (R$" + c4.getPreço() + "0)");
		System.out.println("5- " + c5.getNome() + " (R$" + c5.getPreço() +  "0) | 6- " + c6.getNome() + " (R$" + c6.getPreço() + "0)");
		System.out.println("7- Próximo Menu");
		System.out.print("Digite a opção desejada: ");
		int opção = scanner.nextInt();
		
			switch (opção) {
			
			case 1:{
				v1.setValor1(25.0);
				v1.setInfo1("Pizza");
				break;
				}
			case 2:{
				v1.setValor1(5.0);
				v1.setInfo1("Coxinha");
				break;
				}
			case 3:{
				v1.setValor1(5.0);
				v1.setInfo1("Pastel");
				break;
				}
			case 4:{
				v1.setValor1(25.0);
				v1.setInfo1("Lasanha");
				break;
				}
			case 5:{
				v1.setValor1(8.0);
				v1.setInfo1("Fritas");
				break;
				}
			case 6:{
				v1.setValor1(10.0);
				v1.setInfo1("Hamburguer");
				break;
				}
			case 7:{
				v1.setValor1(0);
				v1.setInfo1("");
				break;
				}
			default:
				System.out.print("Opção inválida");
				break;
			}
			
		//Menu bebidas
		System.out.println("----- MENU DE BEBIDAS-----");
		System.out.println("1- " + b1.getNome() + " (R$" + b1.getPreço() +  "0) | 2- " + b2.getNome() + " (R$" + b2.getPreço() + "0)");
		System.out.println("3- " + b3.getNome() + " (R$" + b3.getPreço() +  "0) | 4- " + b4.getNome() + " (R$" + b4.getPreço() + "0)");
		System.out.println("5- " + b5.getNome() + " (R$" + b5.getPreço() +  "0) | 6- " + b6.getNome() + " (R$" + b6.getPreço() + "0)");
		System.out.println("7- Próximo Menu");
		System.out.print("Digite a opção desejada: ");
		int opção2 = scanner.nextInt();
			
			
			switch (opção2) {
			
			case 1:{
				v1.setValor2(8.0);
				v1.setInfo2("Coca-cola");
				break;
				}
			case 2:{
				v1.setValor2(7.0);
				v1.setInfo2("Guaraná");
				break;
				}
			case 3:{
				v1.setValor2(7.0);
				v1.setInfo2("Fanta");
				break;
				}
			case 4:{
				v1.setValor2(4.0);
				v1.setInfo2("Água");
				break;
				}
			case 5:{
				v1.setValor2(7.0);
				v1.setInfo2("Sprite");
				break;
				}
			case 6:{
				v1.setValor2(6.0);
				v1.setInfo2("Suco");
				break;
				}
			case 7:{
				v1.setValor2(0);
				v1.setInfo2("");
				break;
				}
			default:
				System.out.print("Opção inválida");
				break;
			}
		
		//Menu sobremesas
		System.out.println("----- MENU DE SOBREMESAS-----");
		System.out.println("1- " + s1.getNome() + " (R$" + s1.getPreço() +  "0) | 2- " + s2.getNome() + " (R$" + s2.getPreço() + "0)");
		System.out.println("3- " + s3.getNome() + " (R$" + s3.getPreço() +  "0) | 4- " + s4.getNome() + " (R$" + s4.getPreço() + "0)");
		System.out.println("5- " + s5.getNome() + " (R$" + s5.getPreço() +  "0) | 6- " + s6.getNome() + " (R$" + s6.getPreço() + "0)");
		System.out.println("7- Nenhum");
		System.out.print("Digite a opção desejada: ");
		int opção3 = scanner.nextInt();
		
			switch (opção3) {
			
			case 1:{
				v1.setValor3(10.0);
				v1.setInfo3("Sorvete");
				break;
				}
			case 2:{
				v1.setValor3(10.0);
				v1.setInfo3("Açai");
				break;
				}
			case 3:{
				v1.setValor3(5.0);
				v1.setInfo3("Chocolate");
				break;
				}
			case 4:{
				v1.setValor3(5.0);
				v1.setInfo3("Bolo");
				break;
				}
			case 5:{
				v1.setValor3(8.0);
				v1.setInfo3("Mousse");
				break;
				}
			case 6:{
				v1.setValor3(8.0);
				v1.setInfo3("Salada de Frutas");
				break;
				}
			case 7:{
				v1.setValor3(0);
				v1.setInfo3("");
				break;
				}
			default:
				System.out.print("Opção inválida");
				break;
			}		
			
		System.out.println("\n-----VALOR DO PEDIDO-----");
		System.out.println("Olá " + nome + ", Obrigado pela prefêrencia!");
		System.out.println("Seu pedido foi: " + v1.getInfo1() + ", " + v1.getInfo2() + ", " + v1.getInfo3() + "." );
		System.out.println("O valor da sua compra é: R$" + v1.Soma() + "0");
		System.out.print("------------------------");
	  }
	}

