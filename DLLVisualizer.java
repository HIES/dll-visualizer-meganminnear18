import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author (your name)
 */

public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        // TO DO: Define credentials
        final String API_KEY = "891238522444";
        final String USER_ID = "meganminnear18";
        
        // No need to modify Bridges constructor
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        // TO DO: Build the objects to be added to your DLL
        Track song1 = new Track("Mr. Blue Sky", "Electric Light Orchestra");
        Track song2 = new Track("Don't Bring Me Down", "Electric Light Orchestra");
        Track song3 = new Track("Shine a Little Love", "Electric Light Orchestra");
        Track song4 = new Track("Strange Magic", "Electric Light Orchestra");


        // TO DO: Build the head 
        DLelement head = new DLelement(song1.toString(), song1);
        
        // TO DO: Create the rest of the Nodes/DLelements and link them to form a DLL
        DLelement next1 = new DLelement(song2.toString(), song2);
        DLelement next2 = new DLelement(song3.toString(), song3);
        DLelement next3 = new DLelement(song4.toString(), song4);
        
        

        head.setNext(next1);
        head.setPrev(null);
        next1.setNext(next2);
        next1.setPrev(head);
        next2.setNext(next3);
        next2.setPrev(next1);
        next3.setNext(null);
        next3.setPrev(next2);
        

        
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}
