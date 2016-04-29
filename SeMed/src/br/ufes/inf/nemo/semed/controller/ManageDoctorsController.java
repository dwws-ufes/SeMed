package br.ufes.inf.nemo.semed.controller;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.ufes.inf.nemo.semed.application.ManageDoctorsService;
import br.ufes.inf.nemo.semed.domain.Address;
import br.ufes.inf.nemo.semed.domain.Doctor;
import br.ufes.inf.nemo.util.ejb3.application.CrudService;
import br.ufes.inf.nemo.util.ejb3.controller.CrudController;

@Named @SessionScoped
public class ManageDoctorsController extends CrudController<Doctor> {

	private static final long serialVersionUID = 1L;
	
	@EJB private ManageDoctorsService manageDoctorsService;
	
	public ManageDoctorsController() {
		viewPath = "/manageDoctors/";
		bundleName = "msgs";
	}

	@Override
	protected CrudService<Doctor> getCrudService() {
		return manageDoctorsService;
	}

	@Override
	protected Doctor createNewEntity() {
		Doctor d = new Doctor();
		d.setAddress(new Address());
		return d;
	}

	@Override
	protected void initFilters() {
		// TODO Auto-generated method stub

	}

}
