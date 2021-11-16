package de.hsrm.Muzik.baseClass;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="eventName")
    private String eventName;

    @Column(name="eventDatum")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate eventDatum;

    @Column(name="eventOrt")
    private String eventOrt;


    @Column(name="eventDeadline")
    @JsonFormat(pattern = "yyyy-MM-dd")
    //LocalDateTime for the exact date with time, use LocaleDate for just the date without time
    private LocalDate  eventDeadline;

    @Column(name="isAuftritt")
    private boolean auftritt;

    //Entity: one Event many Track
    @OneToMany(targetEntity = Track.class, cascade = CascadeType.ALL)
    //et_fk ==> Event & Track Foreign Key
    @JoinColumn(name = "et_fk", referencedColumnName = "id")//id from Event will map as Foreign Key
    private List<Track> tracks;

}
