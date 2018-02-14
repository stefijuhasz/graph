package graph;

public class Edge {
	//private int id;
	private Vertex source, target;
	private Double weight;
	private boolean red;
	
	public Edge(Vertex s, Vertex t, Double w ){
		//this.setId(id);
		setSource(s);
		setTarget(t);
		setWeight(w);
		setRed(false);
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public Vertex getSource() {
		return source;
	}

	public void setSource(Vertex source) {
		this.source = source;
	}

	public Vertex getTarget() {
		return target;
	}

	public void setTarget(Vertex target) {
		this.target = target;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public boolean isRed() {
		return red;
	}

	public void setRed(boolean red) {
		this.red = red;
	}
	
	

}
