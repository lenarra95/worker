public class Main {
    public static void main (String[] args) {
        OnTaskDoneListener listenerOnDone = System.out::println;
        OnTaskErrorListener listenerOnError = System.out::println;
        Worker worker = new Worker(listenerOnDone, listenerOnError);
        worker.start();
    }
}