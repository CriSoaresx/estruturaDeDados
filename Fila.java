package dia19;

public class Fila {
	int front;
	int back;
	// fila
	int[] queue;

	// pq é um array então passa o tamanho por parametro
	public Fila(int tamanho) {
		front = 0;
		back = 0;
		queue = new int[tamanho];
	}

	public void enqueue(int value) {
		if (back == queue.length)
			System.out.println("Lista Cheia");
		else {
			this.queue[back] = value;
			this.back++;
		}
	}

	public int dequeue() {
		int aux = -1;
		if (front == 0 && back == 0)
			System.out.println("Lista vazia");
		else {
			aux = this.queue[front];
			this.front++;
		}
		return aux;
	}
}
