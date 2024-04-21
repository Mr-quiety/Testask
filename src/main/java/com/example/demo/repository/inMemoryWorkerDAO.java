package com.example.demo.repository;

import com.example.demo.people.Worker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class inMemoryWorkerDAO {
    public final List<Worker> WORKERS = new ArrayList<>();

    public List<Worker> findAllWorker() {
        return WORKERS;
    }


    public Worker saveWorker(Worker worker) {
        WORKERS.add(worker);
        return worker;
    }


    public Worker findByRole(String role) {
        return WORKERS.stream()
                .filter(element -> element.getRole().equals(role))
                .findFirst()
                .orElse(null);
    }


    public Worker updateWorker(Worker worker) {
        var workerIndex = IntStream.range(0, WORKERS.size())
                .filter(index -> WORKERS.get(index).getRole().equals(worker.getRole()))
                .findFirst()
                .orElse(-1);
        if (workerIndex > -1){
         WORKERS.set(workerIndex, worker);
         return worker;
        }
        return null;
    }


    public void deleteWorker(String role) {
        var worker  = findByRole(role);
        if (worker != null);{
            WORKERS.remove(worker);
        }

    }
}
