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
        Runnable egg = () -> {
            for (int i = 0; i < size; i++){
                System.out.println("Egg");
            }
        };
        Runnable hen = () -> {
            for (int i = 0; i < size; i++){
                System.out.println("Hen");
            }
        };
        Thread threadEgg = new Thread(egg);
        Thread threadHen = new Thread(hen);
        threadEgg.start();
        threadHen.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < size; i++){
            System.out.println("Human");
        }
    }
}
