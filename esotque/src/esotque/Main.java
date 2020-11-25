package esotque;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//import com.sun.tools.javac.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List <Produto>  nomes = new ArrayList<>();
 nomes.add(new Produto(10, 12, "Batata"));
 nomes.add(new Produto(10, 13, "salgadineo"));
 nomes.add(new Produto(10, 8, "iogurte"));
 nomes.add(new Produto(10, 2, "Berrteraba"));
 nomes.add(new Produto(10, 7, "Arroz"));
 nomes.add(new Produto(10, 22, "Amora"));
 nomes.add(new Produto(10, 12, "ovos"));
 
 nomes.remove(new Produto(10, 12, "ovos"));
 nomes.remove(new Produto(10, 22, "Amora"));
 
 
 if(nomes.isEmpty()) {
	 System.out.println("Lista vazia \n");
	 
 }else {
	 nomes.set(5, new Produto(3, 45, "macarrao Gourmet") );
	 nomes.set(5, new Produto(7, 14, "whey protein"));
	 System.out.println("lista de nomes :" +nomes);
 }
	}

}
