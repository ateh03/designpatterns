package csce247.observer.simple;

public class Customer implements Observer {
	Subject subject;
	
	public Customer(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	public void update(String book) {
		if(book.equals("puppy chow")) {
			display();
		}
	}
	
	public void display() {
		System.out.println("display");
	}
}