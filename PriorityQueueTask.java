import java.util.PriorityQueue;

class Task implements Comparable<Task>{
    int priority;
    String name;

    public Task(String name,int priority){
        this.name=name;
        this.priority=priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}
class PriorityQueueTask {
    public static void main(String[] args) {
        System.out.println("Task Manager : ");
        PriorityQueue<Task> Taskpq = new PriorityQueue<>();
        Taskpq.add(new Task("Bud", 1));
        Taskpq.add(new Task("New deployement", 3));
        Taskpq.add(new Task("kt", 5));
        System.out.println(""+Taskpq);
    }
}