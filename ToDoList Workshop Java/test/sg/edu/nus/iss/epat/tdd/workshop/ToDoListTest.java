package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
   // Define Test Fixtures
	private ToDoList tdl;
	private Task t1, t2;

   public ToDoListTest() {
      super();
   }

   @Before
   public void setUp() throws Exception {
      // Initialise Test Fixtures
	   tdl = new ToDoList();
	   t1 = new Task("Task 1", false);
	   t2 = new Task("Task 2", true);
   }

   @After
   public void tearDown() throws Exception {      
      
   }

   @Test
   public void testAddTask() {      
	   tdl.addTask(t1);
	   tdl.addTask(t2);
	   assertFalse(tdl.getAllTasks().isEmpty());
   }

   @Test
   public void testGetStatus() {      
	   tdl.addTask(t1);
	   tdl.addTask(t2);
	   tdl.completeTask("Task 1");
	  boolean status = tdl.getStatus("Task 1");
	  assertEquals(status, true);	  
   }

   @Test
   public void testRemoveTask() {     
	   tdl.addTask(t1);		  
	   tdl.removeTask("Task 1");
	   assertTrue(tdl.getAllTasks().isEmpty());
   }

   @Test
   public void testGetCompletedTasks() {      
	   tdl.addTask(t2);		
	   Collection<Task> taskList = tdl.getCompletedTasks();
	   assertFalse(taskList.isEmpty());
	   
   }
}
