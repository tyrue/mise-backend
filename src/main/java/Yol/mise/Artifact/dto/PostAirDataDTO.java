package Yol.mise.Artifact.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PostAirDataDTO {
    private String stationAddress;
    private OPStnMsrDTO today;
}