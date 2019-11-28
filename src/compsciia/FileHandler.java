package compsciia;

import compsciia.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileHandler {
    
    private File file;
    
    public FileHandler(String name) {
        file = new File(name);
    }
    
    public void scanFile(Database d) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        
        if (file.length() != 0) {
            while (in.hasNextLine()) {
                d.addPerson(new Person(in.nextLine()));
            }
        }
    }
    
    public void updateFile(Database d) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        
        for (Person p : d.getList()) {
            pw.println(p.getData());
        }
        
        pw.close();
    }
    
}
