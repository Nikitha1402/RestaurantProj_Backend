package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Entity.CcprojEntity;

public interface Repo extends JpaRepository<CcprojEntity,Integer>{

}
