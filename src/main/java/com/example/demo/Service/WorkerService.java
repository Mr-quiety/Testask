package com.example.demo.Service;

import com.example.demo.people.Worker;
import org.springframework.stereotype.Service;

import java.util.List;


public interface WorkerService {
    List<Worker> findAllWorker();
    Worker saveWorker (Worker worker);
    Worker findByRole (String role);
    Worker updateWorker(Worker worker);
    void deleteWorker(String role);
}
