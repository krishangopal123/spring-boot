package com.bottle.data.repo;


import com.bottle.data.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository  extends JpaRepository<DBFile,Integer> {
    DBFile findDBFileById(Integer id);

}
