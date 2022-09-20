package com.DocumentManagment;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class DocManagmentApplicationTests {
	
	/*
	 * @Autowired private DocumetsRepository repo;
	 * 
	 * @Autowired private TestEntityManager entityManager;
	 * 
	 * 
	 * @Test
	 * 
	 * @Rollback(false) void testInsertDocument() throws IOException { File file =
	 * new File("D:\\ProjectSpring\\DemoFiles\\Word1.docx"); Documents document =new
	 * Documents(); document.setFile_name(file.getName()); byte[]
	 * bytes=Files.readAllBytes(file.toPath()); document.setContent(bytes); long
	 * filesize = bytes.length; document.setSize(filesize);
	 * 
	 * Documents savedDoc = repo.save(document);
	 * 
	 * Documents existDoc = entityManager.find(Documents.class,
	 * savedDoc.getDoc_id());
	 * 
	 * assertThat(existDoc.getSize()).isEqualTo(filesize);
	 * 
	 * }
	 */

}
