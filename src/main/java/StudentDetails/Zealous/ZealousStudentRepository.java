package StudentDetails.Zealous;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZealousStudentRepository extends JpaRepository<ZealousStudent,Integer>
{

}
