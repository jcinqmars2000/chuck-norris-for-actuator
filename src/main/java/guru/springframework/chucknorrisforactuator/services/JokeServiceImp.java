package guru.springframework.chucknorrisforactuator.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service

public class JokeServiceImp implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	 
	
public JokeServiceImp() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

@Override
	public String getJoke() {
	return chuckNorrisQuotes.getRandomQuote() ;



}
}