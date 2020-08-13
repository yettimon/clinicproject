package dsp.com.clinicproject.repository;

import dsp.com.clinicproject.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {
}
