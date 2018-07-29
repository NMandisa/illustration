package za.co.technical.assessment.illustration.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(value = "/iploc")
public class IPLocationController {


}
