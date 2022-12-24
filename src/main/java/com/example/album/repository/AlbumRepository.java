package com.example.album.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.album.entity.album;

@Repository
public class AlbumRepository {

	List<album> albumlist = new ArrayList<>();

	public album savealbums(album thealbum) {
		thealbum.setAlbumId(albumlist.size() + 1);
		albumlist.add(thealbum);
		return thealbum;
	}

	// uyyhyh
	public List<album> getAlbums() {
		return albumlist;
	}

	public album getalbumbyid(int albumId) {
		for (album thealbum : albumlist) {
			if (thealbum.getAlbumId() == albumId)
				;
			return thealbum;
		}
		return null;
	}

	public album updatealbum(int albumId, album thealbum) {
		for (album temp : albumlist) {
			if (temp.getAlbumId() == albumId) {
				temp.setName(thealbum.getName());
				temp.setCoverPicUrl(thealbum.getCoverPicUrl());
				temp.setDescription(thealbum.getDescription());
				return temp;
			}
		}
		return null;
	}

	public album deletedalbumId(int albumid) {
		album deletedalbum = null;
		for (album al : albumlist) {

			if (al.getAlbumId() == albumid) {
				deletedalbum = al;
				albumlist.remove(deletedalbum);
				return deletedalbum;
			}

		}
		return deletedalbum;
	}
	
	public album deleteByName(String name) {
		album deletedalbum = null;
		for (album al : albumlist) {

			if (al.getName().equals(name)) {
				deletedalbum = al;
				albumlist.remove(deletedalbum);
				return deletedalbum;
			}

		}
		return deletedalbum;
	}

}
