package cefsa.ftt.ec.fttdatabase;

import cefsa.ftt.ec.fttdatabase.model.People;
import cefsa.ftt.ec.fttdatabase.model.PeopleDao;

public class FTTDaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People p1 = new People(100,"Maria Ines");
		People p2 = new People(101,"João Pedro");
		
		PeopleDao pdao = new PeopleDao();
		
		pdao.addPeople(p1);
		pdao.addPeople(p2);
		
	}

}
