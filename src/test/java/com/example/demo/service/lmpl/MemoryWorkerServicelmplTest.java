package com.example.demo.service.lmpl;
import com.example.demo.Service.lmpl.MemoryWorkerServicelmpl;
import com.example.demo.people.Worker;
import com.example.demo.repository.inMemoryWorkerDAO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MemoryWorkerServicelmplTest {
    @Mock
    private inMemoryWorkerDAO repository;
    @InjectMocks
    private MemoryWorkerServicelmpl workerService;

    @Test
    public void returnallWorker(){
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Nikolay", "tester", 1));
        workers.add(new Worker("Nickita", "admin", 2));


        Mockito.when(repository.findAllWorker()).thenReturn(workers);

        List<Worker> result = workerService.findAllWorker();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals("Nikolay", result.get(0).getName());
        Assertions.assertEquals("Nickita", result.get(1).getName());
        Assertions.assertEquals("tester", result.get(0).getRole());
        Assertions.assertEquals("admin", result.get(1).getRole());

    }
}

