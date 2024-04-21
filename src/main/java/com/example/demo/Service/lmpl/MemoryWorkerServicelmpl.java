
package com.example.demo.Service.lmpl;

import com.example.demo.Service.WorkerService;
import com.example.demo.people.Worker;
import com.example.demo.repository.inMemoryWorkerDAO;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MemoryWorkerServicelmpl implements WorkerService {
    private final inMemoryWorkerDAO repository;

    public List<Worker> findAllWorker() {
        return this.repository.findAllWorker();
    }

    public Worker saveWorker(Worker worker) {
        return this.repository.saveWorker(worker);
    }

    public Worker findByRole(String role) {
        return this.repository.findByRole(role);
    }

    public Worker updateWorker(Worker worker) {
        return this.repository.updateWorker(worker);
    }

    public void deleteWorker(String role) {
        this.repository.deleteWorker(role);
    }

    public MemoryWorkerServicelmpl(final inMemoryWorkerDAO repository) {
        this.repository = repository;
    }
}
