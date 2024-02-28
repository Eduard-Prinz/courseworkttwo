package proskyspringhw.controller;

import org.springframework.web.bind.annotation.RestController;
import proskyspringhw.service.ExaminerService;

@RestController
public class ExamController {

    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }
}