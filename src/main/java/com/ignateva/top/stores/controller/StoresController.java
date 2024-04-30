package com.ignateva.top.stores.controller;


import com.ignateva.top.stores.dao.StoresJdbcTemplateDao;
import com.ignateva.top.stores.model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/stores")
public class StoresController {
    private StoresJdbcTemplateDao storeDao;

    @Autowired
    public StoresController(StoresJdbcTemplateDao storeDao) {
        this.storeDao = storeDao;
    }

    @GetMapping
    public String index(Model model) {
        List<Store> stores = storeDao.findAll();
        model.addAttribute("stores", stores);
        return "stores/index";
    }
    @GetMapping("/new")
        public String newStore(Model model){
            model.addAttribute("store",new Store());
            return ("stores/new");
        }


@GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model)
    {
        model.addAttribute("store", storeDao.find(id));
        return "stores/show";
    }

    @PostMapping
    public String create(@ModelAttribute("store") Store store){
      /*  User user = new User();
        user.setName(name);*/
       // model.addAttribute("user", user);
        storeDao.save(store);
        return "redirect:/stores";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable("id") int id, Model model){
        model.addAttribute("store", storeDao.find(id));
        return "stores/edit";
    }
   @PostMapping("/{id}")
    public String update(@PathVariable("id") int id, @ModelAttribute("store") Store store){

        storeDao.update(id,store);
        return "redirect:/stores";
    }
    @DeleteMapping("/{id}")

    public String delete(@PathVariable("id") int id) {
        storeDao.delete(id);
        return "redirect:/stores";

    }


}

