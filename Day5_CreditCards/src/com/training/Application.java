package com.training;

import java.io.File;
import java.io.IOException;

import com.training.model.CreditCard;
import com.training.services.BusinessService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard [] cards = new CreditCard[2];
		
		BusinessService service = new BusinessService();
		
		CreditCard card1 = new CreditCard();
		card1.setCardNumber(123L);
		card1.setCardHolderName("Aishwarya");
		card1.setExpiryDate("12/26");
		card1.setCreditLimit(5000.00);
		cards[0] = card1;
		CreditCard card2 = new CreditCard(124L, "Madhura", "10/26", 5000.00);
		cards[1] = card2;
		
		//CharacterStream read and Write
		System.out.println("CharacterStream");
		service.writeToFile(cards, 1);
		try {
			cards = service.readCharacters(new File("cards.txt"));
			for(int i=0; i<2;i++) {
				System.out.println(cards[i].toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ByteStream read and write
		System.out.println("ByteStream");
		service.writeToFile(cards, 2);
		cards = service.readBytes(new File("cards.ser"));
		for(int i=0; i<cards.length;i++) {
			System.out.println(cards[i].toString());
		}
		
		//ByteStream with Path
		String path = "/Day5_CreditCard/";
		System.out.println("ByteStream 2");
		service.writeToFile(cards, 2);
		cards = service.readBytes(new File(path + "Cards.ser"));
		for(int i=0; i<cards.length;i++) {
			System.out.println(cards[i].toString());
		}
		
		//Deletion
		System.out.println("After deletion");
		cards = service.deleteFromFile(cards, "Aishwarya");
		for(int i=0; i<cards.length;i++) {
			System.out.println(cards[i].toString());
		}
	}
}
