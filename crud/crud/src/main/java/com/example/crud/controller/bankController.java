package com.example.crud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.service.BankServiceImplement;

@RestController
@RequestMapping(path= "/bank")
public class bankController {
	
	@Autowired
	BankServiceImplement bankServiceImplement; 
	
	@PostMapping("/insert")
	public @ResponseBody ResponseEntity<Object> insertData(@RequestParam String kode,@RequestParam String deskripsi,@RequestParam String nama) {
		bankServiceImplement.insert(kode, deskripsi, nama);
		return new ResponseEntity<>("berhasil menambahkan data",HttpStatus.CREATED);
	}
	@GetMapping("/view")
   public ResponseEntity<Object> viewAll(){
		return new ResponseEntity<>(bankServiceImplement.view(),HttpStatus.OK);
	}
	@DeleteMapping("delete/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable int id){
		bankServiceImplement.delete(id);
		return new ResponseEntity<>("data berhasil dihapus",HttpStatus.OK);
	}
	@DeleteMapping("delete/all")
	public ResponseEntity<Object> deleteAll(){
		bankServiceImplement.deleteAllData();
		return new ResponseEntity<>("semua data berhasil dihapus",HttpStatus.OK);
	}
	@PutMapping("update")
	public ResponseEntity<Object> updateById(@RequestParam int id,@RequestParam String kode,@RequestParam String deskripsi,@RequestParam String nama){
		bankServiceImplement.update(id, kode, deskripsi, nama);
		return new ResponseEntity<>("data berhasil diupdate",HttpStatus.OK);
	}
	@PostMapping("/insertall")
    public ResponseEntity<Object> insertCustomers() {        
       bankServiceImplement.insertAll();
       return new ResponseEntity<>("berhasil menambahkan data",HttpStatus.CREATED);
    }
}
