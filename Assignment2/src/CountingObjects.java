public class CountingObjects {
    private static int count = 0;
    public static void main(String[] args) {
        CountingObjects num1 = new CountingObjects();
        CountingObjects num2 = new CountingObjects();
        CountingObjects num3 = new CountingObjects();
        CountingObjects num4 = new CountingObjects();
        CountingObjects num5 = new CountingObjects();
        System.out.println("There are "+CountingObjects.count+" objects in this code");
    }
    CountingObjects() {
        count++;
    }
}