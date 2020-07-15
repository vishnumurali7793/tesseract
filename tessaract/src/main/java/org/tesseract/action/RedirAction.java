package org.tesseract.action;

import java.util.List;

import org.tesseract.entities.CaratBean;
import org.tesseract.entities.CategoryBean;
import org.tesseract.entities.CustomerBean;
import org.tesseract.entities.ProductBean;
import org.tesseract.entities.PurchaseBean;
import org.tesseract.entities.RateBean;
import org.tesseract.entities.SalesBase;
import org.tesseract.entities.TaxBean;
import org.tesseract.entities.VendorBean;
import org.tesseract.entities.modelBean;
import org.tesseract.persistance.MasterHibernateDao;

import com.opensymphony.xwork2.ActionSupport;

public class RedirAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private List<TaxBean> taxList;
	private List<CategoryBean> catList;
	private List<ProductBean> prodList;
	private List<modelBean> modelList;
	private List<CaratBean> caratList;
	private List<RateBean> rateList;
	private List<CustomerBean> customerList;
	private List<VendorBean> vendorList;
	private List<PurchaseBean> purchaseList;
	private PurchaseBean purchaseBean;
	private SalesBase salesBase;
	private List<SalesBase> salesBaseList;
	
	private MasterHibernateDao masterHibernateDao = new MasterHibernateDao();

	public String goToTaxMaster() {
		taxList = masterHibernateDao.getTaxList();
		return SUCCESS;
	}
	
	public String goToCategory() {
		catList = masterHibernateDao.getCategryList();
		return SUCCESS;
	}
	
	public String goToProduct() {
		prodList = masterHibernateDao.getProductList();
		catList = masterHibernateDao.getCategryList();
		modelList = masterHibernateDao.getModelList();
		return SUCCESS;
	}
	
	public String goToModel() {
		modelList = masterHibernateDao.getModelList();
		return SUCCESS;
	}
	
	public String goToCarat() {
		caratList = masterHibernateDao.getCaratList();
		return SUCCESS;
	}
	
	public String goToRate() {
		rateList = masterHibernateDao.getRateList();
		catList = masterHibernateDao.getCategryList();
		caratList = masterHibernateDao.getCaratList();
		return SUCCESS;
	}
	
	public String goToCustomer() {
		customerList = masterHibernateDao.getCustomerList();
		return SUCCESS;
	}
	
	public String goToVendor() {
		vendorList = masterHibernateDao.getVendorList();
		return SUCCESS;
	}
	
	public String goToPurchase() {
		purchaseList = masterHibernateDao.getPurchaseList();
		return SUCCESS;
	}
	
	public String goToSales() {
		salesBaseList = masterHibernateDao.getSalesList();
		return SUCCESS;
	}
	
	
	public String goToHome() {
		return SUCCESS;
	}

	public List<TaxBean> getTaxList() {
		return taxList;
	}

	public void setTaxList(List<TaxBean> taxList) {
		this.taxList = taxList;
	}

	public List<CategoryBean> getCatList() {
		return catList;
	}

	public void setCatList(List<CategoryBean> catList) {
		this.catList = catList;
	}

	public List<ProductBean> getProdList() {
		return prodList;
	}

	public void setProdList(List<ProductBean> prodList) {
		this.prodList = prodList;
	}

	public List<modelBean> getModelList() {
		return modelList;
	}

	public void setModelList(List<modelBean> modelList) {
		this.modelList = modelList;
	}

	public List<CaratBean> getCaratList() {
		return caratList;
	}

	public void setCaratList(List<CaratBean> caratList) {
		this.caratList = caratList;
	}

	public List<RateBean> getRateList() {
		return rateList;
	}

	public void setRateList(List<RateBean> rateList) {
		this.rateList = rateList;
	}

	public List<CustomerBean> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<CustomerBean> customerList) {
		this.customerList = customerList;
	}

	public List<VendorBean> getVendorList() {
		return vendorList;
	}

	public void setVendorList(List<VendorBean> vendorList) {
		this.vendorList = vendorList;
	}

	public List<PurchaseBean> getPurchaseList() {
		return purchaseList;
	}

	public void setPurchaseList(List<PurchaseBean> purchaseList) {
		this.purchaseList = purchaseList;
	}

	public PurchaseBean getPurchaseBean() {
		return purchaseBean;
	}

	public void setPurchaseBean(PurchaseBean purchaseBean) {
		this.purchaseBean = purchaseBean;
	}

	public SalesBase getSalesBase() {
		return salesBase;
	}

	public void setSalesBase(SalesBase salesBase) {
		this.salesBase = salesBase;
	}

	public List<SalesBase> getSalesBaseList() {
		return salesBaseList;
	}

	public void setSalesBaseList(List<SalesBase> salesBaseList) {
		this.salesBaseList = salesBaseList;
	}
	
	

}
