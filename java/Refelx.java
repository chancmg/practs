import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    }
public class Refelx {
    
            public static void main(String[] args){
                try{
                    Class student = Class.forName("Student");
                    Method[] methods = student.getDeclaredMethods();
        
                    ArrayList<String> methodList = new ArrayList<>();
                    for(Method s:methods){
                        methodList.add(s.getName());
                    }
                    Collections.sort(methodList);
                    for(String name: methodList){
                        System.out.println(name);
                    }
                }
                catch(ClassNotFoundException e)
                {
                    
                }
               
            }
    
        }
    