
package week8;
import java.util.LinkedList;

public class Week8 {

    int VertexOfGraph; 
	        LinkedList<Integer> adjacencyListArray[]; 
	        
	          
	        
	        Week8(int VertexOfGraph) 
	        { 
	            this.VertexOfGraph = VertexOfGraph; 
	            adjacencyListArray = new LinkedList[VertexOfGraph];
	            for(int i = 0; i < VertexOfGraph ; i++){ 
	                adjacencyListArray[i] = new LinkedList<>(); 
	            } 
	        } 
	
	        public static void main(String args[]) 
		    { 
		        int VertexOfGraph = 5; 
		        Week8 DirGraph = new Week8(VertexOfGraph); 
		        addEdge(DirGraph, 0, 1); 
		        addEdge(DirGraph, 0, 2);
		        addEdge(DirGraph, 0, 3);
		        addEdge(DirGraph, 0, 4);
		        addEdge(DirGraph, 1, 2); 
		        addEdge(DirGraph, 1, 3); 
		        addEdge(DirGraph, 1, 4); 
		        addEdge(DirGraph, 2, 3); 
		        addEdge(DirGraph, 3, 4); 
		        printWeek8(DirGraph); 
		    } 

	    static void addEdge(Week8 Week8, int src, int dest) 
	    { 
	      
	        Week8.adjacencyListArray[src].add(dest); 
	     
	    } 
	       
	    
	    static void printWeek8(Week8 Week8) 
	    {        
	        for(int VertexOfGraph = 0; VertexOfGraph < Week8.VertexOfGraph; VertexOfGraph++) 
	        { 
	            System.out.println("Vertex Number"+ VertexOfGraph); 
	            System.out.print("value"); 
	            for(Integer Values: Week8.adjacencyListArray[VertexOfGraph]){ 
	                System.out.print(" -> "+Values); 
	            } 
	            System.out.println("\n"); 
	        } 
	    } 
    
}
