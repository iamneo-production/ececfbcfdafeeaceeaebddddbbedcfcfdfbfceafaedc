import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping
public class UserController {
    
   @PostMapping("/saveTask")
   public void newTask(@RequestBody task){

   }

}
