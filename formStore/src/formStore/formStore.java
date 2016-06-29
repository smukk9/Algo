package formStore;


public class formStore {

	private int id;
	private String datatype;
	private boolean required;
	private boolean visted;
	private int priority;
		
	
	public boolean isVisted() {
		return visted;
	}

	public void setVisted(boolean visted) {
		this.visted = visted;
	}



	public formStore(int id, String dt, boolean t, int pt){
		
		this.id = id;
		this.datatype= dt;
		this.required = t;
		this.visted = false;
		this.priority = pt;
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDatatype() {
		return datatype;
	}
	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public boolean getRequired(){
		
		return required;
	}
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	
	
	

	
	
	public boolean equals(Object o)
	{
		if (o == null) return false;
		if (o == this) return true; //if both pointing towards same object on heap
		
		formStore a = (formStore) o;	
		
		return this.getDatatype().equals(a.getDatatype());
		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datatype == null) ? 0 : datatype.hashCode());
		result = prime * result + id;
		result = prime * result + (required ? 1231 : 1237);
		return result;
	}

	

	


	

	


	
	
}