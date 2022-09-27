package org.teachplats.controller;

import org.teachplats.model.Address;
import org.teachplats.service.AddressServiceImp;
import org.teachplats.service.CityServiceImp;

import java.util.List;

public class AddressController {
    private static AddressServiceImp addressServiceImp = new AddressServiceImp();

    public static void main(String[] args) {
        // List<Address> list = addressServiceImp.listAll();//ok
        // addressServiceImp.searchById(5l);//ok
        addressServiceImp.deleteById(5l); //Cannot delete or update a parent row: a foreign key constraint fails (`teachdb`.`Users`, CONSTRAINT `fk_User_Address1` FOREIGN KEY (`address_id`) REFERENCES `Addresses` (`id`))
    }
}
