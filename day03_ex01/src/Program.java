public class Program {
    public static void main(String[] args) {
        int size;

        if (args.length != 1){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        String[] arr = args[0].split("=");
        if (arr.length != 2 || !arr[0].equals("--count")){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        try {
            Integer.parseInt(arr[1]);
        } catch(NumberFormatException e){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        size = Integer.parseInt(arr[1]);
        Print print = new Print();
        Egg egg = new Egg(print, size);
        Hun hun = new Hun(print, size);
        new Thread(egg).start();
        new Thread(hun).start();
    }
}

class Print{
    private int flag =0;
    public synchronized void printHug() {
        while (flag == 0) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        flag--;
        System.out.println("HUN");
        notify();
    }
    public synchronized void printEgg() {
        while (flag == 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        flag++;
        System.out.println("EGG");
        notify();
    }
}

class Egg implements Runnable{

    Print print;
    int size;
    Egg(Print print, int size){
        this.print=print;
        this.size = size;
    }
    public void run(){
        for (int i = 1; i < size; i++) {
            print.printEgg();
        }
    }
}

class Hun implements Runnable{

    Print print;
    int size;
    Hun(Print print, int size){
        this.print=print;
        this.size = size;
    }
    public void run(){
        for (int i = 1; i < size; i++) {
            print.printHug();
        }
    }
}