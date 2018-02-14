package graph;

public class Vertex {
	private String name;
	private int id;
	private boolean inpart;
	
	public Vertex(String n){
		name = n;
		String[] split = n.split("x");
		setId(Integer.parseInt(split[1]));
		inpart = false;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean getInPart(){
		return inpart;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setInPart(boolean v){
		inpart= v;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
