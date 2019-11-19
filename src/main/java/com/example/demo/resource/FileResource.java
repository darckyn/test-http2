package com.example.demo.resource;

import java.util.Optional;

import javax.annotation.security.PermitAll;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/files")
public class FileResource {
	
	@PostMapping("/upload")
	@PermitAll
	public ResponseEntity<HttpStatus> uploadImagemCliente(@RequestParam MultipartFile file) {
		try {
			if(Optional.ofNullable(file).isPresent()) {
				return ResponseEntity.ok(HttpStatus.OK);
			} else {
				return ResponseEntity.noContent().build();
			}
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
	}


}
