package za.co.technical.assessment.illustration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.technical.assessment.illustration.dto.ServerLocation;
import za.co.technical.assessment.illustration.service.IPLocationService;


@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(value = "/ip/")
public class IPLocationController {

    @Autowired
    IPLocationService ipLocationService;

    @RequestMapping(value = "location/{ip}", method = RequestMethod.POST,headers="Accept=application/json")
    public ServerLocation iplocation (@PathVariable("ip") String ipAddress){
        ServerLocation location = ipLocationService.getLocation(ipAddress);
        return location;
    }

}
