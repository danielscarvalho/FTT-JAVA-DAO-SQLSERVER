package cefsa.ftt.ec.fttdatabase.model;

import java.io.Serializable;

//JavaBean >> Dado >> Entidade: https://pt.wikipedia.org/wiki/JavaBeans
//POJO - Plain Old Java Object: https://pt.wikipedia.org/wiki/Plain_Old_Java_Objects

public class People implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;

	private String name;
	
	//Construtores
	public People() {
		super();
	}
	//Geters & Setters
	public People(long id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "People [id=" + id + ", name=" + name + "]";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof People) {
			return (this.getId() == ((People) obj).getId());
		} else {
			return false;
		}
	}
	
	
}
