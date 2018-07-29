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
        try {
            ServerLocation location = new DefaultIPLocationDAO().getLocation(ipAddress);
            LOG.info("IP Location Service :" + location);
            return location;
        } catch (IOException e) {
            LOG.log(LOG.getLevel(),e.getMessage());
            return null;
        }

    }
}
