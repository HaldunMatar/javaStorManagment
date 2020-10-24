package com.zaitoneh.storeManagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.zaitoneh.storeManagement.model.Item;
import com.zaitoneh.storeManagement.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}




