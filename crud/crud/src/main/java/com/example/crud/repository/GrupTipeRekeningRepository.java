package com.example.crud.repository;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import com.example.crud.entity.GrupTipeRekening;

@Repository
public interface GrupTipeRekeningRepository extends PagingAndSortingRepository<GrupTipeRekening,Integer> {
	public GrupTipeRekening findById(int id);
	public List<GrupTipeRekening> findAll();
}
