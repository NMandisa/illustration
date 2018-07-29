package za.co.technical.assessment.illustration.service.impl;

import org.springframework.stereotype.Service;
import za.co.technical.assessment.illustration.dao.impl.DefaultIPLocationDAO;
import za.co.technical.assessment.illustration.dto.ServerLocation;
import za.co.technical.assessment.illustration.service.IPLocationService;

import java.io.IOException;
import java.util.logging.Logger;

@Service
public class DefaultIPLocationService implements IPLocationService {

    private final Logger LOG = Logger.getLogger(String.valueOf(DefaultIPLocationService.class));

    @Override
    public ServerLocation getLocation(String ipAddress)  {


        DefaultIPLocationDAO defaultIPLocationDAO = new DefaultIPLocationDAO();
        ServerLocation location = null;

        try {
            location = defaultIPLocationDAO.getLocation(ipAddress);
            LOG.info("IP Location Service :" + location);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(location);
        return location;
    }
}
