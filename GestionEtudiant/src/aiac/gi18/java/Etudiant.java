package aiac.gi18.java;

import java.util.List;

public class Etudiant implements Comparable<Etudiant>{
	 private int id;
	 private String nom;
	 private double note;
	 
	public Etudiant(int id,String nom,double note) {
		this.id=id;
		this.nom=nom;
		this.note=note;
	}
	
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public double getNote() {
		return note;
	}
	
	public Etudiant(int id,String nom) {
	  this(id,nom,10);
	}
	
	public String toString(){
	  return nom+":"+note;
	}
	
	public boolean equals(Object obj){
		if(!(obj instanceof Etudiant))  return false;
		return ((Etudiant)obj).id==this.id;	
	}
	
	public int compareTo(Etudiant e) {
		if(this.note==e.note) return 0;
		if(this.note>e.note) return 1;
		return -1; 
	}
	
	public void ModifierNote(double note){
		this.note=note;
	}
	
	/*public List<Etudiant> filtrer(conditon c){
		   
	   }*/
	
}
