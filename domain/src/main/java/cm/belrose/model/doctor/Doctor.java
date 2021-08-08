package cm.belrose.model.doctor;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Doctor {
    @Id
    private Long id;
    private String name;
    private String specialist;
}
