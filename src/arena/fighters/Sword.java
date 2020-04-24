package arena.fighters;

public class Sword {
	private int uron;
	public Sword() {
		uron = (int)(Math.random()*5+1);
	}
	public int getUron() {
		return uron;
	}
}
