package com.sg.foundations.userIOClassLab;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    @Override
    public void print(String message){
        message = "Enter your name: ";
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        Scanner input = new Scanner(System.in);
        prompt = input.nextLine();
        return prompt;
    }

    @Override
    public int readInt(String prompt) {
        return 0;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        return 0;
    }

    @Override
    public double readDouble(String prompt) {
        return 0;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        return 0;
    }

    @Override
    public float readFloat(String prompt) {
        return 0;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        return 0;
    }

    @Override
    public long readLong(String prompt) {
        return 0;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        return 0;
    }
}
