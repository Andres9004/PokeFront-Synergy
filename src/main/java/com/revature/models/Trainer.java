package com.revature.models;

import java.util.List;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tId;
	
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Pokemon> party;
	
	public Trainer(int tId, String name, List<Pokemon> party) {
		super();
		this.tId = tId;
		this.name = name;
		this.party = party;
	}
	
	public Trainer(String name, List<Pokemon> party) {
		super();
		this.name = name;
		this.party = party;
	}
	
	public Trainer() {
		super();
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Pokemon> getParty() {
		return party;
	}

	public void setParty(List<Pokemon> party) {
		this.party = party;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, party, tId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainer other = (Trainer) obj;
		return Objects.equals(name, other.name) && Objects.equals(party, other.party) && tId == other.tId;
	}

	@Override
	public String toString() {
		return "Trainer [tId=" + tId + ", name=" + name + ", party=" + party + "]";
	}
	
	
	

}