package com.bottle.data.service;


import com.bottle.data.DBFile;
import com.bottle.data.exception.FileStorageException;
import com.bottle.data.repo.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class DBFileStorageService {
    @Autowired
    private DBFileRepository dbFileRepository;


    public DBFile storeFile(MultipartFile file,String category) {
        String fileName= StringUtils.cleanPath(file.getOriginalFilename());
        System.out.println("hello kunal");
        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("invalid file"+fileName);
            }

            DBFile dbFile = new DBFile(fileName, file.getContentType(),category,file.getBytes());

            return dbFileRepository.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }
    public DBFile getFile(Integer fileId){
        return dbFileRepository.findDBFileById(fileId);


    }


}
