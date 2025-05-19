package Assignment;
interface Audio{
	void audio(String audio);
}
interface Video extends Audio{
	void play(String play);
	void pause();
	void stop();
}
class Audioplayer implements Video{
	public void song() {
		System.out.println("Play the song.....");
	}
	public void audio(String audio) {
		System.out.println("[AudioPlayer Log] "+audio);
	}
	public void play(String play) {
		audio("Playing audio file: "+play);
	}
	public void pause() {
		audio("Audio paused");
	}
	public void stop() {
		audio("Audio stoped");
	}
}
class Videoplayer implements Video{
	public void movie() {
		System.out.println("Play the movie.....");
	}
	public void audio(String audio) {
		System.out.println("[Videoplayer Log] "+audio);
	}
	public void play(String play) {
		audio("Playing video file: "+play);
	}
	public void pause() {
		audio("Video paused");
	}
	public void stop() {
		audio("Video stoped");
	}
	
}
public class No2 {

	public static void main(String[] args) {
		Audioplayer n1=new Audioplayer();
		Videoplayer n2=new Videoplayer();
		n1.song();
		n1.audio("song.mp3");
		n1.pause();
		n1.stop();
		n2.movie();
		n2.audio("movie.mp4");
		n2.pause();
		n2.stop();
		
		
	}

}
