package za.co.technical.assessment.illustration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.technical.assessment.illustration.dto.ServerLocation;
import za.co.technical.assessment.illustration.service.IPLocationService;

import java.io.IOException;

@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(value = "/iploc")
public class IPLocationController {

    @Autowired
    IPLocationService ipLocationService;

    @RequestMapping(value = "/{ip}", method = RequestMethod.POST,headers="Accept=application/json")
    public ServerLocation iplocation (@PathVariable("ip") String ipAddress) throws IOException {
        ServerLocation location = ipLocationService.getLocation(ipAddress);
        return location;
    }


}
