/**CIS111BONLN
* @author Tyler Martin, Marwa Dwidar, Charlie Bivinghouse
* @date 12/17/2020
* Final Project - BPM Generator
* Original Creator/Design/Writer of Metronome - Rosetta Code.
*/

//Source for sound: https://www.rgagnon.com/javadetails/java-0001.html

import java.awt.*;

public class BPM_Generator_Metronome_beep {

	private final long serialVersionUID = 1L;

	double beatsPerMinute;
	int measure, counter;
	
	//Setter/Mutator for Metronome
   /*
   * Assigns this.beatsPerMinute to variable beatsPerMinute
   */
	public void setBPM(double beatsPerMinute) {
		this.beatsPerMinute = beatsPerMinute;
	}
	
	//Getter/Accessor for Metronome
   /*
   * @return beatsPerMinute
   */
	public double getBPM() {
		 return beatsPerMinute;
	}

	/*
   * Metronome Constructor
   */
	public BPM_Generator_Metronome_beep (double beatsPerMinute, int measure){
		this.beatsPerMinute = beatsPerMinute;
		this.measure = measure;	
	}
	
	/*
   * Start method to begin metronome sound production
   */
	public void start(){
		//To set amount of metronome quarter notes during runtime, adjust "i< # of beats"
		//**This for loop was originally a while loop set to (true); exercise caution as this created an infinite loop!!**
		for(int i=0; i<9; i++){
			try {
				Thread.sleep((long)(1000*(60.0/beatsPerMinute)));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			counter++;
			if (counter%measure==0){
				 System.out.println("Tick");
				 Toolkit.getDefaultToolkit().beep();  
			}else{
				 System.out.println("Tock");
			}
		}
	}
} //end of class
