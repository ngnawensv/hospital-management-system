package cm.belrose.service.doctor;

import cm.belrose.mailService.EmailService;
import cm.belrose.repository.doctor.DoctorRepository;
import cm.belrose.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private EmailService service;

    @PostConstruct
    public void initDoctor(){
        Doctor doc1=Doctor.builder().id(101l).name("Ngnawen").specialist("Cadiologue").build();
        Doctor doc2=Doctor.builder().id(102l).name("Mare").specialist("Pédaitre").build();
        Doctor doc3= Doctor.builder().id(103l).name("Ndinchout").specialist("Génicologue").build();
        repository.saveAll(Stream.of(doc1,doc2,doc3).collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors(){
        service.sendEmail();
        return repository.findAll();
    }
}
