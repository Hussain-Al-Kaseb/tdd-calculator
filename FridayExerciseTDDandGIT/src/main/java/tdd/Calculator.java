package tdd;

public class Calculator {
    public static void main(String[] args) {

    }
    public int calcAdd(String a) {
        String[] parts = a.split(",");
        int result = 0;

        for (String part : parts) {
            result += Integer.parseInt(part.trim());
        }

        return result;
    }
    public int calcAdd(int[] a) {
        int result = 0;
        for (int num : a) {
            result += num;
        }
        return result;
    }


    public int calcSub(int a, int b) {
        return a - b;
    }
    public int calcMultiply(int a, int b) {
        return a * b;
    }
    public int calcDivide(int a, int b) {
        return a / b;
    }
}
