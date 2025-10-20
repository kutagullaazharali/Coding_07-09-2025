

class StackImp {
    int top;
    int arr[];
    int size;

    public StackImp(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow.......");
            return;
        }
        arr[++top] = data;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow.......");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        return arr[top];
    }

    void Display() {
         for (int i = top; i >= 0; i--) {
            System.out.println("element : "+arr[i]);
        }
    }
}

class StackImplementation {
    public static void main(String[] args) {
        StackImp s = new StackImp(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.Display();
    }
}