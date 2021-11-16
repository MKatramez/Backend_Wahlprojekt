package de.hsrm.Muzik.dto;

import de.hsrm.Muzik.baseClass.Event;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
//this class is for transfer our Event Objects
public class EventRequest {

    private Event event;
}
