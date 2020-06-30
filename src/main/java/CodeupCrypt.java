public class CodeupCrypt {
    public static double VERSION;

    public static String hashPassword(String originalString) {
        String output = "";
        for (int i = 0; i < originalString.length(); i += 1){
            char currentChar = Character.toLowerCase(originalString.charAt(i));
            if (currentChar == 'a'){
                output += 4;
            } else if (currentChar == 'e'){
                output += 3;
            } else if (currentChar == 'i'){
                output += 1;
            } else if (currentChar == 'o'){
                output += 0;
            } else if (currentChar == 'u'){
                output += 9;
            } else {
                output += originalString.charAt(i);
            }
        }
        return output;
    }

    public static boolean checkPassword(String original, String hash){
        return hash.equals(hashPassword(original));
    }
}
