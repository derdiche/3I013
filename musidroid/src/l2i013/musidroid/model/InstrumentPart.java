package l2i013.musidroid.model;
import java.util.*;

import l2i013.musidroid.util.InstrumentName;
import l2i013.musidroid.util.NoteName;
public class InstrumentPart{
	/**********************************************************************/
	/*                      Variables d'instances                         */
	/**********************************************************************/
	public  ArrayList<Note> notes=new ArrayList<Note>();
	private InstrumentName instrument;
	private int octave;
	/**********************************************************************/
	/*                          Constructeurs                             */
	/**********************************************************************/
	public InstrumentPart(InstrumentName n,int o){
		this.instrument=n;
		this.octave=o;
	}
	/**********************************************************************/
	/*                               Methodes                             */
	/**********************************************************************/
	public void addNote(int t, NoteName n, int d){
    	Note ajout=new Note(t,n,d);
    	notes.add(ajout);
    }
    public boolean equals(Object o){
    	if(o==null){
    		return false;
    	}
    	if(this==o){
    		return true;
    	}
    	if(getClass() != o.getClass()){
    		return false;
    	}
    	InstrumentPart a = (InstrumentPart)o;
    	if(a.getInstrument() == this.instrument && a.getOctave() == this.octave){
    		return true;
    	}
    	return false;
    }
    public void removeNote(int t, NoteName n, int d){
    	Note remove=new Note(t,n,d);//creation de la note
    	int indice=0;
    	System.out.println(notes.size());
    	for(int i=0;i < notes.size();i++){//i parcourt les notes. si les notes à l'indice i est égal à l'une des notes de l'arraylist, on sort de la boucle avec son indice
    		//System.out.println( "est ce que "+notes.get(i)+"est egale a"+remove+"? :"+notes.get(i).equals(remove));
    		indice=i;
    	}
    	System.out.println("l'element a supprimer est a la position "+indice);
    	//System.out.println(i);//on affiche l'indice
    	notes.remove(indice);//on le supprime de la liste de notes
    	
    	
    } 
    public String toString(){
    	String s="L'instrument "+this.instrument+" joue les notes:\n";
    	for(Note note:notes){
    		s+=note.toString()+"\n";
    	}
    	return s;
    }
	/**********************************************************************/
	/*                               Getters                              */
	/**********************************************************************/
    public InstrumentName getInstrument(){
    	return this.instrument;
    }
    public int getInstrumentNum(){
    	return this.instrument.getNum();
    }
    public int getOctave(){
    	return this.octave;
    }
    public ArrayList<Note> getNotes(){
    	ArrayList<Note> notestrie=new ArrayList<Note>();//creation d'une nouvelle arraylist
    	while(!(this.notes.isEmpty())){//tant que l'arraylist n'est pas vide
    		Note min=this.notes.get(0);//on dit que celui a ajouter est le premeier element de la liste des notes 
	    	int indice=0;
	    	for(int i=1;i<this.notes.size();i++){//on parcourt la liste des notes 
	    		if(this.notes.get(i).getInstant()<min.getInstant()){//si on trouve dans la liste un element qui a un intant plus petit 
	    			min=this.notes.get(i);//il devient le min
	    			indice=i;
	    		}
	    		if(this.notes.get(i).getInstant()==min.getInstant()){// si ils ont le meme instant 
	    			if(this.notes.get(i).getName().getNum()<min.getName().getNum()){//on regarde l'ordre lexicographique des notes 
	    				min=this.notes.get(i);
	    				indice=i;
	    			}
	    			
	    		}
	     	}
	    	notestrie.add(min);//on rajoute le min à l'arraylist triée
	    	this.notes.remove(indice);//on supprime le min de l'ancienne arraylist
    	}
    	this.notes=notestrie;//on dit que l'ancienne arraylist devient la nouvelle
    	return notestrie;//on renvoie l'arraylist triée
    }
	/**********************************************************************/
	/*                               Setters                              */
	/**********************************************************************/
    public void setInstrument(InstrumentName n){
    	this.instrument=n;
    }
    public void setOctave(int o){
    	this.octave=o;
    }
    
    
}