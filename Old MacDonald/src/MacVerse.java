// Here's an extraneous comment to test GitHub

// This would replace Dropbox if I can get comfortable with it.

// Adding the 3rd comment to test branching


public class MacVerse
	{
	private String name;
	private String noise;
	
	public MacVerse (String animalName, String animalNoise)
		{
		name = animalName;
		noise = animalNoise;
		}

	public String getName()
		{
		return name;
		}

	public String getNoise()
		{
		return noise;
		}

	public void verse()
		{
		System.out.println("And on that farm he had a" + name + ", E I E I O");
		System.out.println("With a " + noise + " " + noise + " here");
		System.out.println("And a " + noise + " " + noise + " there");
		System.out.println("Here a " + noise + ", there a " + noise);
		System.out.println("Everywhere a " + noise + " " + noise);
		}
	
	}
