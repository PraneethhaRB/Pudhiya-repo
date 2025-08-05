package com.example.dummy.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
// @NoArgsConstructor
// @AllArgsConstructor
public class Useruh {
@Id
private int Id;
private String Name;
public Useruh()
{

}
public int getId() {
    return Id;
}
public void setId(int id) {
    Id = id;
}
public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}
public Useruh(int id, String name) {
    Id = id;
    Name = name;
}
}
