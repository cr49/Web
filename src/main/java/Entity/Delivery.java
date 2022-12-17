package Entity;

public class Delivery {
	private int id;
	private String name;
	private String description;
	private int price;
	private int estimate;

	public Delivery() {}

	public Delivery(int id, String name, String description, int price, int estimate) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.estimate = estimate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEstimate() {
		return estimate;
	}

	public void setEstimate(int estimate) {
		this.estimate = estimate;
	}

	@Override
	public String toString() {
		return "Delivery [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", estimate=" + estimate + "]";
	}


	
	
}
