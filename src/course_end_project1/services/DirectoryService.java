package course_end_project1.services;

import java.io.File;

import course_end_project1.entities.Directory;


public class DirectoryService {

    private static Directory fileDirectory = new Directory();

    public static void PrintFiles() {

    	fileDirectory.fillFiles();

        for (File file : DirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }


}