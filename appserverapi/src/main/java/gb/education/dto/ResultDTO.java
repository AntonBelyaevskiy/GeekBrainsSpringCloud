package gb.education.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

@XmlRootElement
public class ResultDTO {

    private String ping;

    public ResultDTO() {
        ping  = UUID.randomUUID().toString();
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }
}
