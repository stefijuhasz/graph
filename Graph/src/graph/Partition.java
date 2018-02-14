package graph;

import java.util.ArrayList;

public class Partition {

	
	private ArrayList<Vertex> nodes;
	private Vertex repver;
	
	public Partition(){
		setNodes(new ArrayList<Vertex>());
	}
	
	public void addNode(Vertex v){
		boolean found = false;
		
		if(!getNodes().isEmpty()){
			for(int i = 0; i<getNodes().size();i++){
				if(getNodes().get(i).equals(v)){
					found = true;
				}
			}
		}
		
		if(!found){
			getNodes().add(v);
		}
	}

	public ArrayList<Vertex> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Vertex> nodes) {
		this.nodes = nodes;
	}

	public Vertex getRepver() {
		return repver;
	}

	public void setRepver(Vertex repver) {
		this.repver = repver;
	}
}
