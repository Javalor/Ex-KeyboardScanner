package lang.JaVALOR.utils;

import lang.JaVALOR.utils.KeyboardScanner.KeyboardScanner;

public class Main {

    public static void main(String[] args) {
	    KeyboardScanner kb = new KeyboardScanner();

        System.out.printf("Input 1: %s\n", kb.getToken());
        System.out.printf("Input 2: %s\n", kb.getToken());
    }
}
