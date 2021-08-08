package cm.belrose.model.patient;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Patient {
    @Id
    private Long id;
    private String name;
}
