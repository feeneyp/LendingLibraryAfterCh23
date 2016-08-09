package models;

public abstract class Material {

	private String id;
	private String title;
	private String branch;
	private Customer borrower;
	
	public Material(String id, String title, String branch) {
		this.id = id;
		this.title = title;
		this.branch = branch;
	}

	public String getTitle() {
		return title;
	}
	
	public String getID() {
		return id;
	}
	
	public void relocate (String newBranch) {
		this.branch = newBranch;
	}
	
	public String lend(Customer customer) {
		if (borrower == null) {
			borrower = customer;
			return "now loaned to " + borrower.getSurname();

		}
		else {
			return "already on loan";
		}
	}
	
	//must be overridden
	public abstract int getLoanPeriod();
	
	@Override
	public String toString() {
		return id + " : " + title;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() == obj.getClass())
		{
			Material otherClass = (Material)obj;
			if (id == otherClass.id) {
				return "now loaned to " + borrower.getSurname();

			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	
}
