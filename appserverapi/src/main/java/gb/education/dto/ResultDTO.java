package gb.education.dto;

import java.util.UUID;

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
