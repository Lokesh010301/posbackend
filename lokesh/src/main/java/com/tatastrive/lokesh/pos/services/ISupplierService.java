package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.entity.Supplier;

public interface ISupplierService {
	public Supplier addSupplier(Supplier supplier);
	//public Supplier addCountries(List<E>);
	public Supplier getSupplier(long id);
	public List<Supplier> getSuppliers();
	public Supplier updateSupplier(long id,Supplier supplier);
	public String  deleteSupplier(long id);

}
