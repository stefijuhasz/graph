package tree;

import java.util.ArrayList;
import java.util.HashMap;

import graph.Edge;
import graph.Vertex;

public class TreeLevel {
	private HashMap<Vertex,ArrayList<Edge>> levelData; 
	
	public TreeLevel(){
		setLevelData(new HashMap<Vertex,ArrayList<Edge>>());
	}

	public HashMap<Vertex,ArrayList<Edge>> getLevelData() {
		return levelData;
	}

	public void setLevelData(HashMap<Vertex,ArrayList<Edge>> levelData) {
		this.levelData = levelData;
	}
	
	public void addData(Vertex v, ArrayList<Edge> e){
		levelData.put(v,e);
	}

}
