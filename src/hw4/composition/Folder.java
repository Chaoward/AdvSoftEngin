package hw4.composition;

import java.util.ArrayList;

public class Folder {
    private String name;
    public final ArrayList<File> fileList;
    public final ArrayList<Folder> folderList;

    public Folder(String name) {
        this.name = name;
        this.folderList = new ArrayList<Folder>();
        this.fileList = new ArrayList<File>();
    }

    public Folder(String name, ArrayList<File> files, ArrayList<Folder> folders) {
        this.name = name;
        this.folderList = folders == null ? new ArrayList<Folder>() : folders;
        this.fileList = folders == null ? new ArrayList<File>() : files;
    }

    public void print() {
        for (Folder fold : folderList) {
            System.out.println(fold.name);
        }
    }

    public void printAll() {
        printAll(0);
    }

    public void printAll(int tabCount) {
        String tabs = "";
        for (int i = 0; i < tabCount; i++) {
            tabs += "   ";
        }
        System.out.println(tabs + "| " + this.name);

        for (Folder fold : folderList) {
            fold.printAll(tabCount + 1);
        }

        for (File file : fileList) {
            System.out.print(tabs + "   | ");
            file.print();
            System.out.println();
        }
    }



    public ArrayList<File> getFileList() {
        return fileList;
    }

    public ArrayList<Folder> getFolderList() {
        return folderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
