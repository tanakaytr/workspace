public class Employee2 {
//employee_id, name, department_name, position,
    int employee_id;
    String name;
    String department_name;
    String position;
    
    public String toString() {
        String txt = "";
        txt += "===== 社員名 " + name + " =====\n";
        txt += "社員ID:" + employee_id + "\n";
        txt += "所属部署:" + department_name + "\n";
        txt += "役職:" + position + "\n";
        return txt;
    }
}
