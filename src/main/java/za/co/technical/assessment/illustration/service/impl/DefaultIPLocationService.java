package za.co.technical.assessment.illustration.service.impl;

import org.springframework.stereotype.Service;
import za.co.technical.assessment.illustration.dao.impl.DefaultIPLocationDAO;
import za.co.technical.assessment.illustration.dto.ServerLocation;
import za.co.technical.assessment.illustration.service.IPLocationService;

import java.io.IOException;

@Service
public class DefaultIPLocationService implements IPLocationService {


    @Override
    public ServerLocation getLocation(String ipAddress) throws IOException {

        DefaultIPLocationDAO obj = new DefaultIPLocationDAO();
        ServerLocation location = null;

        try {
            location = obj.getLocation(ipAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(location);
        return location;
    }
}
