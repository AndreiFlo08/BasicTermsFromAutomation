public class Strings1 {
    public static void main(String[] args) {
        String name = "Popescu Ioan-Vasile";

        System.out.println("Length: " + name.length());
        System.out.println("Display character from position 6: " + name.charAt(6));
        System.out.println("Display the first charater: " + name.charAt(0));
        System.out.println("Dsiplay the last charater: " + name.charAt(name.length()-1));
        System.out.println( "Display capital letters: " + name.toUpperCase());
        System.out.println("Display lowercase: " + name.toLowerCase());
        System.out.println("Display only Popescu: " + name.substring(0,7));
        System.out.println("Mix: " + name.toUpperCase().substring(0,7).substring(1,2));

        String manySpaces ="        Hello word          ";
        String empty = " ";
        String a = "aaa";
        String b = "AA";
        System.out.println(manySpaces.trim().toUpperCase());
        System.out.println(empty.isEmpty());
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a=b);



    }
}
