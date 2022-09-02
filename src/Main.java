import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dwse N arithmo apostolwn/kanibalwn");
        int N = in.nextInt();
        System.out.println("Dwse M atoma pou metaferei h barka");
        int M = in.nextInt();
		State start= new State('l',N,M);
        System.out.println("Dwse K max diasxiseis");
        int k = in.nextInt();
        in.close();
		long startTimer = System.currentTimeMillis();
		State finalState = aStar.run(start,k);
		long end = System.currentTimeMillis();
		if(finalState == null) System.out.println("Could not find a solution.");
        else {
            State temp = finalState;
            ArrayList<State> tree = new ArrayList<>();
			tree.add(finalState);
            while(temp.getFather() != null) {
                tree.add(temp.getFather());
                temp = temp.getFather();
            }
            Collections.reverse(tree);
            for(State node: tree) System.out.println(node);
            System.out.println();
            System.out.println("Time: " + (double)(end - startTimer) / 1000 + " sec.");
        }
	}
	
}
