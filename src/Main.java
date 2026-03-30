//Alhanouf Allazzam

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        1. Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.
            • Input: Weight (kg) = 70, Height (m) = 1.75
            • Expected Output: BMI = 22.86
        */
        System.out.println("EXERCISE 1");
        System.out.print("Please enter your weight (in kg): ");
        double weight = input.nextDouble();
        System.out.print("Please enter your height (in meters): ");
        double height = input.nextDouble();

        System.out.printf("BMI = %.2f \n" , (weight/(height*height)));


        /*
        2. Write a program that takes the obtained marks and total marks as input and
        calculates the percentage, then prints it.
            • Input: Obtained Marks = 85, Total Marks = 100
            • Expected Output: Percentage = 85.0%
        */
        System.out.println("\nEXERCISE 2");
        System.out.print("Please enter your obtained marks: ");
        double obtained = input.nextDouble();
        System.out.print("Please enter total marks: ");
        double total = input.nextDouble();

        System.out.println("Percentage: " + (obtained/total*100) + "%");

        /*
        3. Create a program that takes an amount in one currency and an exchange rate
        as input, then converts and prints the amount in another currency.
            • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
            • Expected Output: Amount in EUR = 85.0
        */
        System.out.println("\nEXERCISE 3");
        System.out.print("Please enter amount in USD: ");
        double amountUSD = input.nextDouble();
        System.out.print("Please enter exchange rate: ");
        double exchangeRate = input.nextDouble();

        System.out.println("Amount: " + (amountUSD*exchangeRate));

        /*
        4. Create a program that takes a string as input, calculates its length, and then
        reverses the string using the StringBuilder class, finally printing both the length and
        reversed string.
            • Input: "Hello, World!"
            • Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"
        */
        System.out.println("\nEXERCISE 4");
        input.nextLine();
        System.out.print("Please enter string: ");
        String inputString = input.nextLine();

        StringBuilder sb = new StringBuilder(inputString);
        String reversedString = sb.reverse().toString();

        System.out.println("Length of the string: " + inputString.length() + " And Reversed string: \"" + reversedString + "\"" );

        /*
        5. Develop a program that takes a sentence as input and extracts a substring from
        it, then prints the extracted substring.
            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20
            • Expected Output: "brown fox"
        */
        System.out.println("\nEXERCISE 5");
        System.out.print("Please enter sentence: ");
        String sentence = input.nextLine();
        System.out.print("Please enter start index: ");
        int startIndex = input.nextInt();
        System.out.print("Please enter end index: ");
        int endIndex = input.nextInt();

        String extractedSubstring = sentence.substring(startIndex, endIndex);

        System.out.println("Extracted substring: " + extractedSubstring);

        /*
        6. Write a program that takes a sentence and a keyword as input, then check if
        the keyword is present in the sentence and prints the result.
            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword ="jumps"
            • Expected Output: Keyword "jumps" is present in the sentence.
        */
        System.out.println("\nEXERCISE 6");
        input.nextLine();
        System.out.print("Please enter sentence: ");
        String sentence2 = input.nextLine();
        System.out.print("Please enter keyword: ");
        String keyword = input.nextLine();

        boolean contains = sentence2.contains(keyword);

        if(contains){
            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
        } else{
            System.out.println("Keyword \"" + keyword + "\" is not present in the sentence.");
        }

        /*
        7. Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified sentence.
            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
              Replace = "fox", Replacement Word = "cat"
            • Expected Output: "The quick brown cat jumps over the lazy dog"
        */
        System.out.println("\nEXERCISE 7");
        System.out.print("Please enter sentence: ");
        String sentence3 = input.nextLine();
        System.out.print("Please enter the word to replace: ");
        String wordToReplace = input.nextLine();
        System.out.print("Please enter the replacement word: ");
        String replacementWord = input.nextLine();

        String newSentence = sentence3.replace(wordToReplace, replacementWord);

        System.out.println("New sentence: " + newSentence);

        /*
        8. Write a program that takes two strings as input and check if they are equal,
        ignoring the case, then prints whether they are equal or not.
            • Input: String 1 = "Hello", String 2 = "hello"
            • Expected Output: Strings are equal (ignoring case)
        */
        System.out.println("\nEXERCISE 8");
        System.out.print("Please enter first string: ");
        String string1 = input.nextLine();
        System.out.print("Please enter second string: ");
        String string2 = input.nextLine();

        boolean isEqual = string1.equalsIgnoreCase(string2);

        if(isEqual){
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal (ignoring case)");
        }

    }
}