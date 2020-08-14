package dsp.com.clinicproject.controller.web;

import dsp.com.clinicproject.form.PatientForm;
import dsp.com.clinicproject.form.ReviewForm;
import dsp.com.clinicproject.model.Patient;
import dsp.com.clinicproject.model.Review;
import dsp.com.clinicproject.service.patient.impls.PatientServiceImpl;
import dsp.com.clinicproject.service.review.impls.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping("/web/review")
public class ReviewWebController {



    @Autowired
    ReviewServiceImpl reviewService;


    @RequestMapping("/list")
    String showAll(Model model) {
        model.addAttribute("list",reviewService.getAll());


        return "reviewList";
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteReview(@PathVariable("id") String id, Model model){
        reviewService.delete(id);
        model.addAttribute("list",reviewService.getAll());
        return "redirect:/web/review/list";

    }
    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase()
    {
        reviewService.reloadDatabase();
        return "redirect:/web/review/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createReview(Model model){
        ReviewForm reviewForm = new ReviewForm();
        model.addAttribute("reviewForm", reviewForm);
        return "addReviewList";
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createReview(Model model, @ModelAttribute("reviewForm") ReviewForm reviewForm){
        Review review = new Review();
        review.setPatient(reviewForm.getPatient());
        review.setDoctor(reviewForm.getDoctor());
        review.setDiagnose(reviewForm.getDiagnose());
        review.setDateOfReview(reviewForm.getDateOfReview());
        review.setPrice(reviewForm.getPrice());
        reviewService.create(review);

        model.addAttribute("review", reviewService.getAll());
        return "redirect:/web/review/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateReview(@PathVariable("id") String id,Model model) {
        Review review = reviewService.get(id);
        ReviewForm reviewForm = new ReviewForm(
                review.getId(),
                review.getDoctor(),
                review.getPatient(),
                review.getDateOfReview(),
                review.getDiagnose(),
                review.getPrice()
        );
        model.addAttribute("reviewForm", reviewForm);
        return "updateReviewList";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateReview(Model model, @PathVariable("id") String id,
                                @ModelAttribute("reviewForm") ReviewForm reviewForm){
        Review review = new Review();
        review.setPatient(reviewForm.getPatient());
        review.setDoctor(reviewForm.getDoctor());
        review.setDiagnose(reviewForm.getDiagnose());
        review.setDateOfReview(reviewForm.getDateOfReview());
        review.setPrice(reviewForm.getPrice());
        reviewService.create(review);

        model.addAttribute("reviewForm", reviewService.getAll());
        return "redirect:/web/review/list";
    }
}
