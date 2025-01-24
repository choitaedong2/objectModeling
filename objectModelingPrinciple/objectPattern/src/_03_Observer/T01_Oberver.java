package _03_Observer;

public class T01_Oberver {

	public static void main(String[] args) {
		Subject subject = new ConcreateSubject();
		
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		
		// 구독자(감시자)를 등록
		subject.registerObserver(oa);
		subject.registerObserver(ob);
		
		subject.notifyObserver();
		System.out.println("============================");
		subject.notifyObserver();
		
		subject.removeObserver(oa);
		System.out.println("============================");
		
		subject.notifyObserver();
	}

}
