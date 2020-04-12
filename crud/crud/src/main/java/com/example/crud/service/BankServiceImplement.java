package com.example.crud.service;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.entity.GrupTipeRekening;
import com.example.crud.repository.GrupTipeRekeningRepository;

@Service
public class BankServiceImplement {
	@Autowired
	private GrupTipeRekeningRepository grupTipeRekeningRepository;

	public List<GrupTipeRekening> view() {
		// TODO Auto-generated method stub
		return grupTipeRekeningRepository.findAll();
	}

	public void insert(String kode, String deskripsi, String nama) {
		// TODO Auto-generated method stub
		GrupTipeRekening gtr = new GrupTipeRekening();
		gtr.setKode(kode);
		gtr.setDeskripsi(deskripsi);
		gtr.setNama(nama);
		grupTipeRekeningRepository.save(gtr);
	}

	
	public void delete(int id) {
		// TODO Auto-generated method stub
		grupTipeRekeningRepository.deleteById(id);
	}

	
	public void update(int id, String kode, String deskripsi, String nama) {
		// TODO Auto-generated method stub
//		Optional<GrupTipeRekening> upt =  grupTipeRekeningRepository.findById(id);
		GrupTipeRekening upt = new GrupTipeRekening();
		upt.setKode(kode);
		upt.setDeskripsi(deskripsi);
		upt.setNama(nama);
		grupTipeRekeningRepository.save(upt);
	}

	
	public void deleteAllData() {
		// TODO Auto-generated method stub
		grupTipeRekeningRepository.deleteAll();
	}

	
	public void insertAll() {
		// TODO Auto-generated method stub
		GrupTipeRekening g1 = new GrupTipeRekening("CA","Current Account","Rekening Giro");
		GrupTipeRekening g2 = new GrupTipeRekening("CC","Credit card","Kartu Kredit");
		GrupTipeRekening g3 = new GrupTipeRekening("MG","Merchant Group ID","Merchant Grup ID");
		GrupTipeRekening g4 = new GrupTipeRekening("SA","Saving Account","Rekening Tabungan");
		GrupTipeRekening g5= new GrupTipeRekening("TA","Trade Account","Trade Account");
		GrupTipeRekening g6 = new GrupTipeRekening("TD","Time Deposit","Deposito");
		GrupTipeRekening g7 = new GrupTipeRekening("LO","Loan Account","Rekening Pinjaman");
		GrupTipeRekening g8 = new GrupTipeRekening("DD","BCA Dollar Account","Rekening BCA Dollar");
		List<GrupTipeRekening> grupTipeRekening = Arrays.asList(g1,g2,g3,g4,g5,g6,g7,g8);
		grupTipeRekeningRepository.saveAll(grupTipeRekening);
	}

	
		
}
