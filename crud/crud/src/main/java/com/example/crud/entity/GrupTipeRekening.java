package com.example.crud.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="grup_tipe_rekening")
@Getter @Setter @NoArgsConstructor
public class GrupTipeRekening {
	public GrupTipeRekening(String kode,String deskripsi, String nama) {
		// TODO Auto-generated constructor stub
		this.kode = kode;
		this.deskripsi = deskripsi;
		this.nama = nama;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_gtr")
	private int id;
	@Column(name="kode_gtr")
	private String kode;
	@Column(name="deskripsi_gtr")
	private String deskripsi;
	@Column(name="nama_gtr")
	private String nama;
	@Column(name="created_date")
	private Date created;
	@Column(name="updated_date")
	private Date updated;
	
}
