//package com.tts.subscriberlist.alien;
//
//import javax.persistence.Column;
//
//import org.springframework.data.annotation.Id;
//
//@Entity
//public class Alien {
//
//	@Id
//	@GeneratedValue
//	private long id;
//	private String species;
//	private String handGreeting;
//
//	public Alien() {/* Empty constructor */}
//
//	public Alien(String theirSpecies, String theirHandGreeting) {
//		this.species = theirSpecies;
//		this.handGreeting = theirHandGreeting;
//	}
//
//	public String getSpecies() {
//		return species;
//	}
//	public void setSpecies(String species) {
//		this.species = species;
//	}
//	public String getHandGreeting() {
//		return handGreeting;
//	}
//	public void setHandGreeting(String handGreeting) {
//		this.handGreeting = handGreeting;
//	}
//	public long getId() {
//		return id;
//	}
//
//	@Override
//	public String toString() {
//		return "Alien [id=" + id + ", species=" + species + ", handGreeting=" + handGreeting + "]";
//	}
//
//
//
//}
