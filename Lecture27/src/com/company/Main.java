package com.company;


import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

      /* *//* System.out.println(System.getProperty("user.home"));*//*



        File homedir = new File(homepath);
        System.out.println(Arrays.toString(homedir.list()));

        for(File selectedFile:homedir.listFiles()){

            System.out.println(selectedFile);
            if(selectedFile.isDirectory()) {
                System.out.println(selectedFile.list());
            }
        }
*/



        /*File createDir= new File(homepath + File.separator + "test" + File.separator + "demo");

        createDir.mkdirs();

        System.out.println();*/


        /*InputStream inputStream= new FileInputStream(createFile);
        byte[] buf = new byte[4];

        while (inputStream.read(buf)>0){
            System.out.println(Arrays.toString(buf));
            System.out.println(new String(buf));

        }*/

        String homepath= System.getProperty("user.home");
        File file= new File(homepath + File.separator + "name.txt");
        if (file.exists())
        {
            file.delete();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter out = new PrintWriter(bufferedWriter);

        out.println("Yavor");
        out.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader in = new BufferedReader(fileReader);

        String line;
        while ( (line = in.readLine()) != null) {
            System.out.println(line);
        }

        in.close();








/*
        File doFile = new File(homepath + File.separator + "Documents" );
        if (doFile.exists()){
            System.out.println(Arrays.toString(doFile.list()));
        }

        System.out.println(homedir);*/
    }
}
