package animais;

public class Main {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("Relampago marquinhos", 3, "corre");
		Cachorro cachorro = new Cachorro("cachorossauro rex", 3, "corre");
		Preguica preguica = new Preguica("Soneca", 5, "sobe em árvores");

		System.out.println(cavalo.Animal() + cavalo.getSom());
		System.out.println(cachorro.Animal() + cachorro.getSom());
		System.out.println(preguica.Animal() + preguica.getSom());

	}

}
