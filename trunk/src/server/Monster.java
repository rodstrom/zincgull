package server;

import client.Sprite;

/**
 * 
 * 
 * 
 * @author Andreas
 */
public class Monster extends Sprite implements Runnable {
	
	Thread thread = new Thread(this);
	
	//Stats
	private String name;
	private int damage;
	private int health;
	private int level;
	private int aggro;
	private String spawnLocation;
	private boolean boss;
	private int speed = 1;		//TODO add to MonsterDatabase
	
	//Active
	private int state;
	private static final int WAITING = 0;
	private static final int ATTACKING = 1;
	
	private boolean alive;
	
	public Monster() {
		
	}
	
	public synchronized void printStats() {
		System.out.println("--MONSTER STATS--");
		System.out.println("Name: "+name);
		System.out.println("Health: "+health);
		System.out.println("Damage: "+damage);
		System.out.println("Level: "+level);
		System.out.println("Aggro: "+aggro);
		System.out.println("Spawn: "+spawnLocation);
		System.out.println("Boss: "+boss);
		System.out.println("--------------");
	}

	public synchronized void run() {
		
		alive = true;
		
		while(alive) {
			
			//TODO Update -> state -> action
			
			if(state==WAITING) {
				//Check
			}
			else if(state==ATTACKING) {
				//Check
				
				//Move
				
				//Attack
			}
			
			alive = false;
		}
		
		MonsterService.dyingMonster(this);
		
	}
	
	
	
	
	//a Shitload of getters/setters
	
	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized int getDamage() {
		return damage;
	}

	public synchronized void setDamage(int damage) {
		this.damage = damage;
	}

	public synchronized int getHealth() {
		return health;
	}

	public synchronized void setHealth(int health) {
		this.health = health;
	}

	public synchronized int getLevel() {
		return level;
	}

	public synchronized void setLevel(int level) {
		this.level = level;
	}

	public synchronized int getAggro() {
		return aggro;
	}

	public synchronized void setAggro(int aggro) {
		this.aggro = aggro;
	}

	public synchronized String getSpawnLocation() {
		return spawnLocation;
	}

	public synchronized void setSpawnLocation(String spawnLocation) {
		this.spawnLocation = spawnLocation;
	}

	public synchronized boolean isBoss() {
		return boss;
	}

	public synchronized void setBoss(boolean boss) {
		this.boss = boss;
	}
	
}