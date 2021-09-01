package com.revature.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PetStore {

	List<Pet> petDB= new ArrayList<>();
	
	public static void main(String[] args) {
		
		PetStore petCo=new PetStore();
		petCo.petDB.add(new Pet());
		
		
		
	

	}
	
	
	//serialize method
	
	public void serialize() {
		
		try (ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("files/pet.db"))){
		
			output.writeObject(this.petDB);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	
	
	
	//deserailize method

}
	
	
	public void desarializable() {
		
		
		try (ObjectInputStream intput=new ObjectInputStream(new FileInputStream("files/pet.db"))) {
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
