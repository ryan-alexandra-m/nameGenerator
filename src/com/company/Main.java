package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	for(int i=0; i<76; i++){
        Random rand= new Random();
        int upperBound= 75;
        int random= rand.nextInt(upperBound);
        ArrayList<Integer> ints= new ArrayList<Integer>();
        ints.add(random);
        if(!(Collections.frequency(ints, random)>1)){
            String line= Files.readAllLines(Paths.get("names.txt")).get(random);
            System.out.println(line);
        }
        System.out.println(" ");


    }
    }
}
