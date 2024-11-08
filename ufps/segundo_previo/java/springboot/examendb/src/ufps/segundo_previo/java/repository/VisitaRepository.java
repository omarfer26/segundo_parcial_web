// Suggested code may be subject to a license. Learn more: ~LicenseLog:1720331258.
// Suggested code may be subject to a license. Learn more: ~LicenseLog:3796448257.
package springboot.examendb.src.ufps.segundo_previo.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.examendb.src.ufps.segundo_previo.java.Visita;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Long> {
}
