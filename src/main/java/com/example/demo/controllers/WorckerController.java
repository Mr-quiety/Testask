package com.example.demo.controllers;

import com.example.demo.Service.WorkerService;
import com.example.demo.people.Worker;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/worker")
@AllArgsConstructor

public class WorckerController {

    private final WorkerService service;
    @GetMapping
    public List<Worker> findAllWorker(){
        return service.findAllWorker();
    }
    @PostMapping("save_worker")
    public String saveWorker(@RequestBody Worker worker){
        service.saveWorker(worker);
        return "Worker seccefully saved";
    }

    @GetMapping("{role}")
    public Worker findByRole(@PathVariable String role){
        return service.findByRole(role);
    }
    @PutMapping("update_worker")
    public Worker updateWorker(@RequestBody Worker worker){
        return service.updateWorker(worker);
    }
    @DeleteMapping("delere_worker/{role}")
    public void deleteStudent(@PathVariable String role){
        service.deleteWorker(role);
    }
}
