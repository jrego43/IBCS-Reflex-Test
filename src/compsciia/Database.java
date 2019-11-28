package compsciia;

import compsciia.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julio E Rego
 */
public class Database {
    private ArrayList<Person> list;
    
    public Database() {
        list = new ArrayList<Person>();
    }
    
    public void addPerson(Person p) {
        list.add(p);
    }
    
    public void remPerson(int i) {
        list.remove(i);
    }
    
    public void printList() {
        for (Person p : list) {
            p.printInfo();
        }
    }
    
    public ArrayList<Person> getList() {
        return list;
    }
    
    public void updateTable(JTable jt) {
        DefaultTableModel model = (DefaultTableModel) jt.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        Object rowData[] = new Object[5];
        for (Person p : this.getList()) {
            rowData[0] = p.getLName();
            rowData[1] = p.getFName();
            rowData[2] = p.getGender();
            rowData[3] = p.getAge();
            if (p.getReactionTime() < 0) {
                rowData[4] = "Test not taken";
            } else {
                rowData[4] = p.getReactionTime();
            }
            model.addRow(rowData);
        }
        
    }
    
}
