package session6_core_java_apis.practice;

public class ProductCodeComparison {

    public static void main(String[] args) {
        String fixedCode = "Prod12345";
        String code1 = new String("Prod12345");
        String code2 = "Prod12345";
        String code3 = "Prod" + "12345";

        System.out.println("Using == operator");
        System.out.println("fixedCode vs code1: " + (fixedCode == code1));
        System.out.println("fixedCode vs code2: " + (fixedCode == code2));
        System.out.println("fixedCode vs code3: " + (fixedCode == code3));

        System.out.println("Using equals()");
        System.out.println("fixedCode vs code1: " + fixedCode.equals(code1));
        System.out.println("fixedCode vs code2: " + fixedCode.equals(code2));
        System.out.println("fixedCode vs code3: " + fixedCode.equals(code3));
    }
}
