package demo.code;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/api")
public class HolaRestController {

    @RequestMapping(method = RequestMethod.GET, value = "/hola", produces = "text/plain")
    public String hola() {
        String hostname;
        try {
            hostname = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            hostname = "unknown";
        }
        return "HostAddress: " + hostname;
    }
}
