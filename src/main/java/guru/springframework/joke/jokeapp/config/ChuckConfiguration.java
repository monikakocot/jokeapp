package guru.springframework.joke.jokeapp.config;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //exchange for XML Configuration
public class ChuckConfiguration {

    //@Bean //exchange for XML Configuration
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
