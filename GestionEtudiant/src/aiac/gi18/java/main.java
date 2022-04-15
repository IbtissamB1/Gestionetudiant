package aiac.gi18.java;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;


public class main {
  public static void main(String[] args) {
	  Etudiant e1,e2,e3;
	  e1=new Etudiant(1,"Hamid");
	  e2=new Etudiant(2,"Driss");
	  e3=new Etudiant(1,"Youssef");
	  
	  e1.ModifierNote(15); 
	  e2.ModifierNote(12);
	  e3.ModifierNote(16);
	  
	  List <Etudiant> mesEtudiants=new ListEtudiant();
	  mesEtudiants.add(e1);
	  mesEtudiants.add(e2);
	  mesEtudiants.add(e3);
	  
	  System.out.println(mesEtudiants);
	  
  }
	

}
