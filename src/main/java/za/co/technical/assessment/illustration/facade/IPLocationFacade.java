package za.co.technical.assessment.illustration.facade;

import com.maxmind.geoip.Location;
import com.maxmind.geoip.LookupService;
import com.maxmind.geoip.regionName;
import za.co.technical.assessment.illustration.dto.ServerLocation;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class IPLocationFacade {

    private final Logger LOG = Logger.getLogger(String.valueOf(IPLocationFacade.class));

    public ServerLocation getLocation(String ipAddress, File file) {

        try {
            ServerLocation serverLocation = new ServerLocation();

            LookupService lookup = new LookupService(file,LookupService.GEOIP_MEMORY_CACHE);
            Location locationServices = lookup.getLocation(ipAddress);


            serverLocation.setCountryCode(locationServices.countryCode);
            serverLocation.setCountryName(locationServices.countryName);
            serverLocation.setRegion(locationServices.region);
            serverLocation.setRegionName(regionName.regionNameByCode(
                    locationServices.countryCode, locationServices.region));
            serverLocation.setCity(locationServices.city);
            serverLocation.setPostalCode(locationServices.postalCode);
            serverLocation.setLatitude(String.valueOf(locationServices.latitude));
            serverLocation.setLongitude(String.valueOf(locationServices.longitude));
            return serverLocation;
        } catch (IOException e) {
            LOG.info("Exception Inside IPLocation Facade :" + e.getCause());
            return null;
        }



    }
}
