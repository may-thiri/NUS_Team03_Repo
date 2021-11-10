package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();   

   public void addTask(Task task) {
      // Add code here
	   tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
	   Task t = tasks.get(description);
	   t.setComplete(true);
   }

   public boolean getStatus(String description) {
      
      Task t = tasks.get(description);      
      return t.isComplete();
      
   }

   public Task getTask(String description) {   
	   return tasks.get(description);
   }

   public Task removeTask(String description) {      
      return tasks.remove(description);
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
	   List<Task> completeList = new  ArrayList<Task>();
	   tasks.forEach((key, value) -> {
		    if (value.isComplete()) {
		    	completeList.add(value);
		    }
		});
	   return completeList;
   }
}
