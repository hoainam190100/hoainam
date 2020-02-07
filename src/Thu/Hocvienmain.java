package Thu;

import java.io.File;
import java.io.*;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class Hocvienmain {
    public ArrayList readFile() {
        try {
            String url = "/Users/admin/IdeaProjects/ônlạikiếmthuc/src/hocvien.txt";
            ArrayList arrayList = new ArrayList();
            File file = new File(url);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(line);
            }
            return arrayList;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public void writeFile(String newfile,ArrayList<Hocsinh> arrayList ) throws IOException {
        File file = new File(newfile);
        FileWriter fileWriter = new FileWriter(file,true);

        for (int i =0;i<arrayList.size();i++){
            fileWriter.write(arrayList.get(i).toString() + "\n");
        }
        fileWriter.close();
    }
}


