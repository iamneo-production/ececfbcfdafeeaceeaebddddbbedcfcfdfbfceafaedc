import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping
public class UserController {
    
    @Autowired
    private UserService userService;

   @PostMapping("/saveTask")
   public void newTask(@RequestBody TaskModel task){
        
   }

}
