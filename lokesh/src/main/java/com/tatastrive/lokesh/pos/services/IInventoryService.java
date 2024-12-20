package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.entity.Inventory;



public interface IInventoryService {
	public Inventory addInventory(Inventory inventory);
	//public Inventory addCountries(List<E>);
	public Inventory getInventory(long id);
	public List<Inventory> getInventories();
	public Inventory updateInventory(long id,Inventory inventory);
	public String  deleteInventory(long id);

}
