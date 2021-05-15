package l2i013.musidroid.model;

import java.util.*;

import l2i013.musidroid.util.InstrumentName;
import l2i013.musidroid.util.NoteName;

public class Partition{
	/**********************************************************************/
	/*                      Variables d'instances                         */
	/**********************************************************************/
	private int tempo;
	private ArrayList<InstrumentPart> part;
	/**********************************************************************/
	/*                          Constructeurs                             */
	/**********************************************************************/
	public Partition(int t){
		this.tempo = t;
		part = new ArrayList<InstrumentPart>();
	}
	/**********************************************************************/
	/*                               Methodes                             */
	/**********************************************************************/
	public int addPart(InstrumentName n, int o){
		if(o<-1 || o>10){
			System.out.println("l'octave n'est pas compis entre -1 et 10");
			return -1;
		}
		InstrumentPart ajout = new InstrumentPart(n,o);
		part.add(ajout);
		return part.size()-1; //est ce que c'est ça qu'il faut retourner ??? je pense 
	}

	public void addNote(int i, int t, NoteName n, int d){
		InstrumentPart instru = part.get(i);
		instru.addNote(t, n, d);
	}

	public void removePart(int i){
		part.remove(i);
	}
	/**********************************************************************/
	/*                               Getters                              */
	/**********************************************************************/
	public int getTempo(){
		return this.tempo;
	}
	public InstrumentPart getPart(int i){
		if(i>=0 && i<=part.size()){
			return part.get(i);
		}
		else{
			return null;
			}
	}
	public ArrayList<InstrumentPart> getParts(){
		return this.part;
	}
	public int getSize(){
		return part.size();
	}
	/**********************************************************************/
	/*                               Setters                              */
	/**********************************************************************/
	public void setTempo(int t){
		this.tempo=t;
	}
}