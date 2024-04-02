package com.example.demo.Service.lmpl;

import com.example.demo.Service.WorkerService;
import com.example.demo.people.Worker;
import com.example.demo.repository.inMemoryWorkerDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MemoryWorkerServicelmpl implements WorkerService {
    private final inMemoryWorkerDAO repository;
    @Override
    public List<Worker> findAllWorker() {
        return repository.findAllWorker();
    }

    @Override
    public Worker saveWorker(Worker worker) {
        return repository.saveWorker(worker);
    }

    @Override
    public Worker findByRole(String role) {
        return repository.findByRole(role);
    }

    @Override
    public Worker updateWorker(Worker worker) {
        return repository.updateWorker(worker);
    }

    @Override
    public void deleteWorker(String role) {
        repository.deleteWorker(role);

    }

}
