package arena.fighters;
import java.lang.*;
public class Person {
	private int strength;
	private String name;
	private int intelligence;
	private int lovkost;
	private int health;
	private boolean dead;
	public Person() {
		strength = (int)(Math.random()*100+10);
		lovkost = (int)(Math.random()*100+10);
		intelligence = (int)(Math.random()*100+10);
		health = strength*10;
		dead = false;
	}
	public Person(String name) {
		this();
		this.name = name;
	}
	public void setStrength(int s) {
		strength = s;
	}
	public int getStrength() {
		return strength;
	}
	public void setIntelligence(int s) {
		intelligence = s;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setLovkost(int s) {
		lovkost = s;
	}
	public int getLovkost() {
		return lovkost;
	}
	public void damage(int h) {
		health-=h;
	}
	public int getHealth() {
		return health;
	}
	public void setDead() {
		dead = true;
	}
	public boolean isDead() {
		return dead;
	}
	public String getName() {
		return name;
	}
	public void work() {
		strength +=(int)(Math.random()*10);
		lovkost += (int)(Math.random()*10);
		intelligence += (int)(Math.random()*10);
	}
	public String toString() {
		return name+" "+health+" "+dead;
	}
}
