package de.hsrm.Muzik.baseClass;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="kalender")
public class Kalender {

    @Id
    private Long kid;

    @OneToMany(targetEntity = Event.class, cascade = CascadeType.ALL)
    //ke_fk ==> Kalender & Event Foreign Key
    @JoinColumn(name = "ke_fk", referencedColumnName = "kid")
    //@JoinColumn(name = "ke_fk")
    private List<Event> events;

}
