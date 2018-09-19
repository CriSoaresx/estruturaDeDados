package dia12;

public class List {
	Node first;
	Node last;

	public List() {
		first = last = null;
	}

	public void add(int value) {
		Node objeto = new Node(value);

		if (first == null && last == null) {
			first = objeto;
			last = objeto;
		} else {
			last.next = objeto;
			objeto.previous = last;
			last = objeto;
		}
	}

	public void delete() {
		Node aux = last.previous;
		last.next = null;
		last = aux;
	}
}
