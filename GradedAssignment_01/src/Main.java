import com.company.department.AdminDepartment;
import com.company.department.HRDepartment;
import com.company.department.SuperDepartment;
import com.company.department.TechDepartment;

public class Main {

    public static void main(String[] args) {

        SuperDepartment ad = new AdminDepartment();
        SuperDepartment hrd = new HRDepartment();
        SuperDepartment td = new TechDepartment();

        System.out.println("Welcome to "+ ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to "+ hrd.departmentName());
        System.out.println( ((HRDepartment) hrd).doActivity());
        System.out.println(hrd.getTodaysWork());
        System.out.println(hrd.getWorkDeadline());
        System.out.println(hrd.isTodayAHoliday());
        System.out.println();

        System.out.println("Welcome to "+ td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println( ((TechDepartment) td).getTechStackInformation());
        System.out.println(td.isTodayAHoliday());
    }
}
