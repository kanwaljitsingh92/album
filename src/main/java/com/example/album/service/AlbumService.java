package com.example.album.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.album.entity.album;
import com.example.album.repository.AlbumRepository;

@Service
public class AlbumService {

	@Autowired
	private AlbumRepository thealbumRepo;

	public album savealbums(album thealbum) {
		return thealbumRepo.savealbums(thealbum);
	}

	public List<album> getAlbums() {
		return thealbumRepo.getAlbums();
	}
	public album getalbumbyid(int albumId) {
		return thealbumRepo.getalbumbyid(albumId);
	}

	public album updatealbum(int albumId, album thealbum) {
		
		return thealbumRepo.updatealbum(albumId,thealbum);
	}

	public album deletedalbumId(int albumid) {
		return thealbumRepo.deletedalbumId(albumid);
	}

	public album deleteAlbumByName(String name) {
		return thealbumRepo.deleteByName(name);
	}

}
