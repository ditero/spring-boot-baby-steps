package io.javabrains.ratingsdataservice.reources;

import io.javabrains.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("user/{userId}")
    public Rating getRating(@PathVariable("userId") String userId) {
        return new Rating(movieId, 4);
    }
}
