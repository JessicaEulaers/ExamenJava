package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		int n = numbers.length;
		int[] priem = new int[n];
		int a= 0;
		for (int i = 2; i <= n; i++)
	    {
			priem[a] = i;
			a++;
	    }
		 
		return priem;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
		int count = countLowercaseCharacters(string);
		return count;
        
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
		
		int n= points.size();
		double som = ((Point) points).getX();
	    
		
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {
		int n= points.size();

	}
}
