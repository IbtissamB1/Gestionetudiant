package aiac.gi18.java;
import java.util.ArrayList;
import java.util.List;


public class ListEtudiant extends ArrayList<Etudiant>{
  
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
}
