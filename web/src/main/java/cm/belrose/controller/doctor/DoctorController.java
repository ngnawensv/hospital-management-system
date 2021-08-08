package cm.belrose.controller.doctor;

import cm.belrose.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import cm.belrose.service.doctor.DoctorService;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService service;

    @GetMapping("/doctors")
    public List<Doctor> findAllDoctor(){
        return service.getDoctors();
    }
}
