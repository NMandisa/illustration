package za.co.technical.assessment.illustration.service;

import za.co.technical.assessment.illustration.dto.ServerLocation;

import java.io.IOException;

public interface IPLocationService {

    ServerLocation getLocation(String ipAddress) throws IOException;
}
