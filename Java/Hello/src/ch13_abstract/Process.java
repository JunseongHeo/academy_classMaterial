package ch13_abstract;

public class Process {
	private DbInterface db;
	
	public Process(DbInterface db) {
		this.db = db;
	}
	
	void connect() {
		db.connect();
	}
	void select() {
		db.select();
	}
	void insert() {
		db.insert();
	}
	void update() {
		db.update();
	}
	void delet() {
		db.delete();
	}
}
