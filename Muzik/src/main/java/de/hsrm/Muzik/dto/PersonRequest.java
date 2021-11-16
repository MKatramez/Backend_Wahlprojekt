package de.hsrm.Muzik.dto;

import de.hsrm.Muzik.baseClass.Person;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonRequest {

    private Person person;

}
