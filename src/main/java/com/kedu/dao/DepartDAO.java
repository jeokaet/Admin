package com.kedu.dao;

import java.util.List;
import com.kedu.dto.DepartDTO;

public interface DepartDAO {

    void insertDept(DepartDTO dept);            // �μ� ���
    List<DepartDTO> selectAllDepts();           // ��ü �μ� ��ȸ
    DepartDTO selectDeptById(int deptId);       // Ư�� �μ� ��ȸ
    void updateDept(DepartDTO dept);            // �μ� ���� ����
    void deleteDept(int deptId);              // �μ� ����
}
