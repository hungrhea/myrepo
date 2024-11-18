package workshop01.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import workshop01.entity.Message;

import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private final List<String> quotes = List.of(
            "Logic will get you from A to B. Imagination will take you everywhere.",
            "There are 10 kinds of people. Those who know binary and those who don't.",
            "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
            "It's not that I'm so smart, it's just that I stay with problems longer.",
            "It is pitch dark. You are likely to be eaten by a grue."
    );

    @GetMapping(value = "/api/quote", produces = "application/json")
    @CrossOrigin(origins = "*")
    public String getRandomQuote() {
        Random random = new Random();
        String msg = quotes.get(random.nextInt(quotes.size()));
        return msg;
    }
}
