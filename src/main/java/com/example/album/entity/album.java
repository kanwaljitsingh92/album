package com.example.album.entity;

public class album {

	private int albumId;
	private String name;
	private String description;
	private String coverPicUrl;

	public album() {
	}

	public album(String name, String description, String coverPicUrl) {
		this.name = name;
		this.description = description;
		this.coverPicUrl = coverPicUrl;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCoverPicUrl() {
		return coverPicUrl;
	}

	public void setCoverPicUrl(String coverPicUrl) {
		this.coverPicUrl = coverPicUrl;
	}

//	@Override
//	public String toString() {
//		return "album [albumId=" + albumId + ", name=" + name + ", description=" + description + ", coverPicUrl="
//				+ coverPicUrl + "]";
//	}

}
