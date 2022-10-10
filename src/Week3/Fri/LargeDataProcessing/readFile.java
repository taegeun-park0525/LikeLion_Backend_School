package Week3.Fri.LargeDataProcessing;

import java.io.*;

public class readFile {
    public void readByChar(String address) throws IOException {
        FileReader fileReader = new FileReader(address);

        char rdChar1 = (char) fileReader.read();
        System.out.println(rdChar1);
        char rdChar2 = (char) fileReader.read();
        System.out.println(rdChar2);

        fileReader.close();
    }

    public void readByLine(String address) throws IOException {
        PopulationMove pm = new PopulationMove();
        BufferedReader br = new BufferedReader(new FileReader(address));
        String rdLine;

        while ((rdLine = br.readLine()) != null) {
            pm.parse(rdLine);
        }

    }
}
