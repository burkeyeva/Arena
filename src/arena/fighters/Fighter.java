package arena.fighters;
import java.lang.*;
public class Fighter extends Person{
	private int defence;
	private int luck;
	private Sword sword;
	public Fighter() {
		super();
		defence = (int)(super.getStrength()*0.5+super.getLovkost()*0.4);
		luck = (int)(Math.random()*2+1);
	}
	public Fighter(String name) {
		super(name);
		defence = (int)(super.getStrength()*0.5+super.getLovkost()*0.4);
		luck = (int)(Math.random()*2+1);
	}
	public void setSword(Sword given) {
		sword = given;
	}
	public Sword getSword() {
		return sword;
	}
	public int getLuck() {
		return luck;
	}
	public void setWin() {
		System.out.println(super.getName()+" won!!!");
	}
	public void setLose() {
		System.out.println(super.getName()+" lost!!!");
	}
	public void fight(Fighter f) {
		boolean tern = true;
		while(!f.isDead() && !super.isDead()) {
			int udar=0;
			if(tern) {
				udar = getSword().getUron()*luck;
				int uron = (int)(udar+(super.getStrength()+getLovkost()+getIntelligence())*0.1);
				f.damage(uron);
				if(f.getHealth()<=0)
					f.setDead();
				tern = false;
			}else {
				udar = f.getSword().getUron()*f.getLuck();
				int uron = (int)(udar+(f.getStrength()+f.getLovkost()+f.getIntelligence())*0.1);
				damage(uron);
				if(getHealth()<=0)
					setDead();
				tern = true;
			}
			System.out.println(super.toString()+" "+f);
			
		}
		if(super.isDead()) {
			setLose();
			f.setWin();
			return;
		}
		setWin();
		f.setLose();
	}
}
