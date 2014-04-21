package actors;

import java.util.ArrayList;

import javax.swing.JLabel;

import interfaces.Collidable;
import interfaces.Interactable;
import items.Item;

public abstract class Actor implements Collidable, Interactable {
	protected ArrayList<Monster> party = new ArrayList<Monster>();
	protected ArrayList<Item> inventory = new ArrayList<Item>();
	protected String name;
	protected JLabel[] imageSet = {};
	
	public Actor(String name){
		this.name = name;
	}
	
	public void setParty(ArrayList<Monster> party){
		this.party = party;
	}
}
