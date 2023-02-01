package openEnded;

public class openEndedMain {
    public static void main(String[] args) {
        System.out.println(replaceEveryOther("the quick brown fox jumped over the lazy dog", "!"));
    }
    public static String replaceEveryOther(String string, String character){
        String output = "";
        for(int i = 0; i < string.length(); i++){
            if (i % 2 == 0){
                output += string.substring(i, i+1);
            } else {
                output += character;
            }
        }
        return output;
    }
}
