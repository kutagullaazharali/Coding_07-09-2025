
import java.util.Stack;

class QueueImplementation {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    void enqueue(int x) {
        input.push(x);
    }

    int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            return -1;
        }
        return output.pop();
    }
    
    void PrintElements() {
        for (int i = output.size() - 1; i >= 0; i--) {
            System.out.println("elements : "+output.get(i));
        }
    }

}

public class QueueImp {
    public static void main(String[] args) {
        QueueImplementation q = new QueueImplementation();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println("Element : " + q.dequeue());
        q.PrintElements();
    }
}
