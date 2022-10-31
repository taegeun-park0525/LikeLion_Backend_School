package week3.Fri.LargeDataProcessing;

import java.io.IOException;

public class PopulationStatistics {
    public static void main(String[] args) throws IOException {
        PopulationMove pm = new PopulationMove();
        readFile rf = new readFile();
        String address = "C:\\Users\\taege\\Desktop\\멋쟁이사자처럼\\수업자료\\dataCut.rtf";


        rf.readByLine(address);

        System.out.println();
        System.out.println(pm.getOutSido());
        System.out.println(pm.getComeSido());
        }
    }
