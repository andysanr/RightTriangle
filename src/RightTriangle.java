public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isRightTriangle = (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);

        System.out.println(isRightTriangle);
    }
}