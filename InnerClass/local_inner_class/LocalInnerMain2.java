package local_inner_class;

public class LocalInnerMain2 {
	
	public void pocketMethod() {
		int exp = 5000;
//		exp = 1;
		
		class PocketMonster {
			String name = "이상해씨";
			int level = 10;
			
			public void getPocketLevel() {
				System.out.println(level);
				System.out.println(exp);
			}
		}
		
		PocketMonster pm = new PocketMonster();
		pm.getPocketLevel();
	}
	
	
	
	public static void main(String[] args) {
		LocalInnerMain2 lim = new LocalInnerMain2();
		lim.pocketMethod();
	}
}
