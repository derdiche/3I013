package l2i013.musidroid.model;
import l2i013.musidroid.util.NoteName;
public class Note{
	/**********************************************************************/
	/*                      Variables d'instances                         */
	/**********************************************************************/
	private NoteName hauteur;
	private int instant;
	private int duree;
	/**********************************************************************/
	/*                          Constructeurs                             */
	/**********************************************************************/
	public Note(int t, NoteName n, int d){
		if(t>=0){
			this.instant = t;
		}
		else {
			this.instant=0;
			}
		this.duree = d;
		this.hauteur = n;
	}
	/**********************************************************************/
	/*                               Methodes                             */
	/**********************************************************************/
	 public String toString(){
	    	String s="la note est "+this.hauteur+" a l'instant "+instant+" la duree "+duree;
	 return s;
	 }


	/**********************************************************************/
	/*                               Getters                              */
	/**********************************************************************/
	public int getInstant(){
		return this.instant;
	}
	public int getDuration(){
		return this.duree;
	}
	public NoteName getName(){
		return this.hauteur;
	}


}