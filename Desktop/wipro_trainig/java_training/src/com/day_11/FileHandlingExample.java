package com.day_11;
import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    int id;
    String name;
    String status;

    public Student(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String toString() {
        return id + "," + name + "," + status;
    }
}

public class FileHandlingExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int choice;
        do {
            System.out.println("\n--- File Handling Operations ---");
            System.out.println("1. Create File");
            System.out.println("2. Write to File");
            System.out.println("3. Read from File");
            System.out.println("4. Append to File");
            System.out.println("5. Delete File");
            System.out.println("6. Create Temporary File");
            System.out.println("7. Copy File Content");
            System.out.println("8. Serialize Object");
            System.out.println("9. Deserialize Object");
            System.out.println("10. Merge Two Files");
            System.out.println("11. Update File");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter file name: ");
                    String filename = sc.nextLine();
                    File file = new File(filename);
                    if (file.createNewFile())
                        System.out.println("File created successfully.");
                    else
                        System.out.println("File already exists.");
                    break;

                case 2:
                    System.out.print("Enter file name: ");
                    filename = sc.nextLine();
                    FileWriter fw = new FileWriter(filename);
                    BufferedWriter bw = new BufferedWriter(fw);
                    System.out.print("Enter content: ");
                    String content = sc.nextLine();
                    bw.write(content);
                    bw.close();
                    System.out.println("Written successfully.");
                    break;

                case 3:
                    System.out.print("Enter file name: ");
                    filename = sc.nextLine();
                    BufferedReader br = new BufferedReader(new FileReader(filename));
                    String line;
                    while ((line = br.readLine()) != null)
                        System.out.println(line);
                    br.close();
                    break;

                case 4:
                    System.out.print("Enter file name: ");
                    filename = sc.nextLine();
                    fw = new FileWriter(filename, true);
                    bw = new BufferedWriter(fw);
                    System.out.print("Enter text to append: ");
                    content = sc.nextLine();
                    bw.newLine();
                    bw.write(content);
                    bw.close();
                    System.out.println("Appended successfully.");
                    break;

                case 5:
                    System.out.print("Enter file name: ");
                    filename = sc.nextLine();
                    file = new File(filename);
                    if (file.delete())
                        System.out.println("File deleted.");
                    else
                        System.out.println("Failed to delete.");
                    break;

                case 6:
                    File tempFile = File.createTempFile("tempFile", ".txt");
                    System.out.println("Temporary file created: " + tempFile.getAbsolutePath());
                    break;

                case 7:
                    System.out.print("Enter source file name: ");
                    String source = sc.nextLine();
                    System.out.print("Enter destination file name: ");
                    String dest = sc.nextLine();
                    br = new BufferedReader(new FileReader(source));
                    bw = new BufferedWriter(new FileWriter(dest));
                    while ((line = br.readLine()) != null)
                        bw.write(line + "\n");
                    br.close();
                    bw.close();
                    System.out.println("File copied.");
                    break;

                case 8:
                    System.out.print("Enter file to serialize: ");
                    filename = sc.nextLine();
                    Student s = new Student(101, "Venkat", "Present");
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
                    oos.writeObject(s);
                    oos.close();
                    System.out.println("Serialized successfully.");
                    break;

                case 9:
                    System.out.print("Enter file to deserialize: ");
                    filename = sc.nextLine();
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
                    Student student = (Student) ois.readObject();
                    ois.close();
                    System.out.println("Deserialized: " + student);
                    break;

                case 10:
                    System.out.print("Enter first file name: ");
                    String f1 = sc.nextLine();
                    System.out.print("Enter second file name: ");
                    String f2 = sc.nextLine();
                    System.out.print("Enter merged file name: ");
                    String mergedFile = sc.nextLine();
                    bw = new BufferedWriter(new FileWriter(mergedFile));
                    br = new BufferedReader(new FileReader(f1));
                    while ((line = br.readLine()) != null) bw.write(line + "\n");
                    br = new BufferedReader(new FileReader(f2));
                    while ((line = br.readLine()) != null) bw.write(line + "\n");
                    br.close();
                    bw.close();
                    System.out.println("Files merged.");
                    break;

                case 11:
                    System.out.print("Enter file name to update: ");
                    filename = sc.nextLine();
                    System.out.print("Enter old text: ");
                    String oldText = sc.nextLine();
                    System.out.print("Enter new text: ");
                    String newText = sc.nextLine();
                    File f = new File(filename);
                    br = new BufferedReader(new FileReader(f));
                    StringBuffer sb = new StringBuffer();
                    while ((line = br.readLine()) != null) {
                        sb.append(line.replaceAll(oldText, newText)).append("\n");
                    }
                    br.close();
                    bw = new BufferedWriter(new FileWriter(f));
                    bw.write(sb.toString());
                    bw.close();
                    System.out.println("File updated.");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
