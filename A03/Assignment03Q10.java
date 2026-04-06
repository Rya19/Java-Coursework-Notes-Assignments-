public class Assignment03Q10 {

    public static void main(String[] args) {
        Queue queue_list = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue_list.enqueue(i);
        }

        while (!queue_list.empty()) {
            System.out.print(queue_list.dequeue() + " ");
        }
        System.out.println();
    }
}

class Queue {
    //PRIVATE   
    private int[] elements;
    private int size;
    
    //PUBLIC
    public Queue() {
        this.size = 0; //no elements right now
        elements = new int[8]; //set default size to 8
    }

    public void enqueue(int number) {
        if (size == elements.length) {
            resize();
        }

        elements[size++] = number; //adds number into queue based on size
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return 0;
        }

        int first_elem = elements[0]; //dequeues the element in the queue

        for (int i = 1; i < size; ++i) {
            elements[i - 1] = elements[i]; //shift all elements to left
        }

        size--; //decrease size
        return first_elem; //returns (have to put this in seperate variable)

    }

    public boolean empty() { //self explanatory
        return size == 0;
    }

    public int getSize() { //self exp
        return size;
    }

    private void resize() {
        int[] elementsResize = new int[size * 2];

        System.arraycopy(elements, 0, elementsResize, 0, size);
        elements = elementsResize;
    }

}