//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Joshua Vento-Jones

public class HistoNode
{
	private char letter;
	private int letterCount;
	private HistoNode next;

	// @param let for the current node, sets letter instance variable.
	// @param count for the current node, sets letterCount instance variable.
	// @param n for the nodes after this current node, sets next instance variable.
	public HistoNode(char let, int cnt, HistoNode n)
	{
		letter=let;
		letterCount=cnt;
		next=n;
	}
	
	// @return char letter, the letter for the current node.
	public char getLetter()
	{
		return letter;
	}

	// @return int letterCount, the letter's count for the current node.
	public int getLetterCount()
	{
		return letterCount;
	}

	// @return HistoNode next, the following HistoNode after this current one.
	public HistoNode getNext()
	{
	   return next;
	}

	// @param char let, the value to set instance variable letter to.
	public void setLetter(char let)
	{
		letter=let;
	}

	// @param int cnt, the value to set instance variable letterCount to (how many values of the letter).
	public void setLetterCount(int cnt)
	{
		letterCount=cnt;
	}

	// @param HistoNode n, the HistoNode to set the following HistoNode (next) to
	public void setNext(HistoNode n)
	{
		next = n;
	}
}
