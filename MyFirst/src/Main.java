
public class Main {
	public static void main (String [] args) {
		System.out.println("Hello World!");
		cetakHello();
		CetakNama ct = new CetakNama();
		
		for(int i = 0; i <= 20; i++) {
			ct.cetaknamaku();
			System.out.println(i);
		}
	}
	
	static void cetakHello() {
		System.out.println("Hello");
	}
}
