public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        double[] box = {1.57, 7.654, 9.986};
        System.out.println(box[0]);
        System.out.println(box[1]);
        System.out.println(box[2]);
        int[] weights = new int[7];
        weights[0] = 90;
        weights[1] = 80;
        weights[2] = 70;
        weights[3] = 60;
        weights[4] = 50;
        weights[5] = 40;
        weights[6] = 30;
        for (int i = 0; i < 7; i++) {
            System.out.println(weights[i]);
        }
    }
}