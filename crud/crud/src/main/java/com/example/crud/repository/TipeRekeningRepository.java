package com.example.crud.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import com.example.crud.entity.TipeRekening;

@Repository
public interface TipeRekeningRepository extends PagingAndSortingRepository<TipeRekening,Integer>{
	public TipeRekening findById(int id);
	public List<TipeRekening> findAll();
}
