package com.DocumentManagment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface FolderRepo extends JpaRepository<Folders, Long> {
	@Query(value="Select * from folder",nativeQuery = true)  
	List<Folders> findAll();
	//@Query(value="delete from folder where fol_id="+'id',nativeQuery = true)
	//boolean deleteById(int id);
	

}
