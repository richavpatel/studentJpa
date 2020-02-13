package com.richa.controller;

import com.richa.model.CatalogItem;
import com.richa.model.Movie;
import com.richa.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalog {


    @GetMapping("/{id}")
    public List<CatalogItem> getCatalog(@PathVariable int id){

        RestTemplate restTemplate = new RestTemplate();

        List<Rating> ratings = Arrays.asList(
                new Rating(1234, 4),
                new Rating(5678,3)
        );

       return ratings.stream().map(rating -> {
          Movie movie = restTemplate.getForObject("http://localhost:8083/movies"+ rating.getMovieId(),Movie.class);
          return new CatalogItem(movie.getName(),"ss", rating.getRating());
       })
                     .collect(Collectors.toList());
    }
}
