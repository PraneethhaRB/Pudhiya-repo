package com.example.dummy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.dummy.Model.Useruh;
import com.example.dummy.Service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/userss")
public class UserCont {
@Autowired
private UserService userS;
@GetMapping("/getAll")
public List<Useruh> getAll() {
    return userS.getAllUsers();
}
@GetMapping("/getById/{id}")
public Optional<Useruh> getSpecific(@PathVariable int id) {
    return userS.getUserById(id);
}

@PostMapping("/create")
public ResponseEntity<Useruh> postedSuccessfully(@RequestBody Useruh um) {
    //TODO: process POST request
    Useruh saved = userS.addUser(um);
    return ResponseEntity.ok(saved);
}
@PutMapping("updation/{id}")
public ResponseEntity<Useruh> putMethodName(@PathVariable int id, @RequestBody Useruh uh) {
    //TODO: process PUT request

    
    return ResponseEntity.ok(userS.updateUser(id, uh));
}
@DeleteMapping("deletion/{id}")
public ResponseEntity<Object> deleteing(@PathVariable int id)
{
    userS.deleteUserbyId(id);
    return ResponseEntity.ok("User with Id " + id + " deleted vetrigarama");
}

}
