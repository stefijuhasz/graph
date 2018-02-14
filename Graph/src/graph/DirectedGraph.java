package graph;

import java.util.ArrayList;

public class DirectedGraph {
	private ArrayList<Edge> edgeList;
	private int vertexNum;

	public DirectedGraph(int n){
		edgeList = new ArrayList<Edge>();
		vertexNum = n;
	}
	
	public int getvertexNum(){
		return vertexNum;
	}
	
	public ArrayList<Edge> getEdgeList(){
		return edgeList;
	}
	
	public void addEdge(Edge e){
		
		/*if(!edgeList.isEmpty()){
			int foundSource=0;
			int foundTarget=0;
			
			for(int i = 0;i<edgeList.size();i++){
				if(e.getSource().equals(edgeList.get(i).getSource())){
					foundSource++;
				}
				if(e.getSource().equals(edgeList.get(i).getTarget())){
					foundSource++;
				}
				if(e.getTarget().equals(edgeList.get(i).getSource())){
					foundTarget++;
				}
				if(e.getTarget().equals(edgeList.get(i).getTarget())){
					foundTarget++;
				}
			}
			if(foundSource==0) vertexNum++;
			if(foundTarget==0) vertexNum++;
		}*/
		edgeList.add(e);
		
	}
	
	public void addEdge(Vertex s, Vertex t, Double w){
		Edge e = new Edge(s,t,w);
		
		/*if(!edgeList.isEmpty()){
			int foundSource=0;
			int foundTarget=0;
			
			for(int i = 0;i<edgeList.size();i++){
				if(e.getSource().equals(edgeList.get(i).getSource())){
					foundSource++;
				}
				if(e.getSource().equals(edgeList.get(i).getTarget())){
					foundSource++;
				}
				if(e.getTarget().equals(edgeList.get(i).getSource())){
					foundTarget++;
				}
				if(e.getTarget().equals(edgeList.get(i).getTarget())){
					foundTarget++;
				}
			}
			if(foundSource==0) vertexNum++;
			if(foundTarget==0) vertexNum++;
		}*/
		
		edgeList.add(e);
	}
	
	public boolean removeEdge(Edge e){
		boolean deleted = edgeList.remove(e);
		
		/*if(deleted){
			int foundSource=0;
			int foundTarget=0;
			
			for(int i = 0;i<edgeList.size();i++){
				if(e.getSource().equals(edgeList.get(i).getSource())){
					foundSource++;
				}
				if(e.getSource().equals(edgeList.get(i).getTarget())){
					foundSource++;
				}
				if(e.getTarget().equals(edgeList.get(i).getSource())){
					foundTarget++;
				}
				if(e.getTarget().equals(edgeList.get(i).getTarget())){
					foundTarget++;
				}
			}
			if(foundSource==0) vertexNum--;
			if(foundTarget==0) vertexNum--;
		}*/
		return deleted;
	}
	
//	public boolean removeEdge(int id){
//		for(int i = 0;i < edgeList.size();i++){
//			if(edgeList.get(i).getId() == id){
//				return edgeList.remove(edgeList.get(i));
//			}
//		}
//		return false;
//	}
}
