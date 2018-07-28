package za.co.technical.assessment.illustration.dao;

import za.co.technical.assessment.illustration.dto.ServerLocation;

import java.io.File;
import java.io.IOException;

public interface IPLocationDAO {

    public ServerLocation getLocation(String ipAddress) throws IOException;
}
