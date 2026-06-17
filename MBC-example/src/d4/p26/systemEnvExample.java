package d4.p26;

public class systemEnvExample {
    public static void main(String[] args) {
        String javaHome = System.getenv("Path");
        System.out.println("Path : " + javaHome);
    }
}
