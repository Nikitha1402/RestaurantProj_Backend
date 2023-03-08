package com.example.demo.Controller;

import java. util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.CcprojEntity;
import com.example.demo.Service.CcprojService;
@CrossOrigin
@RestController

public class Controller {

@Autowired //extends another class

CcprojService stuService;

@PostMapping("/post")

public CcprojEntity addInfo(@RequestBody CcprojEntity st) {

return stuService.saveDetails(st);

}

@GetMapping("/showDetails")

public List<CcprojEntity>fetchDetails()

{

return stuService.getDetails();

}

@PutMapping("/UpdateDetails")

public CcprojEntity UpdateInfo(@RequestBody CcprojEntity st1)

{

return stuService.UpdateDetails(st1);

}

@DeleteMapping("/Delete/{empid}")

public String deleteInfo (@PathVariable("empid")int empid) {

stuService.deleteDetails(empid);

return "Deleted details";

}
}
