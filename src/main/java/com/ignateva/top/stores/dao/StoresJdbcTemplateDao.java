package com.ignateva.top.stores.dao;

import com.ignateva.top.stores.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StoresJdbcTemplateDao {
    private JdbcTemplate jdbcTemplate;

@Autowired
    public StoresJdbcTemplateDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<Store> findAll(){
        return   jdbcTemplate.query("select*from stores", new StoreRowMapper());

    }
    public void save (Store store) {
        jdbcTemplate.update("insert into stores (title, address, phone,email, site, categoryid, description) values (?,?,?,?,?,?,?)",
                store.getTitle(), store.getAddress(), store.getPhone(), store.getEmail(), store.getSite(), store.getCategoryid(), store.getDescription());
    }


    public Store find (int id){
        Store store;
        List <Store> stores = jdbcTemplate.query("select*from stores where id =?", new Object[]{id}, new StoreRowMapper());
        if(stores.isEmpty()) return null;
        else return stores.get(0);
    }
    public void delete (int id){
        jdbcTemplate.update("DELETE from stores where id = ?", id);
    }
   public void update (int id,Store store){
        jdbcTemplate.update("update stores set (title, address, phone,email, site, categoryid, description) = (?,?,?,?,?,?,?) where id= ?", store.getTitle(), store.getAddress(), store.getPhone(), store.getEmail(), store.getSite(), store.getCategoryid(), store.getDescription(), id);
    }

}
