package com.DocumentManagment;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="documents")
public class Documents 
{
	public Documents()
	{}
	
	public Documents(long doc_id, String file_name, long size) {
		super();
		this.doc_id = doc_id;
		this.file_name = file_name;
		this.size = size;
	
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doc_id;
	@Column(length = 512,nullable = false,unique = true)
	private String file_name;
	
	private long size;
	@Column(name = "upload_time")
	private Date uploadTime;
	
	private byte[] content;

	public long getDoc_id() {
		return doc_id;
	}

	public void setDoc_id(long doc_id) {
		this.doc_id = doc_id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
	

}
