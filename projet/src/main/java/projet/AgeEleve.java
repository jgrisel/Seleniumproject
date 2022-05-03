package projet;

public enum AgeEleve {
	six(6),
	sept(7),
	huit(8),
	neuf(9),
	dix(10);

	private int age;

	AgeEleve(int age) {
	this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}
