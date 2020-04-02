import admin_sys_menu.FacilityHelper;
import structure.Employee;
import structure.Facility;
import system_init.System_builder;
import structure.CuredPatient;

import java.util.Scanner;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        Facility facility = new System_builder().buildInitialFacility();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");

        System.out.println("The "+ facility.getFacility_name() + " hospital is ready to cure you!");

        System.out.println("\n");

        System.out.println("Please select one of the following commands for more information.");



        System.out.println("1.Add employee");

        System.out.println("2.Delete employee");

        System.out.println("3.Show our glorious types of appointments you can choose from");

        System.out.println("4.Show employees");

        System.out.println("5.Show appointments already taken");

        System.out.println("6.Show cured patients");

        System.out.println("7.Show current patients");

        System.out.println("8.Show evaluation numbers of patients");

        System.out.println("9.Show free medication provided by our facility");

        System.out.println("10.Exit");



        while (true) {

            String option = scanner.next();

            switch (option) {

                case "1":

                    System.out.println("Add the name of the employee: ");

                    String employeeName = scanner.next();

                    System.out.println("Add the surname of the employee: ");

                    String employeeSurname = scanner.next();

                    Employee employee = new Employee(employeeName,employeeSurname);

                    facility.add_employee(employee);

                    System.out.println("To choose another command, press 11.");

                    break;

                case "2":

                    System.out.println("The id of the employee you wish to delete: ");

                    String index = scanner.next();

                    facility.delete_employee(Integer.valueOf(index));

                    System.out.println("To choose another command, press 11.");

                    break;

                case "3":

                    System.out.println("Our appointment types are: ");

                    System.out.println("\n");

                    System.out.println(facility.getAppointment_types());

                    System.out.println("To choose another command, press 11.");

                    break;

                case "4":

                    System.out.println("Our current employees are: ");

                    System.out.println("\n");

                    System.out.println(facility.getEmployees());

                    System.out.println("To choose another command, press 11.");

                    break;

                case "5":

                    System.out.println("Appointments already taken: ");

                    System.out.println("\n");

                    System.out.println(facility.getAppointments());

                    System.out.println("To choose another command, press 11.");

                    break;

                case "6":

                    System.out.println("Do you want to list the names alphabetically? ");
                    System.out.println("Press 1 for alphabetical list");
                    System.out.println("Press 2 for normal list");
                    String option2 = scanner.next();
                    switch (option2) {

                        case "1":

                            System.out.println("Our facility has cured the following patients: ");

                            System.out.println("\n");

                            System.out.println(facility.getCuredPatientsAlphabetically());

                            break;

                        case "2":

                            System.out.println("Our facility has cured the following patients: ");

                            System.out.println("\n");

                            System.out.println(facility.getCuredPatients());

                            break;

                        default:

                            System.out.println("\n");

                            System.out.println("You have chosen a wrong command. Please try again.");

                    }

                     System.out.println("To choose another command, press 11.");

                    break;


                case "7":

                    System.out.println("Do you want to list the names alphabetically? ");
                    System.out.println("Press 1 for alphabetical list");
                    System.out.println("Press 2 for normal list");
                    String option3 = scanner.next();
                    switch (option3) {

                        case "1":

                            System.out.println("Our facility treats the following patients: ");

                            System.out.println("\n");

                            System.out.println(facility.getCurrentPatientsAlphabetically());

                            break;

                        case "2":

                            System.out.println("Our facility treats the following patients: ");

                            System.out.println("\n");

                            System.out.println(facility.getCurrentPatients());

                            break;

                        default:

                            System.out.println("\n");

                            System.out.println("You have chosen a wrong command. Please try again.");

                    }

                    System.out.println("To choose another command, press 11.");

                    break;

                case "8" :

                    System.out.println("The current number of patients in our facility is: ");

                    System.out.println(facility.return_CurrentPatients());

                    System.out.println("The number of cured patients is:");

                    System.out.println(facility.return_CuredPatients());

                    System.out.println("The total number of patients that passed through our facility is: ");

                    System.out.println(facility.evaluatePatients());

                    System.out.println("To choose another command, press 11.");

                    break;

                case "9":

                    System.out.println("Free medication from our facility: ");
                    System.out.println(facility.getMedicationAlphabetically());

                    break;

                case "10" :
                    System.out.println("Goodbye!");
                    System.exit(0);

                    System.out.println("To choose another command, press 11.");

                    break;

                case "11" :

                    System.out.println("1.Add employee");

                    System.out.println("2.Delete employee");

                    System.out.println("3.Show our glorious types of appointments you can choose from");

                    System.out.println("4.Show employees");

                    System.out.println("5.Show appointments already taken");

                    System.out.println("6.Show cured patients");

                    System.out.println("7.Show current patients");

                    System.out.println("8.Show evaluation numbers of patients");

                    System.out.println("9.Free medication provided by our facility");

                    System.out.println("10.Exit");


                default:

                    System.out.println("\n");

                    System.out.println("You have chosen a wrong command. Please try again.");

            }

        }





    }

}