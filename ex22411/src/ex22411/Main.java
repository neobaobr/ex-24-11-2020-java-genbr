package ex22411;

public class Main {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("Relampago Marquinhos", 5, "relincha", "corre");
		Cachorro cachorro = new Cachorro("Hot the dog", 4, "late auau","corre");
		Preguica preguica = new Preguica("Travesseiro ", 7, "boceja - uaaaah", "sobe em árvores");
		
		System.out.println(cavalo.Animal());
		System.out.println(cachorro.Animal());
		System.out.println(preguica.Animal());

	}

}
