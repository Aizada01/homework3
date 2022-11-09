public class Main {
    public static void main(String[] args) {
                double[] numbers = {6.1, -8.3, 4.5, 7.2, -6.6, 2.3, 14.7, -5.7, 3.9, -6.4, -1.1, -7.8, 11.6, 2.3, 15.4};
                double num = 0.0;
                int num2 = 0;
                for(int i = 0; i < numbers.length; i++ ){
                    if (numbers[i] < 0) {
                        for (int i1 = i + 1; i < numbers.length; i++) {
                            if (numbers [i] > 0) {
                                num += numbers [i];
                                num2 ++;}
                        }
                    }
                }
                System.out.println(+ num/num2);
            }
        }
