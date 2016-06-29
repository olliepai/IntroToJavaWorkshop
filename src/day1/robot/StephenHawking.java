package day1.robot;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {

    public static void main(String[] args) {
    for (int i = 0; i < 400; i++) {
		
    String words = JOptionPane.showInputDialog("Gimme a sentence!!!!");
    speak(words);
    
    }

    }

/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014


