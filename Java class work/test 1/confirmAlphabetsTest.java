import jupiter.api.Test;
import static.org.junit.jupter.api.Assertions.assertTrue;

public class confirmAlphabetsTest{

	@Test
	public void bringOutTheAlphabet();
		
		//given
		ConfirmAlphabet letters = new ConfirmAlphabet();

		char word = "the quick brown fox jump over the lazy dog";

		//action
		char sentence = letters.bringOutTheAlphabet(word);
		System.out.print("Words:" + word);

		//check
		assertTrue(sentence);
	
 
	



}