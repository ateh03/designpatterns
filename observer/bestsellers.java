package csce247.observer.simple;

import java.util.ArrayList;

public class BestSellers implements Subject {
	String book = "";
	ArrayList<Observer> observers;
	
	public BestSellers() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void addBook(String book) {
		this.book = book;
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(book);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	

}