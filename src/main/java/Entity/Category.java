package Entity;

public class Category {
	
	private int id;
	private String name;
	private String create;
	
	public Category() {}
	
	public Category(int id, String name, String create) {
		this.id = id;
		this.name = name;
		this.create = create;
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

	public String getCreate() {
		return create;
	}

	public void setCreate(String create) {
		this.create = create;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", create=" + create + "]";
	}
	
	
	
}
