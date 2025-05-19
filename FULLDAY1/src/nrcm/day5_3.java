package nrcm;
class movie{
	void gener() {
		System.out.println("Crime thriller");
	}
}
class Hit extends movie {
	void Action() {
		System.out.println("Investigation");
	}
}
class Hero extends Hit {
	void Name() {
		System.out.println("Nani");
	}
}
class Heroin extends Hit {
	void Looks() {
		System.out.println("Good");
	}
}
public class day5_3 {

	public static void main(String[] args) {
		Hero h1=new Hero();
		Heroin h2=new Heroin();
		h1.gener();
		h1.Action();
		h1.Name();
		h2.Looks();
	}

}
