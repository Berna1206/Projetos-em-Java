import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
			
			// Cria um HashMap
			HashMap<String, String> myMap = new HashMap<>();
			// Cria chaves e seus respectivos valores
			myMap.put("Nome", "João");
			myMap.put("Idade", "18");
			myMap.put("CPF", "123.456.789-01");
			myMap.put("Sexo", "Masculino");
			myMap.put("Raça", "Branco");
			
			// Fornece todas as chaves e valores da lista
			System.out.println("Lista completa: " + myMap);
			// Mostra o valor da chave "Idade"
			System.out.println("Idade: " + myMap.get("Idade"));
			
			// Remove a chave "Nome"
			myMap.remove("Nome");
			
			// Verifica se a lista está vazia
			System.out.println("A lista está vazia? " + myMap.isEmpty());
			
			// Mostra quantas chaves a lista possui
			System.out.println("Tamanho da lista: " + myMap.size());
			
			// Exemplo que apresenta as chaves que compoem
			// a lista
			for (String i : myMap.keySet()) {
				System.out.println("Chave: " + i);
			}
			// Exemplo que apresenta os valores que compoem
			// a lista
			for (String i : myMap.values()) {
				System.out.println("Valor: " + i);
			}
		}
		
	}
