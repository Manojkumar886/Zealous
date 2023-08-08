package StudentDetails.Zealous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZealousStudentService
{
    @Autowired
    ZealousStudentRepository repo;

    public ZealousStudent Creation(ZealousStudent zeastud)
    {
        return repo.save(zeastud);
    }

    public List<ZealousStudent> Listallvalus()
    {
        return  (List<ZealousStudent>) repo.findAll();
    }

//    delete a value with using regno
    public String Removing(int id)
    {
        ZealousStudent temp=repo.findById(id).orElse(new ZealousStudent());
        repo.delete(temp);
        return temp.getStudentName()+" has been deleted in database";
    }

    public Optional<ZealousStudent> fetchone(int id)
    {
        return repo.findById(id);
    }
}
