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
@Table(name="track")
public class Track {

    @Id
    private Long tid;

    @Column(name="trackName")
    private String trackName;

    @Column(name="trackCategory")
    private String trackCategory;

    //Entity: one Track many Instruments
    @OneToMany(targetEntity = Instrument.class, cascade = CascadeType.ALL)
    //ti_fk ==> Track & Instruments Foreign Key
    @JoinColumn(name = "ti_fk", referencedColumnName = "tid")//id from Track will map as Foreign Key
    private List<Instrument> instruments;

}
