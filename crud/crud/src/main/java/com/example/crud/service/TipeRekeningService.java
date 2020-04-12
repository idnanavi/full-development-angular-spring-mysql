package com.example.crud.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.TipeRekening;
import com.example.crud.repository.TipeRekeningRepository;

@Service
public class TipeRekeningService {
	
	@Autowired
	TipeRekeningRepository tipeRekeningRepository;
	
	public List<TipeRekening> view() {
		// TODO Auto-generated method stub
		return tipeRekeningRepository.findAll();
	}

	
	public void insert(String kodegrup, String nama, String kode) {
		// TODO Auto-generated method stub
		TipeRekening tr = new TipeRekening();
		tr.setKode(kode);
		tr.setKodegrup(kodegrup);
		tr.setNama(nama);
		tipeRekeningRepository.save(tr);
	}

	
	public void delete(int id) {
		// TODO Auto-generated method stub
		tipeRekeningRepository.deleteById(id);
	}

	
	public void update(int id, String kodegrup, String nama, String kode) {
		// TODO Auto-generated method stub
		TipeRekening tr = new TipeRekening();
		tr.setKode(kodegrup);
		tr.setNama(nama);
		tr.setKode(kode);
		tipeRekeningRepository.save(tr);
	}

	
	public void deleteAllData() {
		// TODO Auto-generated method stub
		tipeRekeningRepository.deleteAll();
	}

	
	public void insertAll() {
		// TODO Auto-generated method stub
		TipeRekening tr1 = new TipeRekening("SA","Tahapan/Tahapan Gold","110");
		TipeRekening tr2 = new TipeRekening("SA","Tapres","111");
		TipeRekening tr3 = new TipeRekening("SA","Tahapan Berjangka (Tahaka)","117");
		TipeRekening tr4 = new TipeRekening("SA","BCA Dollar USD/SGD","333");
		TipeRekening tr5= new TipeRekening("CC","Credit Card","777");
		TipeRekening tr6 = new TipeRekening("SA","Virtual Account","116");
		TipeRekening tr7 = new TipeRekening("CA","Giro Rupiah","300");
		TipeRekening tr8 = new TipeRekening("CA","Giro Rupiah","380");
		TipeRekening tr9 = new TipeRekening("CA","Giro Valas","389");
		TipeRekening tr10 = new TipeRekening("CA","Giro Valas","310");
		TipeRekening tr11 = new TipeRekening("TD","Deposito - Jangka Waktu 1 Bulan(Bank)","201");
		TipeRekening tr12 = new TipeRekening("TD","Deposito - Jangka Waktu 1 Bulan(Bank)","231");
		TipeRekening tr13 = new TipeRekening("TD","Deposito - Jangka Waktu 3 Bulan(Bank)","233");
		TipeRekening tr14 = new TipeRekening("TD","Deposito - Jangka Waktu 3 Bulan(Bank)","203");
		TipeRekening tr15 = new TipeRekening("TD","Deposito - Jangka Waktu 6 Bulan(Bank)","206");
		TipeRekening tr16 = new TipeRekening("TD","Deposito - Jangka Waktu 6 Bulan(Bank)","236");
		TipeRekening tr17 = new TipeRekening("TD","Deposito - Jangka Waktu 12 Bulan(Bank)","242");
		TipeRekening tr18 = new TipeRekening("TD","Deposito - Jangka Waktu 12 Bulan(Bank)","212");
		TipeRekening tr19 = new TipeRekening("SA","Tahapan Xpresi","108");
		List<TipeRekening> tipeRekening = Arrays.asList(tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9,tr10,tr11,tr12,tr13,tr14,tr15,tr16,tr17,tr18,tr19);
		tipeRekeningRepository.saveAll(tipeRekening);
	}

	

}
