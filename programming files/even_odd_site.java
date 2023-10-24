// imports package
import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        // Creates object to write to html file
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        // Adds html code to file
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        // Loops 50 times to add table row headers to file
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        // Ends html code and closes file
        file.write("</table>\n</body>\n</html>");
        file.close();
        // Creates reader object to read file
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
