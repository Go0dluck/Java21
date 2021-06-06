import java.util.Random;

public class Program {
    static int allSum = 0;
    static int arraySize = 0;
    static int threadsCount = 0;
    public static void main(String[] args) {
        parser(args);
        System.out.println(arraySize + " " + threadsCount);
        int[] arrNum = new Random(1).ints(arraySize, -1000, 1000).toArray();
        Multithreading[] arrThread = new Multithreading[threadsCount];
        int sizeFinish = arraySize % threadsCount;
        int sizeAll = arraySize / threadsCount;

        printAllSum(arrNum);
        for (int i = 0; i < threadsCount; i++){
            if (i == (threadsCount - 1))
                arrThread[i] = new Multithreading(arrNum, i * sizeAll, i * sizeAll + sizeAll - 1 + sizeFinish, i);
            else
                arrThread[i] = new Multithreading(arrNum, i * sizeAll, i * sizeAll + sizeAll - 1, i);
            arrThread[i].run();
        }
        System.out.println("Sum by threads: " + allSum);
    }

    public static void parser(String[] args){
        if (args.length != 2){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        String[] arr = args[0].split("=");
        if (arr.length != 2 || !arr[0].equals("--arraySize")){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        try {
            Integer.parseInt(arr[1]);
        } catch(NumberFormatException e){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        arraySize = Integer.parseInt(arr[1]);
        if (arraySize > 2000000){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        arr = args[1].split("=");
        if (arr.length != 2 || !arr[0].equals("--threadsCount")){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        try {
            Integer.parseInt(arr[1]);
        } catch(NumberFormatException e){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
        threadsCount = Integer.parseInt(arr[1]);
        if (threadsCount > arraySize){
            System.err.println("Errpr argument");
            System.exit(-1);
        }
    }

    public static void printAllSum(int[] arrNum){
        int sum = 0;

        for(int i = 0; i < arrNum.length; i++){
            sum += arrNum[i];
        }
        System.out.println("Sum: " + sum);
    }
}

class Multithreading implements Runnable{
    private int[] arrNum;
    private int start;
    private int finish;
    private int sum;
    private int id;

    Multithreading(int[] arrNum, int start, int finish, int id){
        this.arrNum = arrNum;
        this.start = start;
        this.finish = finish;
        this.id = id;
    }
    @Override
    public void run() {
        for (int i = start; i <= finish; i++) {
            sum += arrNum[i];
        }
        System.out.println("Thread " + (id + 1) + ": from " + start + " to " + finish + " sum is " + sum);
        Program.allSum += sum;
    }
}
