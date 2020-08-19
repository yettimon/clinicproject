package dsp.com.clinicproject.controller.rest;

import dsp.com.clinicproject.model.Review;
import dsp.com.clinicproject.service.review.impls.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/api/review")
@RestController
public class ReviewRestController {

    public ReviewRestController(ReviewServiceImpl reviewServiceImpl) {
        this.reviewServiceImpl= reviewServiceImpl;
    }

    @Autowired
    ReviewServiceImpl reviewServiceImpl;

    @RequestMapping("")
    String getIndex() {
        return "<h1>Index Web Controller</h1>";
    }

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello from Review Controller</h1>";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List getReviewList() {
        return reviewServiceImpl.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Review getReview(@PathVariable("id") String id) {
        return reviewServiceImpl.get(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    Review createReview(@RequestBody Review review) {
        return reviewServiceImpl.create(review);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    Review updateReview(@RequestBody Review review) {
        return reviewServiceImpl.create(review);
    }
}


