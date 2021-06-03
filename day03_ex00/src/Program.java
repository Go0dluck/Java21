public class Program {
    public static void main(String[] args) {
        String[] arr = args[0].split("=");
        int size = Integer.parseInt(arr[1]);
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
        for (int i = 0; i < size; i++){
            System.out.println("Human");
        }
    }
}
