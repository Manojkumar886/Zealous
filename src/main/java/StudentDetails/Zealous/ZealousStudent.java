package StudentDetails.Zealous;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZealousStudent
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int studentRegno;
    private String studentName;
    private String studentCity;
    private int studentHscmark;
    private int studentSslcmark;
}
