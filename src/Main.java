import java.util.Arrays;

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
        System.out.println("Task2");
        int[] weight1 = new int[3];
        weight1[0] = 1;
        weight1[1] = 2;
        weight1[2] = 3;
        System.out.print(weight1[0] + ",");
        System.out.print(weight1[1] + ",");
        System.out.print(weight1[2] + "");
        System.out.println();
        double[] box1 = {1.57, 7.654, 9.986};
        System.out.print(box1[0]+",");
        System.out.print(box1[1]+",");
        System.out.print(box1[2]);
        System.out.println();
        System.out.println("Task3");
        int[] weight2 = new int[3];
        weight2[0] = 1;
        weight2[1] = 2;
        weight2[2] = 3;
        System.out.print(weight2[2] + ",");
        System.out.print(weight2[1] + ",");
        System.out.print(weight2[0] + "");
        System.out.println();
        double[] box2 = {1.57, 7.654, 9.986};
        System.out.print(box2[2]+",");
        System.out.print(box2[1]+",");
        System.out.print(box2[0]);
        System.out.println();
        System.out.println("Task4");
        int[] code = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < code.length; i++) {
            if (code[i] % 2 != 0){
                code[i] = code[i] + 1;
            }
        }
        System.out.print(Arrays.toString(code));

    }
}