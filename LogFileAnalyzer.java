//Student name: BALTON STEPHEN NYERO, MscIT Year One, Sem-I

//The program below reads a log file, extracts relevant information and outputs a summary report
//to a new text file documenting the information acquired from the log file.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LogFileAnalyzer {
    public static void main(String[] args) {
        String logFilePath = "C:/Users/Stephen B Nyero/Pictures/ISBATprogramming/myjavaproject2023/src/log2023.txt";
        String summaryFilePath = "C:/Users/Stephen B Nyero/Pictures/ISBATprogramming/myjavaproject2023/src/sum2023.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(logFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(summaryFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                // Extracts information from log file line by line
                // and writes or copies it to the summary file
                writer.write(line);
                writer.newLine();
            }

            writer.close();
            reader.close();

            System.out.println("Summary report generated successfully!");
        } catch (IOException e) {
            System.out.println("Error reading or writing the log file: " + e.getMessage());
        }
    }
}
    

