public class MultiplyWithoutMultiply {
    public static int solution(int x, int y) {
        int result = 0;
        boolean negative = false;
        if (x < 0) {
            x = -x;
            negative = !negative;
        }

        if (y < 0) {
            y = -y;
            negative = !negative;
        }

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = 0; i < y; i++) {
            result += x;
        }

        if (negative) {
            result = -result;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(24, 5));
    }
}