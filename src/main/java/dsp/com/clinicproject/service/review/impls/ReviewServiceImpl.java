package dsp.com.clinicproject.service.review.impls;

import dsp.com.clinicproject.model.Review;
import dsp.com.clinicproject.repository.DoctorRepository;
import dsp.com.clinicproject.repository.PatientRepository;
import dsp.com.clinicproject.repository.ReviewRepository;
import dsp.com.clinicproject.service.review.interfaces.IReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewServiceImpl implements IReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PatientRepository patientRepository;


    @Override
    public Review create(Review review) {
        review.setCreatedAt(LocalDateTime.now());
        review.setUpdatedAt(LocalDateTime.now());
        return reviewRepository.save(review);
    }


    @Override
    public Review get(String id) {
        return  reviewRepository.findById(id).orElse(null);
    }

    @Override
    public Review update(Review review) {

        review.setUpdatedAt(LocalDateTime.now());
        return reviewRepository.save(review);
    }

    @Override
    public Review delete(String id) {
        Review review = reviewRepository.findById(id).orElse(null);
        reviewRepository.deleteById(id);
        return review;
    }
    @Override
    public List<Review> getAll() {
        return reviewRepository.findAll();
    }

    public void reloadDatabase() {
    }
}
