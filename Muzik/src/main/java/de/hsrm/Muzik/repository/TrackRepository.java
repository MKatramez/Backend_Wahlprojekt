package de.hsrm.Muzik.repository;

import de.hsrm.Muzik.baseClass.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {
}
