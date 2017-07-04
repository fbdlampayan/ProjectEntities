/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nokia.whispernet.projectentities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Question: Here is an entity implementation and a UT that tests its functionality; Without changing the UT code, make this module build and UT cases pass properly.
 * The UT cases tests for equality. First it checks that a similar, NOT SAME, Item should be asserted as equal because their field contents are the same.
 * The other case is testing its uniqueness in a collection, specifically in a HashSet... such that two Items that have the same values are treated
 * as equal so in a hashset only the first one inserted should exist.
 * 
 * @author lampayan
 */
@Entity
public class Item implements Serializable {
    
    @Id
    private Long id;
    
    @Column
    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
