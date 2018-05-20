package guru.springframework.chucknorrisforactuator.models;

public class Joke {
private String joke;

public String getJoke() {
	return joke;
}

public void setJoke(String joke) {
	this.joke = joke;
}

public Joke(String joke) {
	super();
	this.joke = joke;
}
public Joke() {
}
}
