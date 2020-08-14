package dsp.com.clinicproject.service.review.interfaces;

import dsp.com.clinicproject.model.Doctor;
import dsp.com.clinicproject.model.Review;

import java.util.List;

public interface IReviewService {

    Review create (Review review);
    Review get (String id);
    Review update (Review review);
    Review delete (String id);


    List getAll();

}
