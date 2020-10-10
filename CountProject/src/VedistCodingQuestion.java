
class VedistCodingQuestion {

	static Elem head;
	static class Elem{
		int d;
		Elem nxt;
		Elem(int x){
			d = x;
			nxt = null;
		}
	}
	Elem reverse(Elem Elem)
	{
		Elem prev = null;
		Elem curr = Elem;
		Elem next = null;
		while (curr != null) {
			next = curr.nxt;
			curr.nxt = prev;
			prev = curr;
			curr = next;
		}
		Elem = prev;
		return Elem;
	}

	void printLnkL(Elem Elem){
		while (Elem != null){
			System.out.print(Elem.d + " ");
			Elem = Elem.nxt;
		}
	}

	public static void main(String[] args){
		VedistCodingQuestion lnkL = new VedistCodingQuestion();
		lnkL.head = new Elem(1);
		lnkL.head.nxt = new Elem(2);
		lnkL.head.nxt.nxt = new Elem(3);

		System.out.println("Input: ");
		lnkL.printLnkL(head);
		head = lnkL.reverse(head);
		System.out.println("\nOutput: ");
		lnkL.printLnkL(head);
	}
}