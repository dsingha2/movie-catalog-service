package io.javabrains.moviecatalogservice.resources;

import io.javabrains.moviecatalogservice.model.CatalogItem;
import io.javabrains.moviecatalogservice.model.Movie;
import io.javabrains.moviecatalogservice.model.UserRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId){


        //List<Ratings> ratingList = Arrays.asList(new Ratings("1234", 4), new Ratings("2345", 5));
        UserRatings userRatings = restTemplate.getForObject("http://localhost:8083/ratings/user/"+userId, UserRatings.class);

        return userRatings.getRatingsList().stream().map(ratings -> {
        Movie movie=    restTemplate.getForObject("http://localhost:8082/movie/"+ratings.getMovieId(), Movie.class);


            return new CatalogItem(movie.getName(), "Test", ratings.getRating());
        }).collect(Collectors.toList());

        //List<CatalogItem> catalogList = Collections.singletonList(new CatalogItem("Transformer", "SciFi movie",4));
        //return catalogList;

    }
}
/* Movie movie = webClientBuilder.build()
                .get()
                .uri("http://localhost:8082/movie/"+ratings.getMovieId())
                .retrieve()
                .bodyToMono(Movie.class)
                .block();*/