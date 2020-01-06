package com.bottle.data;


import javax.persistence.*;

@Entity


@Table(name = "Bottles")

public class DBFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;

    private String FileName;

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    private String FileType;

    private String Category;

    public DBFile() {
    }

    @Lob
    private byte[] data;




    public DBFile(String fileName, String fileType, String category, byte[] data) {
        FileName = fileName;
        FileType = fileType;
        Category = category;
        this.data = data;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileType() {
        return FileType;
    }

    public void setFileType(String fileType) {
        FileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
