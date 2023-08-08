package StudentDetails.Zealous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentdet")
@CrossOrigin(origins = "*")
public class ZealousStudentController
{
    @Autowired
   ZealousStudentService service;

//    http://localhost:8082/newstudentdetails
    @PostMapping("/newstudentdetails")
    public String createAnStudent(@RequestBody ZealousStudent zeastud)
    {
        //System.out.println(zeastud);
        return service.Creation(zeastud).getStudentName()+" has been added in database";
     }

//  list all values
    @GetMapping("/")
    public List<ZealousStudent> allvalues()
    {
        return service.Listallvalus();
    }

    @DeleteMapping("/deleteonevalue/{id}")
    public String erasing(@PathVariable("id")int id)
    {
        return  service.Removing(id);
    }
    @PutMapping("/update")
    public String updating(@RequestBody ZealousStudent zealous)
    {
        ZealousStudent temp=service.Creation(zealous);
        return temp.getStudentName()+" has been updated successfully";
    }

    @GetMapping("/fetchone/{id}")
    public Optional<ZealousStudent> gettingon(@PathVariable("id") int id)
    {
        return service.fetchone(id);
    }
}
