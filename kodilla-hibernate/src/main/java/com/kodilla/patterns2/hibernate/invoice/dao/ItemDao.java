package com.kodilla.patterns2.hibernate.invoice.dao;

import com.kodilla.patterns2.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {}
