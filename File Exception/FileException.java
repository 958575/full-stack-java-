package fun1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileException {

    public String findPetName(String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (hasExactlyTwoVowels(line)) {
                    return line;
                }
            }
        } catch (FileNotFoundException e) {
            return "Please give the correct file name";
        } catch (IOException e) {
            return "Error occurred while reading the names from file";
        }
        return "";
    }

    private boolean hasExactlyTwoVowels(String name) {
        int count = 0;
        for (char c : name.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        FileException userInterface = new FileException();
        String fileName = "E:\\mystore\\pet_name.txt"; // Change to the actual file name
        String petName = userInterface.findPetName(fileName);
        System.out.println(petName);
    }
}

