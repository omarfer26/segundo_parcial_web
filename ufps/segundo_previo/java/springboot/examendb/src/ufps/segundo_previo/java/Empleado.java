package springboot.examendb.src.ufps.segundo_previo.java;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "dep_id")
    private Long depId;

    @Column(name = "pos_id")
    private Long posId;

    @Column(name = "entry_date")
    private Date entryDate;

}
