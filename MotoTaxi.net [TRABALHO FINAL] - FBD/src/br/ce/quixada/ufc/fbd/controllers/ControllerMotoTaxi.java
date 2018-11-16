package br.ce.quixada.ufc.fbd.controllers;

import java.util.List;

import br.ce.quixada.ufc.fbd.Dao.MotoTaxiDao;
import br.ce.quixada.ufc.fbd.model.MotoTaxi;

public class ControllerMotoTaxi {

	private MotoTaxiDao motoDao = new MotoTaxiDao();	
	
	public List<MotoTaxi> listMotoTaxi(){		
		
		return new MotoTaxiDao().list();
	}	
	
	public void addMotoTaxi(MotoTaxi moto) {
		
		this.motoDao.add(moto);
	}
	
	public MotoTaxi findMotoTaxi(int idMoto) {
		
		return motoDao.find(idMoto);
	}
	
	public boolean deleteMotoTaxi(int idMoto) {
		
		return motoDao.delete(idMoto);	
	}		
}
