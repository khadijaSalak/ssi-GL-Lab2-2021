public class Huffman {
  public static void printCode(HuffmanNode root, String s)
    {
    return;
    }
public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);

		// number of characters.
		int n = 6;
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
		int[] charfreq = { 5, 9, 12, 13, 16, 45 };

		// creating a priority queue q.
		// makes a min-priority queue(min-heap).
		PriorityQueue<HuffmanNode> q
			= new PriorityQueue<HuffmanNode>(n, new MyComparator());
    }
}
