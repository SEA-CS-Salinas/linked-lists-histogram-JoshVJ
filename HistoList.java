//(c) A+ Computer Science

//www.apluscompsci.com

//Name - Joshua Vento-Jones

import java.util.*;
import static java.lang.System.*;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
 private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	// @param let The letter to add to the node, if it exists, it will increment the letter count by one, otherwise it creates a new node.
	public void addLetter(char let)
	{
      HistoNode current = front;
      int index = indexOf(let);
      if(index != -1) {
    	  current = front;
    	  for(int i = 0; i<index; i++) {
    		  current = current.getNext();
    	  }
    	  current.setLetterCount(current.getLetterCount()+1);
      }
      else {
    	  front = new HistoNode(let, 1, front);
      }
    }

	//returns the index pos of let in the list if let exists
	// @param let, The letter to check the index position of the node. 
	// @return Integer, -1 if index is not found, otherwise returns index of the found letter.
	public int indexOf(char let)
	{
	  HistoNode current = front;
	  int index = -1;
	  int count = 0;
      while(current!=null) {
    	  if(current.getLetter()==let) {
    		  index = count;
    	  }
    	  count++;
    	  current = current.getNext();
      }
    	 return index;
	}

	//returns a reference to the node at spot
	// @return HistoNode current, the node at the spot parameter.
	// @param int spot, the number to check the node of (so the node at the spot and the rest of the data following)
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=front;
		int index = 0;
		while(index != spot && current !=null){
          current = current.getNext();
          index++;
		}
		return current;
	}

	//returns a string will all values from list
	// @return A String output with each of the nodes and their values in one line. Each value separated by a tab.
	public String toString()
	{
		String output = "";
      HistoNode current = front;
		while(current!=null) {
			output += current.getLetter() + " - "  + current.getLetterCount() + "\t";
			current = current.getNext();
		}
		return output;
	}
