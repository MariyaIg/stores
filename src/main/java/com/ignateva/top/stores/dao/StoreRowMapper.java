package com.ignateva.top.stores.dao;

import com.ignateva.top.stores.model.Store;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreRowMapper implements RowMapper<Store> {
    @Override
    public Store mapRow(ResultSet rs, int rowNum) throws SQLException {
        Store store = new Store();
        store.setId(rs.getInt("Id"));
        store.setTitle(rs.getString("title"));
        store.setAddress(rs.getString("address"));
        store.setPhone(rs.getString("phone"));
        store.setEmail(rs.getString("email"));
        store.setSite(rs.getString("site"));
        store.setCategoryid(rs.getInt("categoryid"));
        store.setDescription(rs.getString("description"));
        return store;
    }


}
