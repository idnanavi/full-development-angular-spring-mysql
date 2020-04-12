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
@Table(name="tipe_rekening")
@Getter @Setter @NoArgsConstructor
public class TipeRekening {
	public TipeRekening(String kodegrup, String nama, String kode) {
		// TODO Auto-generated constructor stub
		this.kodegrup = kodegrup;
		this.nama = nama ;
		this.kode = kode;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_tiperekening")
	private int id;
	@Column(name="kode_tiperekening")
	private String kode;
	@Column(name="kode_gruptiperekening")
	private String kodegrup;
	@Column(name="nama_tiperekening")
	private String nama;
	@Column(name="created_date")
	private Date created;
	@Column(name="updated_date")
	private Date updated;
}
