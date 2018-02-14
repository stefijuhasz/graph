package handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import graph.DirectedGraph;
import graph.Edge;

public class MakeGvFile {

	public void makeFile(DirectedGraph g,String filename){
		PrintWriter writer;
		ArrayList<Edge> edges = g.getEdgeList();
		
		try {
			writer = new PrintWriter(filename);
			writer.println("digraph reduced {");
			for(int i = 0;i<edges.size();i++){
				writer.println(edges.get(i).getSource().getName()+" -> "+edges.get(i).getTarget().getName()+" [ label = \""+edges.get(i).getWeight().intValue()+"\" ];");
			}
			writer.println("}");
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("nem sikerult megnyitni");
		}
	}
	
}
