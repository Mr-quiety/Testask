package com.example.demo.DAOTest;
import com.example.demo.people.Worker;
import com.example.demo.repository.inMemoryWorkerDAO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class inMemoryWorkerDAOTest {
    @Test
    public void testFindAllWorker(){
        inMemoryWorkerDAO dao = new inMemoryWorkerDAO();
        assertNotNull(dao.findAllWorker());
    }
    @Test
    public void testSaveWorker(){
        inMemoryWorkerDAO dao = new inMemoryWorkerDAO();
        Worker worker = new Worker("Nikolay", "Tester",1231);
        assertEquals(worker,dao.saveWorker(worker));
    }
    @Test
    public void testFindByRole(){
        inMemoryWorkerDAO dao= new inMemoryWorkerDAO();
        Worker worker = new Worker("Nikolay","Tester",12324);
        dao.saveWorker(worker);
        assertEquals(worker, dao.findByRole("Tester"));
    }
    @Test
    public void testUpdateWorker(){
        inMemoryWorkerDAO dao = new inMemoryWorkerDAO();
        Worker worker = new Worker("Nikolay", "Tester",123232);
        dao.saveWorker(worker);
        Worker updatedWorker = new Worker("Nikita", "Tester",565443);
        assertEquals(updatedWorker, dao.updateWorker(updatedWorker));
    }
    @Test
    public void testDeleteWorker(){
        inMemoryWorkerDAO dao = new inMemoryWorkerDAO();
        Worker worker = new Worker("Nikolay", "Tester",1232);
        dao.saveWorker(worker);
        dao.deleteWorker("Tester");
        assertNull(dao.findByRole("Tester"));
    }
}
