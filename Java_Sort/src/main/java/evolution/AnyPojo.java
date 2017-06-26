package evolution;

public class AnyPojo {
	private String name;
	private long id;

	public AnyPojo() {
	
	}
	
	public AnyPojo(long id, String name) {
		this.name = name;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AnyPojo [name=" + name + ", id=" + id + "]";
	}
}
