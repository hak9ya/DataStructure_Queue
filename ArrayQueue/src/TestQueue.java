//Array Queue

public class TestQueue {
	static class Queue{
		private int front;
		private int rear;
		private int queueSize;
		private int queueArr[];
		
		public Queue(int queueSize) {
			front = -1;
			rear = -1;
			queueArr = new int[queueSize];
			this.queueSize = queueSize;
		}
		
		public boolean isEmpty() {
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			return (front == rear);
		}
		
		public boolean isFull() {
			return (rear == this.queueSize-1);
		}
		
		public void enqueue(int data) {
			if(isFull()) {
				System.out.println("큐가 가득 참");
			} else {
				queueArr[++rear] = data;
				System.out.println("Insert data : " + data);
			}
		}
		
		public int dequeue() {
			if(isEmpty()) {
				System.out.println("삭제 실패, 큐가 비어있음");
				return 0;
			} else {
				System.out.println("Delete data : " + queueArr[front + 1]);
				front = (front + 1) % this.queueSize;
				
				return queueArr[front];
			}
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("추출 실패, 큐가 비어있음");
				return 0;
			} else {
				System.out.println("Peek Data : " + queueArr[front + 1]);
				return queueArr[front + 1];
			}
		}
		
		public void printQueue() {
			if(isEmpty()) {
				System.out.println("큐가 비어있음");
			} else {
				System.out.println("Queue list : ");
				for(int i=front+1; i<=rear; i++) {
	                System.out.print(queueArr[i] + " ");
	            }
	            System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int queueSize = 5;
		Queue arrQueue = new Queue(queueSize);	//객체 생성
		
        arrQueue.enqueue(1);
        arrQueue.printQueue();

        arrQueue.enqueue(2);
        arrQueue.printQueue();
        
        arrQueue.enqueue(3);
        arrQueue.printQueue();
        
        arrQueue.enqueue(4);
        arrQueue.printQueue();
        
        arrQueue.enqueue(5);
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.dequeue();
        arrQueue.printQueue();
        
        arrQueue.peek();
        arrQueue.printQueue();
        
	}

}
