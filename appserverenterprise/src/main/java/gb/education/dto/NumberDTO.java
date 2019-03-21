package gb.education.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NumberDTO {

    private Double number;

    public NumberDTO() {
    }

    public NumberDTO(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}
