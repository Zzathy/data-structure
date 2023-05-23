import java.util.HashMap;
import java.util.Scanner;

public class StudentData {
    private static HashMap<String, String> dataTable = new HashMap<>();

    public StudentData() {
        dataTable = new HashMap<>();
    }

    public static boolean addData(String nim, String assistant) {
        if (nim.contains("IF") && !dataTable.containsKey(nim)) {
            dataTable.put(nim, assistant);
            return true;
        } else {
            return false;
        }
    }

    public static void show() {
        if (dataTable.isEmpty()) {
            System.out.println("Empty Data");
        } else {
            System.out.println("Data :");
            for (String key : dataTable.keySet()) {
                System.out.println(key + " - " + dataTable.get(key));
            }
        }
    }

    public static void nimList() {
        if (dataTable.isEmpty()) {
            System.out.println("Empty Data");
        } else {
            System.out.println("Data NIM : ");
            for (String key : dataTable.keySet()) {
                System.out.println(key);
            }
        }
    }

    public static void assistantList() {
        if (dataTable.isEmpty()) {
            System.out.println("Empty Data");
        } else {
            System.out.println("Data Assistant :");
            for (String value : dataTable.values()) {
                System.out.println(value);
            }
        }
    }

    public static int totalData() {
        return dataTable.size();
    }

    public static boolean deleteData(String nim, String assistant) {
        if (dataTable.containsKey(nim) && dataTable.get(nim).equals(assistant)) {
            dataTable.remove(nim);
            return true;
        } else {
            return false;
        }
    }

    public static boolean editData(String nim, String assistant) {
        if (dataTable.containsKey(nim)) {
            dataTable.put(nim, assistant);
            System.out.println("Data Changed");
        } else {
            System.out.println("Data change is failed / Data not found");
        }
        return false;
    }

    public static void menu() {
        {
            Scanner input = new Scanner(System.in);
            int loop;
            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Add Data");
                System.out.println("2. Show Data");
                System.out.println("3. Show NIM List");
                System.out.println("4. Show Assistant List");
                System.out.println("5. Delete Data");
                System.out.println("6. Total Data");
                System.out.println("7. Edit Data");
                System.out.print("\nChoose menu: ");
                int menu = input.nextInt();
                input.nextLine();

                switch (menu) {
                    case 1:
                        System.out.print("\nInput NIM : ");
                        String nim = input.nextLine();
                        System.out.print("Assistant name: ");
                        String asitn = input.nextLine();
                        if (addData(nim, asitn)) {
                            System.out.println("Succesfull add data");
                        } else {
                            System.out.println("Data has registered / don't have 'IF'");
                        }
                        break;
                    case 2:
                        show();
                        break;
                    case 3:
                        nimList();
                        break;
                    case 4:
                        assistantList();
                        break;
                    case 5:
                        System.out.print("\nInput NIM: ");
                        nim = input.nextLine();
                        System.out.print("Assistant Name: ");
                        asitn = input.nextLine();
                        if (deleteData(nim, asitn)) {
                            System.out.println("Data has removed!");
                        } else {
                            System.out.println("Data has registered / wrong assistant");
                        }
                        break;
                    case 6:
                        System.out.println("\nTotal data: " + totalData());
                        break;
                    case 7:
                        System.out.print("\nInput NIM: ");
                        nim = input.nextLine();
                        System.out.print("Assistant Name: ");
                        asitn = input.nextLine();
                        if (editData(nim, asitn)) {
                            System.out.println("Data has changed!");
                        } else {
                            System.out.println("Data has registered / wrong assistant");
                        }
                        break;
                    default:
                        System.out.println("\nMenu not found!");
                }
                System.out.println();

                System.out.println("Choose other menu (1/0)? ");
                loop = input.nextInt();

                System.out.println();
            } while (loop != 0);
        }
    }

    public static void main(String[] args) {
        StudentData.menu();
    }
}
