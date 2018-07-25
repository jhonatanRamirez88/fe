package com.ferreteria.repository;

import org.springframework.stereotype.Repository;

import com.ferreteria.entity.CostoIndirecto;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository("costoIndirectoRepository")
public interface CostoIndirectoRepository extends JpaRepository<CostoIndirecto, Serializable>{
	public abstract CostoIndirecto findById(int id);
}
