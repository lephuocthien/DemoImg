package com.lethien.demo.entity;

import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_img")
public class TestImg {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "img")
	private byte[] img;

	public TestImg() {
		super();
	}

	public TestImg(int id, byte[] img) {
		super();
		this.id = id;
		this.img = img;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}
	
	public String getImgBase64() {
		return new String(this.img);  
	}
}
