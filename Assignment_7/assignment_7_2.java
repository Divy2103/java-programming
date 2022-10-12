package Assignment_7;

//Write a program that counts the occurrences of words in a text and displays the words
//        and their occurrences in alphabetical order of the words. Using Map and Set Classes.


public class assignment_7_2 {
    static int countOccurrences(String str, String word) {
        String[] a = str.split(" ");
        int count = 0;
        for (String s : a) {
            if (word.equals(s)) count++;
        }
        return count;
    }
        public static void main(String[] args) {

            String str = "Hello Good Morning";
            String word = "Good"; System.out.println(countOccurrences(str, word));
        }
    }
