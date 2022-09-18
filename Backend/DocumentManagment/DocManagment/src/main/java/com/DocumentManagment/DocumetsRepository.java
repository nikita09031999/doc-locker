package com.DocumentManagment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface DocumetsRepository extends JpaRepository<Documents, Long>{
    @Query("Select new Documents(d.doc_id,d.file_name,d.size) from Documents d order by d.uploadTime Desc")  
	List<Documents> findAll();
}
