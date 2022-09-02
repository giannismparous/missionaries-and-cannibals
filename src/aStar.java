import java.util.PriorityQueue;

public class aStar {
	private static int counter=-1;
	static boolean counterHelp=false;
	public static State run(State start,int k){
	    PriorityQueue<State> closedList = new PriorityQueue<>();
	    PriorityQueue<State> openList = new PriorityQueue<>();

	    start.f = start.g + start.calculateHeuristic();
	    openList.add(start);

	    while(!openList.isEmpty() && counter<k){
	        State n = openList.peek();
			counter++;
	        if(n.isTerminal()){
	            return n;
	        }

	        for(State child : n.findValidStates()){
	        	
	        	int totalWeight = n.g + 1;
	        	
	            if(!openList.contains(child) && !closedList.contains(child)){
	                child.setFather(n);
	                child.g=totalWeight;
	                child.f = child.g + child.calculateHeuristic();
	                openList.add(child);
					counterHelp=true;
	            } else {
	                if(totalWeight < child.g){
	                    child.setFather(n);
	                    child.g=totalWeight;
		                child.f = child.g + child.calculateHeuristic();

	                    if(closedList.contains(child)){
	                        closedList.remove(child);
	                        openList.add(child);
							counterHelp=true;
	                    }
	                }
	            }
	        }
			if (!counterHelp)counter--;
			counterHelp=false;
	        openList.remove(n);
	        closedList.add(n);
	    }
	    return null;
	}

}
