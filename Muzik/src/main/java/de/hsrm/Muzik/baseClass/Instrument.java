package de.hsrm.Muzik.baseClass;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="instrument")
public class Instrument {

    @Id
    private Long iid;

    @Column(name="instrumentName")
    private String instrumentName;

}
