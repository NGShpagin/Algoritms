package Lesson_4.Homework_4;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFunc {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String text1 = "Hello world!";
        String text2 = "Hello world, everybody!";
        System.out.println("MD5");
        System.out.println(hashFuncMD5(text1));
        System.out.println(hashFuncMD5(text2));
        System.out.println("\nSHA-512");
        System.out.println(hashFuncSHA512(text1));
        System.out.println(hashFuncSHA512(text2));
    }


    public static int hashIndex(String key) {
        int len = 0;
        StringBuilder str = new StringBuilder();
        while (str.length() < key.length()) {
            str.append(key.indexOf(len));
            len++;
        }
        return len % 10;
    }

    public static String hashFuncMD5(String text) throws NoSuchAlgorithmException {
        MessageDigest str = MessageDigest.getInstance("MD5");
        byte[] bytes = str.digest(text.getBytes(StandardCharsets.UTF_8));
        BigInteger bigInt = new BigInteger(1, bytes);
        String hashText = bigInt.toString(16);
        hashText = "0".repeat(32 - hashText.length()) + hashText;
        return hashText;
    }

    public static String hashFuncSHA512(String text) {
        try {
            MessageDigest str = MessageDigest.getInstance("SHA-512");
            byte[] bytes = str.digest(text.getBytes(StandardCharsets.UTF_8));
            BigInteger bi = new BigInteger(1, bytes);
            String hashText = bi.toString(16);
            while (hashText.length() < 32) hashText = "0" + hashText;
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
