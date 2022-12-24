package com.example.album.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.album.entity.album;
import com.example.album.service.AlbumService;

@RestController
@RequestMapping("/api")
public class AlbumResource {

	@Autowired
	private AlbumService thealbumservice;

	@PostMapping("/album")
	public album savealbums(@RequestBody album thealbum) {
		return thealbumservice.savealbums(thealbum);
	}

	@GetMapping("/allalbum")
	public List<album> getAlbums() {
		return thealbumservice.getAlbums();
	}

	@GetMapping("/album/{albumId}")
	public album getalbumbyid(@PathVariable("albumId") int albumId) {
		return thealbumservice.getalbumbyid(albumId);

	}

	@PutMapping("/album/{albumId}")
	public album updatealbum(@PathVariable("albumId") int albumId, @RequestBody album thealbum) {

		return thealbumservice.updatealbum(albumId, thealbum);

	}

	@DeleteMapping("/album")
	public album deletealbumId(@RequestParam int albumId) {
		return thealbumservice.deletedalbumId(albumId);

	}
	
	@DeleteMapping("/albumByName")
	public album deleteAlbumByName(@RequestParam String name) {
		return thealbumservice.deleteAlbumByName(name);

	}
}
