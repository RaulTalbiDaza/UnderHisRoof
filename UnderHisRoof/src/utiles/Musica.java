package utiles;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Musica {
	
	//Método para reproducir el sonido de abrir una puerta
	 public static void reproducirPuerta() {
	        try {

	            URL url = Musica.class.getResource("/recursos/puerta_abriendose.wav");

	            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

	            Clip clip = AudioSystem.getClip();
	            clip.open(audio);
	            clip.start();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	 //Método para reproducir la música de fondo
	 public static void musicaFondo() {
		 try {

	            URL url = Musica.class.getResource("/recursos/musica_fondo.wav");

	            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

	            Clip clip = AudioSystem.getClip();
	            clip.open(audio);
	            
	            //Bajar el volumen de la música de fondo
	            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	            control.setValue(-20.0f);
	            
	            clip.loop(Clip.LOOP_CONTINUOUSLY);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
}
