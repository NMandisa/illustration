package za.co.technical.assessment.illustration.dao.impl;

import org.springframework.core.io.ClassPathResource;
import za.co.technical.assessment.illustration.dao.IPLocationDAO;
import za.co.technical.assessment.illustration.dto.ServerLocation;
import za.co.technical.assessment.illustration.facade.IPLocationFacade;

import java.io.File;
import java.io.IOException;

public class DefaultIPLocationDAO  implements IPLocationDAO {

    @Override
    public ServerLocation getLocation(String ipAddress) throws IOException {
        File file = new ClassPathResource("GeoLiteCity.dat").getFile();
        return new IPLocationFacade().getLocation(ipAddress, file);
    }

}
