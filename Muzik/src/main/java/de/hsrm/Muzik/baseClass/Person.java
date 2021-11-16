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
@Table(name="person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="vorname")
    private String vorname;

    @Column(name="nachname")
    private String nachname;

    @Column(name="age")
    private int alter;

    @Column(name="telefon")
    private String telefon;

    @Column(name="mail")
    private String mail;

    @Column(name="passwort")
    private String passwort;

    @Column(name="isDirigent")
    private boolean dirigent;

    @Column(name="isMusikant")
    private boolean musikant;

    @Column(name="isChef")
    private boolean chef;

//    //Entity: one Musikant many Instruments
//    @OneToMany(targetEntity = Instrument.class, cascade = CascadeType.ALL)
//    //pi_fk ==> Person & Instruments Foreign Key
//    @JoinColumn(name = "pt_fk", referencedColumnName = "id")
//    private List<Instrument> instruments;

    public Person(String vorname, String nachname,int alter, String telefon, String mail, String passwort,
                  boolean dirigent, boolean musikant, boolean chef) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.telefon = telefon;
        this.mail = mail;
        this.passwort = passwort;
        this.dirigent = dirigent;
        this.musikant = musikant;
        this.chef = chef;
    }
}
