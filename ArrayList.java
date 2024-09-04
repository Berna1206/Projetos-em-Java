import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
			
			// Recupera a informação que será utilizada para definir a quantidade
			// de elementos que a lista terá
			String nrElementos =
					JOptionPane.showInputDialog("Quantos nrs a lista vai ter?");
					
			int nElementos = Integer.valueOf(nrElementos);
			
			// Cria a lista
			ArrayList<Integer> lista = new ArrayList<Integer>();
			
			// Repetição responsável por capturar os valores digitados pelo usuário
			// e adicioná-los na lista
			for(int i = 0; i < nElementos; i++) {
				String valor =
						JOptionPane.showInputDialog("Informe o valor " + i);
				lista.add(Integer.valueOf(valor));
			}
			
			//Apresenta o resultado da lista montada
			System.out.println(lista);
			
			// Cria contadores
			int elemento = 0;
			int soma = 0;
			int somaPares = 0;
			int somaImpares = 0;
			// Repetição responsável por somar os valores digitados pelo usuário
			for(int i = 0; i < lista.size(); i++) {
				elemento = lista.get(i);
				// Soma de todos os valores
				soma += elemento;
				
				// Soma de todos os elementos pares
				if(elemento % 2 == 0) {
					somaPares += elemento;
				}
				
				// Soma dos elementos posicionados nos endereços impares
				if(i % 2 == 1) {
					somaImpares += elemento;
				}
				
			}
			
			// Apresenta os resultados das somas
			System.out.println("Soma total dos valores da lista: " + soma);
			System.out.println("Soma dos elementos pares: " + somaPares);
			System.out.println("Soma dos elementos posicionados nos endereços impares: " + somaImpares);
		}
		
	}
