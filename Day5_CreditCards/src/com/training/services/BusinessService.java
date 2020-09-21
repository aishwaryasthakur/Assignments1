package com.training.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import com.training.model.CreditCard;

public class BusinessService {
	
	public void writeToFile(File file, CreditCard[] cards, int choice) {
		
		switch(choice) {
		case 1 : writeInCharacter(file, cards);
				break;
		case 2 : writeInBytes(file, cards);
				break;
		}
	}
	
	public void writeToFile(CreditCard[] cards, int choice) {
		
		switch(choice) {
		case 1 : writeInCharacter(new File("cards.txt"), cards);
				break;
		case 2 : writeInBytes(new File("cards.ser"), cards);
				break;
		}
	}
	

	
	public void writeInCharacter(File file, CreditCard [] cards) {
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter(file), true);
			for(int i=0; i<cards.length; i++) {
				writer.println(cards[i].toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			writer.close();
		}
	}

	public CreditCard [] readCharacters(File file) throws IOException {
		CreditCard [] cards = new CreditCard[5];
		int index = 0;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String details = null;
			while((details=reader.readLine())!=null) {
				String[] result = details.split("[,]", 0);
				CreditCard card = new CreditCard();
				card.setCardNumber(Long.parseLong(result[0]));
				card.setCardHolderName(result[1]);
				card.setExpiryDate(result[2]);
				cards[index] = card;
				index++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			reader.close();
		}
		return cards;
	}

	public void writeInBytes(File file, CreditCard [] cards) {
		
		ObjectOutputStream outStream = null;
		try {
			outStream = new ObjectOutputStream(new FileOutputStream(file));
			for(int i=0; i< cards.length; i++) {
				outStream.writeObject(cards[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		} finally {
			try {
				outStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public CreditCard [] readBytes(File file) {
		CreditCard [] cards = new CreditCard[2];
		
		ObjectInputStream inStream = null;
		try {
			inStream = new ObjectInputStream(new FileInputStream(new File("cards.ser")));
			for(int i=0;i<2;i++) {
				cards[i] = (CreditCard) inStream.readObject();
			}
			}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			try {
				inStream.close();
			}
			catch(IOException e) {
				System.err.println(e.getMessage());
			}
		}
		
		return cards;
	}
	
	public CreditCard[] deleteFromFile(CreditCard[] cards, String cardHolderName) {
		
		int indexToDelete = 0;
		for(int i=0;i<cards.length;i++) {
			if(cards[i].getCardHolderName().equals(cardHolderName)) {
				indexToDelete = i;
				break;
			}
		}
		CreditCard[] newCards = new CreditCard[cards.length-1];
		int index = 0;
		for(int i=0;i<cards.length;i++) {
			if(i!=indexToDelete) {
				newCards[index] = cards[i];
				index++;
			}
		}
		return newCards;
	}
	
}
