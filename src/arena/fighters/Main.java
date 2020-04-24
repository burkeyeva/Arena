package arena.fighters;

public class Main {
	public static void main(String args[]) {
		Fighter f1 = new Fighter("Name");
		Fighter f2 = new Fighter("Kate");
		Kuznec k = new Kuznec();
		k.makeSwords(10);
		f1.setSword(k.giveSword());
		f2.setSword(k.giveSword());
		System.out.println(f1);
		System.out.println(f2);
		f1.fight(f2);
		System.out.print(f1);
		System.out.print(f2);

		
	}
}
