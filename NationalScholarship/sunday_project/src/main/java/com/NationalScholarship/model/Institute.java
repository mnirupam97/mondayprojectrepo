package com.NationalScholarship.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Institute {
	
	@Id
	private String inst_code;
	@Column(unique=true)
	private String inst_username;
	private String inst_name;
	private String inst_state;
	private String inst_district;
	private String inst_dice_code;
	private String inst_location;
	private String inst_type;
	private String inst_aff_uni_state;
	private String inst_aff_uni_board;
	@Temporal(TemporalType.DATE)
	private Date inst_year_adm_starT;
	private String inst_password;
	private String inst_estab_cert;
	private String inst_uni_affil_cert;
	private String inst_address;
	private String inst_principal_name;
	private String inst_contact_number;
	private String inst_college_phone;
	private String inst_approval_status;
	
	
	public String getInst_approval_status() {
		return inst_approval_status;
	}
	public void setInst_approval_status(String inst_approval_status) {
		this.inst_approval_status = inst_approval_status;
	}
	public String getInst_code() {
		return inst_code;
	}
	public void setInst_code(String inst_code) {
		this.inst_code = inst_code;
	}
	
	public String getInst_state() {
		return inst_state;
	}
	
	public void setInst_state(String inst_state) {
		this.inst_state = inst_state;
	}
	public String getInst_district() {
		return inst_district;
	}
	public void setInst_district(String inst_district) {
		this.inst_district = inst_district;
	}
	public String getInst_dice_code() {
		return inst_dice_code;
	}
	public void setInst_dice_code(String inst_dice_code) {
		this.inst_dice_code = inst_dice_code;
	}
	public String getInst_location() {
		return inst_location;
	}
	
	
	public String getInst_name() {
		return inst_name;
	}
	public void setInst_name(String inst_name) {
		this.inst_name = inst_name;
	}
	public void setInst_location(String inst_location) {
		this.inst_location = inst_location;
	}
	public String getInst_type() {
		return inst_type;
	}
	public void setInst_type(String inst_type) {
		this.inst_type = inst_type;
	}
	public String getInst_aff_uni_state() {
		return inst_aff_uni_state;
	}
	public void setInst_aff_uni_state(String inst_aff_uni_state) {
		this.inst_aff_uni_state = inst_aff_uni_state;
	}
	public String getInst_aff_uni_board() {
		return inst_aff_uni_board;
	}
	public void setInst_aff_uni_board(String inst_aff_uni_board) {
		this.inst_aff_uni_board = inst_aff_uni_board;
	}

	public Date getInst_year_adm_starT() {
		return inst_year_adm_starT;
	}
	public void setInst_year_adm_starT(Date inst_year_adm_starT) {
		this.inst_year_adm_starT = inst_year_adm_starT;
	}
	public String getInst_password() {
		return inst_password;
	}
	public void setInst_password(String inst_password) {
		this.inst_password = inst_password;
	}
	public String getInst_estab_cert() {
		return inst_estab_cert;
	}
	public void setInst_estab_cert(String inst_estab_cert) {
		this.inst_estab_cert = inst_estab_cert;
	}
	public String getInst_uni_affil_cert() {
		return inst_uni_affil_cert;
	}
	public void setInst_uni_affil_cert(String inst_uni_affil_cert) {
		this.inst_uni_affil_cert = inst_uni_affil_cert;
	}
	public String getInst_address() {
		return inst_address;
	}
	public void setInst_address(String inst_address) {
		this.inst_address = inst_address;
	}
	public String getInst_principal_name() {
		return inst_principal_name;
	}
	public void setInst_principal_name(String inst_principal_name) {
		this.inst_principal_name = inst_principal_name;
	}
	public String getInst_contact_number() {
		return inst_contact_number;
	}
	public void setInst_contact_number(String inst_contact_number) {
		this.inst_contact_number = inst_contact_number;
	}
	public String getInst_college_phone() {
		return inst_college_phone;
	}
	public void setInst_college_phone(String inst_college_phone) {
		this.inst_college_phone = inst_college_phone;
	}
	
	
	
	public String getInst_username() {
		return inst_username;
	}
	public void setInst_username(String inst_username) {
		this.inst_username = inst_username;
	}
	public Institute() {
		super();
	}
	@Override
	public String toString() {
		return "Institute [inst_code=" + inst_code + ", inst_name=" + inst_name + ", inst_state=" + inst_state + ", inst_district=" + inst_district
				+ ", inst_dice_code=" + inst_dice_code + ", inst_location=" + inst_location + ", inst_type=" + inst_type
				+ ", inst_aff_uni_state=" + inst_aff_uni_state + ", inst_aff_uni_board=" + inst_aff_uni_board
				+ ", inst_year_adm_starT=" + inst_year_adm_starT + ", inst_username=" + inst_username
				+ ", inst_password=" + inst_password + ", inst_estab_cert=" + inst_estab_cert + ", inst_uni_affil_cert="
				+ inst_uni_affil_cert + ", inst_address=" + inst_address + ", inst_principal_name="
				+ inst_principal_name + ", inst_contact_number=" + inst_contact_number + ", inst_college_phone="
				+ inst_college_phone + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
