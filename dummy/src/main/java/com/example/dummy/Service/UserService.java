package com.example.dummy.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dummy.Model.Useruh;
import com.example.dummy.Repo.UserRepo;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {
@Autowired
private UserRepo user;
public List<Useruh> getAllUsers()
{
    return user.findAll();
}
public Optional<Useruh> getUserById(int id)
{
    return user.findById(id);
}
public Useruh addUser(Useruh name)
{
    return user.save(name);
}
public void deleteUserbyId(int id)
{
    user.deleteById(id);
}
public Useruh updateUser(int id,Useruh name)
{
// if (!user.existsById(name.getId(id))) {
//     throw new IllegalArgumentException("User with ID " + name.getId() + " does not exist.");
// if(!user.existsById(name.getId()))
// {

// }
name.setId(id);
    return user.save(name);
}
}
