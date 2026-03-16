package utiles;


import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.Timer;


public class Musica {
	private static Clip clipGotas;
	
	
	//Método para reproducir el sonido de abrir una puerta
	 public static void reproducirPuerta() {
	        try {

	            URL url = Musica.class.getResource("/recursos/audio/puerta_abriendose.wav");

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

	            URL url = Musica.class.getResource("/recursos/audio/musica_fondo.wav");

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
	 
	 //Método para reproducir las gotas de agua
	 public static void gotasAgua() {
		 try {
		        URL url = Musica.class.getResource("/recursos/audio/gotas.wav");
		        AudioInputStream audio = AudioSystem.getAudioInputStream(url);
		        clipGotas= AudioSystem.getClip();
		        clipGotas.open(audio);
		        FloatControl control = (FloatControl) clipGotas.getControl(FloatControl.Type.MASTER_GAIN);
	            control.setValue(-20.0f);
	            clipGotas.loop(Clip.LOOP_CONTINUOUSLY);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
	 
	 }
	 
	//Método para reproducir el corte circuito
	 public static void Electricidad() {
	        try {

	            URL url = Musica.class.getResource("/recursos/audio/electricidad.wav");

	            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

	            Clip clip = AudioSystem.getClip();
	            clip.open(audio);
	            
	            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	            control.setValue(-20.0f);
	            
	            clip.start();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
	 
	 //Método para reproducir el audio
	 public static void Audio() {
	        try {

	        	URL url = Musica.class.getResource("/recursos/audio/audio.wav");

	            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
	            
	            Clip clip = AudioSystem.getClip();
	            clip.open(audio);
	            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
	            control.setValue(-20.0f);
	            
	            clip.start();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
	 
	 
	 //Método para reproducir el interruptor
	 public static void Interruptor() {
		 try {

	            URL url = Musica.class.getResource("/recursos/audio/interruptor.wav");

	            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

	            Clip clip = AudioSystem.getClip();
	            clip.open(audio);
	            clip.start();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 }
	 
	//Método para reproducir la respiracion
		 public static void respiracion() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/respiracion.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		            control.setValue(-20.0f);
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 }
		 
		 public static void clicBoton() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/presionar-boton.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 }
		 
		 public static void valvulaSound() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/valvula-sonido.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		            control.setValue(-20.0f);
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 }
		 
		 public static void cogerObjeto() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/coger-objeto.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 }
		 
		 public static void candadoAbierto() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/candado-abierto.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 }
		 
		 public static void puertaAbCheck() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/apertura-abierta.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 }
		 
		 public static void llaveTuerca() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/llave inglesa.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		            control.setValue(-20.0f);
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		 }
		 
		 private static Clip clipTicTac;

		 public static void ticTac() {
		     try {
		         // Para el clip anterior si existe
		         if (clipTicTac != null && clipTicTac.isRunning()) {
		             clipTicTac.stop();
		             clipTicTac.close();
		         }
		         URL url = Musica.class.getResource("/recursos/audio/tictac.wav");
		   
		         AudioInputStream audio = AudioSystem.getAudioInputStream(url);
		         clipTicTac = AudioSystem.getClip();
		         clipTicTac.open(audio);
		         FloatControl control = (FloatControl) clipTicTac.getControl(FloatControl.Type.MASTER_GAIN);
		         control.setValue(-30.0f);
		         clipTicTac.start();
		         clipTicTac.loop(Clip.LOOP_CONTINUOUSLY);
		     } catch (Exception e) {
		         e.printStackTrace();
		     }
		 }
		 
		 public static void ponerReloj() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/poner-reloj.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		
			 }
		 
		 public static void secuenciaCajon() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/abrir-cajon.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			 
			 Timer timer = new Timer (1500, e -> {
				 try {

			            URL url2 = Musica.class.getResource("/recursos/audio/cajon-abriendose.wav");

			            AudioInputStream audio = AudioSystem.getAudioInputStream(url2);

			            Clip clip2 = AudioSystem.getClip();
			            clip2.open(audio);
			            
			            clip2.start();
			            
			        } catch (Exception i) {
			            i.printStackTrace();
			        }
				});
				timer.setRepeats(false);
				timer.start();
		 }
		 
		 public static void secuenciaGolpe(){
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/caminando.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            
		            clip.start();
		            
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			 
			 Timer timer = new Timer (2000, e ->{
				 try {

			            URL url = Musica.class.getResource("/recursos/audio/golpe.wav");

			            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

			            Clip clip = AudioSystem.getClip();
			            clip.open(audio);
			            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			            control.setValue(-20.0f);
			            
			            clip.start();
			            
			        } catch (Exception i) {
			            i.printStackTrace();
			        }
			 });
			 timer.setRepeats(false);
			 timer.start();
		 }
		 
		 public static void suspense() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/suspense.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		            control.setValue(-20.0f);
		            
		            clip.start();
		            
		        } catch (Exception i) {
		            i.printStackTrace();
		        }
		 }
		 
		 public static void muchoRuido() {
			 try {

		            URL url = Musica.class.getResource("/recursos/audio/mucho-ruido.wav");

		            AudioInputStream audio = AudioSystem.getAudioInputStream(url);

		            Clip clip = AudioSystem.getClip();
		            clip.open(audio);
		            FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
		            control.setValue(-10.0f);
		            
		            clip.start();
		            
		        } catch (Exception i) {
		            i.printStackTrace();
		        }
		 }
		 
		 
		 
		 
		 
		 public static void silenciarGotas() {
			    if (clipGotas != null && clipGotas.isRunning()) {
			        clipGotas.stop();
			    }
			}
		 public static void silenciarTicTac() {
			    if (clipTicTac != null && clipTicTac.isRunning()) {
			        clipTicTac.stop();
			        clipTicTac.close();
			    }
			}
		 
				 
		 
}
