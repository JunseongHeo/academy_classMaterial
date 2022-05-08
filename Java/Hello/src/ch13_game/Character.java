package ch13_game;

public abstract class Character {
	protected int hp;
	protected int level;
	protected int energy;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();

	public boolean checkEnergy() {
		if (energy <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printInfo() {
		System.out.println("현재 캐릭터의 정보출력");
		System.out.print("    hp = "+hp);
		System.out.print("    energy = "+energy);
		System.out.print("    level = "+level+"\n");
	}
}
