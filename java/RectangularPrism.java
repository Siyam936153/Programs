import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double l = in.nextDouble(); // length
        double w = in.nextDouble(); // width
        double h = in.nextDouble(); // height

        double volume = l * w * h;
        double totalSurfaceArea = 2 * (l*w + l*h + w*h);
        double lateralSurfaceArea = 2 * h * (l + w);

        System.out.println(volume);
        System.out.println(totalSurfaceArea);
        System.out.println(lateralSurfaceArea);

        in.close();
    }
}
