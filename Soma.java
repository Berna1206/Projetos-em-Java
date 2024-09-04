public class Soma {

	public static void main(String[] args) {
			
			int valores[] = {2,3,5,8,1,4};
			int somaTotal = 0;
			int somaImpares = 0;
			int somaPares = 0;
			
			for(int i = 0; i < valores.length; i++) {
				somaTotal += valores[i];
				if(i % 2 == 1) {
					somaImpares += valores[i];
				}
				if(valores[i] % 2 == 0) {
					somaPares += valores[i];
				}
				
			}
			
			System.out.println("Soma de todos os valores da lista: " +somaTotal);
			System.out.println("Soma dos valores que ocupam endereços impares: " +somaImpares);
			System.out.println("Soma dos valores pares: " +somaPares);
			
		}
		
}
