package com.lethien.demo;

public class TestImgDto {
	
	private int id;
	private byte[] img;
	private String imgBase64;
	
	public TestImgDto() {
		super();
	}

	public TestImgDto(int id, byte[] img) {
		super();
		this.id = id;
		this.img = img;
		this.imgBase64 = new String(this.img);
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
		return imgBase64;
	}

	public void setImgBase64(String imgBase64) {
		this.imgBase64 = imgBase64;
	}
	
	
	
}
