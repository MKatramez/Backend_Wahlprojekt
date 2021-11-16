package de.hsrm.Muzik.repository;

import de.hsrm.Muzik.baseClass.Kalender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface KalenderRepository extends JpaRepository<Kalender, Long>
{
    //das zurückgeben {probe: 1.1.10, auftritt: 1.2.10}
//    @Query("SELECT MAX(e1.eventDatum), MAX(e2.eventDatum) " +
//            "FROM Event e1 INNER JOIN Event e2 " +
//            "WHERE e1.auftritt = true " +
//            "AND e2.auftritt = false")
//    @Query("SELECT MAX(e1.eventDatum), MAX(e2.eventDatum) " +
//            "FROM Event e1 INNER JOIN Event e2 " +
//            "ON e1.auftritt <> e2.auftritt")
//  @Query("SELECT e FROM Event e WHERE e.auftritt=true")
    @Query("SELECT auftritt FROM Event")
    public String nextProbeUndAuftritt();

}
