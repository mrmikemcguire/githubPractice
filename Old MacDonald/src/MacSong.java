
public class MacSong
	{

	public static void main(String[] args)
		{
		MacChorus chorus = new MacChorus();
		MacVerse dog = new MacVerse("dog", "woof");
		MacVerse cat = new MacVerse("cat", "meow");
		MacVerse bird = new MacVerse("bird", "chirp");
		
		chorus.showChorus();
		dog.verse();
		chorus.showChorus();
		
		chorus.showChorus();
		cat.verse();
		chorus.showChorus();
		}
	}
