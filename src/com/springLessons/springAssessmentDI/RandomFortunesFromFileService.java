/**
 * 
 */
package com.springLessons.springAssessmentDI;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
/**
 * @author SATIJAS
 *
 */
@Component
public class RandomFortunesFromFileService implements FortuneService {

	private String fileName = "D:/softwares/ECLIPSE/WORKPLACE/FIRST_PROJ_SPRING5/spring-demo-annotations/src/fortunes.txt";
	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();
	
	@PostConstruct
	public void readFileOnStartup() {

		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Iterator<String> itr=theFortunes.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("File read successfully.");
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}
	
	
}
