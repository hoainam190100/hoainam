import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try{
         File file =new File("/Users/admin/IdeaProjects/ônlạikiếmthuc/hello/test.CVS");
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String line=null;
            String[]strings;

                while ((line = bufferedReader.readLine()) != null) {

                    strings= line.split(",");

                    System.out.println(strings[5]);

                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

