package l2i013.musidroid.model;
import l2i013.musidroid.util.InstrumentName;
import l2i013.musidroid.util.MidiFile2I013;
import l2i013.musidroid.util.NoteName;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.leff.midi.MidiFile;
import com.leff.midi.MidiTrack;
import com.leff.midi.event.MidiEvent;
import com.leff.midi.event.NoteOff;
import com.leff.midi.event.NoteOn;
import com.leff.midi.event.meta.Tempo;


public class Test{
	public static void main(String[]args){
		Partition p = new Partition(90);
		int ip1 = p.addPart(InstrumentName.ACOUSTIC_GRAND_PIANO,6) ;
		/*p.addNote(ip1, 0, NoteName.DO, 1);
		p.addNote(ip1, 1, NoteName.FA, 1);
		p.addNote(ip1, 2, NoteName.FA, 1);
		p.addNote(ip1, 3, NoteName.FA, 1);
		p.addNote(ip1, 4, NoteName.SOL, 1);*/
		p.addNote(ip1, 5, NoteName.FA, 100);
		System.out.println(new File("test.mid"));
		MidiFile2I013.write(new File("test.mid"), p); 
	}
}