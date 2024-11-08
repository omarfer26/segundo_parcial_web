package springboot.examendb.src.ufps.segundo_previo.java;
// Suggested code may be subject to a license. Learn more: ~LicenseLog:2946173062.
// Suggested code may be subject to a license. Learn more: ~LicenseLog:1109345479.

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "chief_id")
    private Empleado chief;
}
