package cefsa.ftt.ec.fttdatabase.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class PeopleDao implements Dao {

	//TODO: Add
	//TODO: Update
	//TODO: Delete
	//TODO: List - retorna array list com todos...
	//TODO: Get - retorna apenas 1 registro
	//TODO: Get by name
	
	private Connection connection;
	
	public PeopleDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addPeople(People p) {
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(
					"INSERT INTO PEOPLE (ID, NAME) VALUES (?, ?)");
					//"INSERT INTO  [tp2java].[dbo].[PEOPLE] (ID, NAME) VALUES (?, ?)");
			
			preparedStatement.setLong(1, p.getId());
			preparedStatement.setString(2, p.getName());
			
			preparedStatement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} //addPeople

	public void updatePeople(People p) {
		
	}
	
	public void delPeople(People p) {
	
	}

	public People getPeople(People p) {
		return new People(); //TODO: Work on it
	}
	public ArrayList<People> listPeople(People p) {
		return new ArrayList<People>(); //TODO: Work on it
	}
	public ArrayList<People> getPeopleByName(People p) {
		return new ArrayList<People>(); //TODO: Work on it
	}
	
} //PeopleDao
	

