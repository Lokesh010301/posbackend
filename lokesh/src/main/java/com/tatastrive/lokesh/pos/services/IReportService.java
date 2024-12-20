package com.tatastrive.lokesh.pos.services;

import java.util.List;

import com.tatastrive.lokesh.pos.entity.Report;


public interface IReportService {
	public Report addReport(Report report);
	//public Report addCountries(List<E>);
	public Report getReport(long id);
	public List<Report> getReports();
	public Report updateReport(long id,Report report);
	public String  deleteReport(long id);

}
