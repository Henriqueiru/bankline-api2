package com.dio.santander.banklineapi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklineapi2.model.Correntista;

import com.dio.santander.banklineapi2.model.*;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
