package com.bottle.data.Controller;


import com.bottle.data.DBFile;
import com.bottle.data.service.DBFileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;

@RestController
public class FileController {
    @Autowired
    DBFileStorageService dbFileStorageService;

    @CrossOrigin(origins = "http://localhost:3001")
    @Transactional
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void uploadFile(@RequestParam(name="file")MultipartFile file,@RequestParam(name="category") String category){
        //String category="large";
        dbFileStorageService.storeFile(file,category);

    }

    @CrossOrigin(origins = "http://localhost:3001")
    @Transactional
    @RequestMapping(value="get/{fileId}")
    public ResponseEntity<ByteArrayResource> getFile(@PathVariable Integer fileId){
        DBFile dbFile=dbFileStorageService.getFile(fileId);
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(dbFile.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dbFile.getFileName() + "\"")
                .body(new ByteArrayResource(dbFile.getData(),dbFile.getCategory()));
    }

}
