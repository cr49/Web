package Entity;

public class Product {
	private int id;
	private String name;
	private String description;
	private int categoryid;
	private int storeid;
	private int rating;
	private String create;
	private int price;
	private String image;
	private String size;
	private int quantity;
	
	public Product() {}
	
	public Product(int id, String name,String description, int categoryid, 
			int storeid, int rating, String create , int price, String image, String size, int quantity) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.categoryid = categoryid;
		this.storeid = storeid;
		this.rating = rating;
		this.create = create;
		this.price = price;
		this.image = image;
		this.size = size;
		this.quantity = quantity;
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

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", categoryid=" + categoryid
				+ ", storeid=" + storeid + ", rating=" + rating + ", create=" + create + ", price=" + price + ", image="
				+ image + ", size=" + size + ", quantity=" + quantity + "]";
	}

	
	
}
