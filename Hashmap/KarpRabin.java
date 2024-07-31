package Hashmap;

public class KarpRabin {
    private static final int prime = 101;

    private long calculateHash(String str) {
        long hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash += str.charAt(i) * Math.pow(prime, i);
        }
        return hash;
    }

    private double recalculateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevHash - oldChar) / prime;
        newHash = newHash + newChar * Math.pow(prime, patternLength - 1);
        return newHash;
    }

    public void search(String text, String pattern) {
        int patLength = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0, patLength));
        for (int i = 0; i < text.length() - patLength; i++) {
            if (text.substring(i, i + patLength).equals(pattern) && patternHash == textHash) {
                System.out.println("Pattern found at index: " + i);
            }
            if (i < text.length() - patLength) {
                textHash = recalculateHash(textHash, text.charAt(i), text.charAt(i + patLength), patLength);
            }

        }
    }

    public static void main(String[] args) {
        KarpRabin kr = new KarpRabin();
        kr.search("ApoorvKunalRahul", "Kunal");

    }

}