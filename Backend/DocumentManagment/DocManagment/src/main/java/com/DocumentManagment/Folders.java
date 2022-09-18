package com.DocumentManagment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="folder")
public class Folders 
{
	public Folders(long fol_id, String folderName) {
		super();
		this.fol_id = fol_id;
		this.folderName = folderName;
	}
	public Folders() {}
	public long getFol_id() {
		return fol_id;
	}
	public void setFol_id(long fol_id) {
		this.fol_id = fol_id;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fol_id;
	@Column(length = 512,nullable = false,unique = true)
	private String folderName;
	

}
