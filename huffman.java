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
	
	for (int i = 0; i < n; i++) {

			// creating a Huffman node object
			// and add it to the priority queue.
			HuffmanNode hn = new HuffmanNode();

			hn.c = charArray[i];
			hn.data = charfreq[i];

			hn.left = null;
			hn.right = null;

			// add functions adds
			// the huffman node to the queue.
			q.add(hn);
		}
	
	HuffmanNode root = null;
	while (q.size() > 1) {
			HuffmanNode x = q.peek();
			q.poll();

			// second min extract.
			HuffmanNode y = q.peek();
			q.poll();

			// new node f which is equal
			HuffmanNode f = new HuffmanNode();
	}
    }
}
