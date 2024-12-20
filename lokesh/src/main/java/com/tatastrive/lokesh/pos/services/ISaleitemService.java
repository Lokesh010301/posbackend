package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.entity.SaleItem;

public interface ISaleitemService {
	public SaleItem addSaleItem(SaleItem saleItem);
	//public SaleItem addCountries(List<E>);
	public SaleItem getSaleItem(long id);
	public List<SaleItem> getSaleItems();
	public SaleItem updateSaleItem(long id,SaleItem saleItem);
	public String  deleteSaleItem(long id);

}