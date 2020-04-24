package arena.fighters;

import java.util.ArrayList;

public class Kuznec extends Person{
	private ArrayList<Sword> swords;
	public Kuznec() {
		super();
		swords = new ArrayList<Sword>();
	}
	public ArrayList<Sword> getSwords(){
		return swords;
	}
	public void makeSwords(int n) {
		for(int i=0;i<n;i++) {
			work();
		}
	}
	public Sword giveSword() {
		Sword s = swords.get((int)(Math.random()*(swords.size()-1)));
		swords.remove(s);
		return s;
	}
	@Override 
	public void work() {
		super.setStrength((int)Math.random()*20);
		super.setIntelligence((int)Math.random()*10);
		int travma = (int)(Math.random()*9);
		swords.add(new Sword());
		if(travma==4) {
			super.damage(60);
			if(super.getHealth()<=0) {
				super.setDead();
			}
		}
	}
}
