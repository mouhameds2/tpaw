package com.projet.liste;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

import javax.validation.constraints.Size;

public class ListeAfaire {
	private int id;
	private String utilsateur;
	
	@Size(min = 4, message = "Entrer au minimum 4 caractères")
	private String description;
	private Date targetDate;
	private boolean estEffectuée;
	public ListeAfaire(int id, String utilsateur, String description, Date targetDate, boolean estEffectuée) {
		super();
		this.id = id;
		this.utilsateur = utilsateur;
		this.description = description;
		this.targetDate = targetDate;
		this.estEffectuée = estEffectuée;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUtilsateur() {
		return utilsateur;
	}
	public void setUtilsateur(String utilsateur) {
		this.utilsateur = utilsateur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isEstEffectuée() {
		return estEffectuée;
	}
	public void setEstEffectuée(boolean estEffectuée) {
		this.estEffectuée = estEffectuée;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListeAfaire other = (ListeAfaire) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ListeAfaire [id=" + id + ", utilsateur=" + utilsateur + ", description=" + description + ", targetDate="
				+ targetDate + ", estEffectuée=" + estEffectuée + "]"+"\n";
	}
	

}
