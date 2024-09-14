package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs((number));
        String str = String.valueOf(number);
        char[] numberChars = str.toCharArray();
        String reversed = "";
        for(int i = numberChars.length -1; i >= 0; i--){
            reversed += numberChars[i];
        }
        if(reversed.equals(str)){
            return true;
        }
        return false;
    }

    public static boolean isPerfectNumber(int number){
        if (number < 0){
            return false;
        }

        int sum = 0;
        for(int i = 1; i <= number/2; i++ ){
            if (number%i ==0){
                sum = sum + i;
            }
            if (sum == number){
                return true;
            }
        } return false;
    }

    public static String numberToWords(int number){
        if(number < 0){
            return "Invalid Value";
        }

        String str = String.valueOf(number);
        char[] figures = str.toCharArray();

        String numberToString = "";
        for(char figure : figures){
            switch (figure){
                case '0':
                    numberToString += "Zero ";
                    break;
                case '1':
                    numberToString += "One ";
                    break;
                case '2':
                    numberToString += "Two ";
                    break;
                case '3':
                    numberToString += "Three ";
                    break;
                case '4':
                    numberToString += "Four ";
                    break;
                case '5':
                    numberToString += "Five ";
                    break;
                case '6':
                    numberToString += "Six ";
                    break;
                case '7':
                    numberToString += "Seven ";
                    break;
                case '8':
                    numberToString += "Eight ";
                    break;
                case '9':
                    numberToString += "Nine ";
                    break;
            }
        }
        return numberToString.trim();

    }
}

