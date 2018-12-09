package pl.sdacademy.io;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Paths.*;

public class IoExample {

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(Paths.get("files", "sourceFile.txt").toFile()))) {

      String line = bufferedReader.readLine();

      while (bufferedReader.readLine() != null) {

        System.out.println(line);
        line = bufferedReader.readLine();

      }
    }



    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Paths.get("files", "targetFile" + ".txt").toFile()))) {
      bufferedWriter.write("String testowy 1");
      bufferedWriter.newLine();
      bufferedWriter.write("String testowy 2");
      bufferedWriter.flush();
    }



  }

}
