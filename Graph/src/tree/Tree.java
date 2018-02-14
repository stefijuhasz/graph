package tree;

import java.util.ArrayList;

import graph.Vertex;

public class Tree {
	private Vertex topLevel;
	private ArrayList<TreeLevel> levels;
	
	public Tree(){
		setLevels(new ArrayList<TreeLevel>());
	}

	public void setTopLevel(Vertex v){
		topLevel = v;
	}
	
	public Vertex getTopLevel(){
		return topLevel;
	}

	public ArrayList<TreeLevel> getLevels() {
		return levels;
	}

	public void setLevels(ArrayList<TreeLevel> levels) {
		this.levels = levels;
	}
	
	public void addLevel(TreeLevel tl){
		levels.add(tl);
	}
}
