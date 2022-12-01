package dev.huskut.Puzzles;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class DayOne {

//    File input = new File(this.getFile().getAbsoluteFile().getParentFile().getPath() + File.separator + "Inputs" + File.separator + "DayOne.txt");

        File input = new File("DayOne.txt").getAbsoluteFile();

    public DayOne() {
        firstPart();
    }

    public void firstPart() {
        if (input != null) {

            Scanner myReader = null;
            try {
                myReader = new Scanner(input);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            ArrayList<Integer> tempstore = new ArrayList<>();
            ArrayList<Integer> finalstore = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.isEmpty()) {
                    Integer sum = 0;
                    for(Integer d : tempstore)
                        sum += d;
                    finalstore.add(sum);
                    tempstore.clear();
                } else {
                    tempstore.add(Integer.parseInt(data));
                }
            }

            System.out.println(Collections.max(finalstore));
            Collections.sort(finalstore);
            List<Integer> top3 = new ArrayList<Integer>(finalstore.subList(finalstore.size() -3, finalstore.size()));

            Integer Sum = 0;
            for (Integer topNumber: top3
                 ) {
                Sum += topNumber;
            }

            System.out.println(Sum);

        }
    }
}
