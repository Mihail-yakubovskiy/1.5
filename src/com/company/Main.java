package com.company;

public class Main {

    public static void main(String[] args) {
	double s = 0;
	double k = 0;
	for (double i = 1; i < 11;i++){
	    k = 1/i;
	    s = s+k;
	    k = 0;
        System.out.println(s);
	}
    }
}
