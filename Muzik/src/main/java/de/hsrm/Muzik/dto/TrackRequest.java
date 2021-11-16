package de.hsrm.Muzik.dto;

import de.hsrm.Muzik.baseClass.Track;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class TrackRequest {

    private Track track;

}
