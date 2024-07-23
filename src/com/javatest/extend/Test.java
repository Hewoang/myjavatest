package com.javatest.extend;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("i7-14700k", "16g", "1T", "华硕");
        NotePad notePad = new NotePad("i7-14700k", "16g", "1T", "黑色");
        System.out.println("PC:");
        System.out.println(pc.getBrand());
        System.out.println("NotePad:");
        System.out.println(notePad.getNotepad());
    }
}
