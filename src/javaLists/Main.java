package javaLists;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main (String [] args) {
		List <String>nomes = new ArrayList(); // Instanciando o objeto lista e definindo minha lista do tipo String
		nomes.add("Ana"); //Adicionando nomes a lista
		nomes.add("Luis");
		nomes.add("Roberto");
		
		//String nome = nomes.get(0); // Pegar nomes da lista apartir de índices
		
		//System.out.println(nomes); // Exibindo nomes da lista
		
		//Outra forma de imprimir conteúdo da lista é iterando por ela com foreach
		
		for(String nome: nomes) {
			System.out.println(nome);
		} // Exibindo nomes da lista usando foreach
		
		// Caso queira adicionar outro obejo em uma posição da lista, podemos utilizar o método abaixo
		
		nomes.add(0, "Carlos" );// ex: nomes.add(indice da lista que deseja acionar, objeto que deseja adicionar)
		
		System.out.println(nomes); // Exibindo nomes com o novo objeto adicionado
		
		System.out.println("Quantidade de objetos na lista: " + nomes.size()); // este método mostra quantos iténs eu tenho na lista
		
		nomes.remove("Ana"); // Este método serve para remover um objeto da lista
		
		System.out.println(nomes); // Mostrando lista com objeto removido
		
		boolean existeOObjeto = nomes.contains("Luis"); //Verifica se determinado objeto existe na lista
		
		System.out.println(existeOObjeto); // mostra se existe o objeto em questão
	}
	
	
}
