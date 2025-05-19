package Assignment;
interface season{
	void summer();
}
interface season1{
	void monsoon();
}
interface season2 extends season,season1{
	void winter();
}
class Season3{
	void post() {
	}
}
class Climate extends Season3 implements season2{
	public void climate() {
		System.out.println("India has 4 major seasons: ");
	}
	public void summer() {
		System.out.println("1.Summer from (Mar–May)");
	}
	public void monsoon() {
		System.out.println("2.Monsoon from (Jun–Sep)");
	}
	public void winter() {
		System.out.println("3.Winter from (Dec–Feb)");
	}
	public void post() {
		System.out.println("4.Post-monsoon form (Oct–Nov)");
	}
}
public class No9 {

	public static void main(String[] args) {
		Climate c1=new Climate();
		c1.climate();
		c1.summer();
		c1.monsoon();
		c1.winter();
		c1.post();
	}

}
