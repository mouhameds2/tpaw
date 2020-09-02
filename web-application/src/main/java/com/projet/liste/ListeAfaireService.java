package com.projet.liste;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListeAfaireService {
	
private static List<ListeAfaire> liste = new ArrayList<ListeAfaire>();
private static int totlalId = 3;
static {
	liste.add(new ListeAfaire(1, "Mes éléves", "Apprendre JEE", new Date(), false));
	liste.add(new ListeAfaire(2, "Mes éléves", "reviser JEE", new Date(), false));
	liste.add(new ListeAfaire(3, "Mes éléves", "coder avec java", new Date(), false));

}
public List<ListeAfaire> ListeTaches(String utilisateur){
	List<ListeAfaire> l = new ArrayList<ListeAfaire>();
	for(ListeAfaire li: liste) {
		if(li.getUtilsateur().equals(utilisateur)) {
			l.add(li);
		}
	}
	return l;
}

public void AjouteTache(String utilisateur, String description, Date date, boolean estEffectuée) {
	liste.add(new ListeAfaire(++totlalId, utilisateur, description, date, estEffectuée));
}
public void Delete(int id){
	Iterator<ListeAfaire> it = liste.iterator();
	while(it.hasNext()) {
		ListeAfaire lis = it.next();
		if(lis.getId() == id) {
			it.remove();
		}
	}
	
}

public ListeAfaire recuperTache(int id) {
	for(ListeAfaire listAfair : liste) {
		if(listAfair.getId() == id) 
			return listAfair;
		
		
	}return null;
}

public void modifieTache(ListeAfaire listeAfair) {
	liste.remove(listeAfair);
	liste.add(listeAfair);
}
}
