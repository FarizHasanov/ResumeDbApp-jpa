/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.company.dao.inter;

import com.company.entity.Skill;

import java.util.List;

/**
 * @author FarizHasanov
 */
public interface SkillDaoInter {

    public List<Skill> getAllSkill();

    public List<Skill> getAllSkillById(int userId);

}
