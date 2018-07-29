package za.co.technical.assessment.illustration.service;

import za.co.technical.assessment.illustration.dto.ServerLocation;

public interface IPLocationService {

    ServerLocation getLocation(String ipAddress);
}
