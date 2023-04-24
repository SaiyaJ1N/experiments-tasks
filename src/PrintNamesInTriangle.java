public class PrintNamesInTriangle {
    public static void main(String[] args) {
        String name = "JavaVirtualMachine";
        for (int i = 1; i <= name.length(); i++) {
            System.out.println(name.substring(0, i));
        }
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.substring(0, i));
        }
    }
}
