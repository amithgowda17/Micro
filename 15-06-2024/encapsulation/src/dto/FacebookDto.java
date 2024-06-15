/* Encapsulation is on of the oops concepts in java

Encapsulation is defined as binding variables and methods into single unit

>where the variables made as private so we can't access them , instead of the
we access them through public methods*/




package dto;

public class FacebookDto {

	private int id;
	private String name;

	public FacebookDto() {

	}

	public FacebookDto(int id,String name) {
		this.id=id;
		this.name=name;

	}

	public int getId() {
		System.out.println("id==="+id);
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		System.out.println("name==="+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FacebookDto [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacebookDto other = (FacebookDto) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
