import java.util.ArrayList;
public class DemoArrayList11 {
    public static void main(String[] args) {
        ArrayList<Customer11> customers = new ArrayList<>();
        Customer11 customer1 = new Customer11(1, "Zakia");
        Customer11 customer2 = new Customer11(5,"Budi");
        customers.add(customer1);
        customers.add(customer2);
        //objek kustomer baru
        customers.add(new Customer11(4,"Cica"));
        //objek kustomer baru di index tertentu
        customers.add(2, new Customer11(100,"Rosa"));
        //mengetahui posisi dari suatu objek
        System.out.println(customers.indexOf(customer2));
        //mengembalikan objek pada index tertentu
        Customer11 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";
        //menambahkan sekumpulan kostumer baru ke dalam array list secara sekaligus
        ArrayList<Customer11> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer11(201, "Della"));
        newCustomers.add(new Customer11(202,"Victor"));
        newCustomers.add(new Customer11(203,"Sarah"));
        customers.addAll(newCustomers);
        for(Customer11 cust : customers){
            System.out.println(cust.toString());
        }
        //pengecekan data costumers cara sederhana
        System.out.println(customers);
        //sorting
        customers.sort((c1,c2)->c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}