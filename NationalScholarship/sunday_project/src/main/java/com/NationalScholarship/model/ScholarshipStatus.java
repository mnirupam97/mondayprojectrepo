package com.NationalScholarship.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scholarship_status")
public class ScholarshipStatus {

	@Id
	private String application_id;
	private String institute_approval;
	private String state_nodal_approval;
	private String ministry_grant;
	
	public String getApplication_id() {
		return application_id;
	}
	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}
	public String getInstitute_approval() {
		return institute_approval;
	}
	public void setInstitute_approval(String institute_approval) {
		this.institute_approval = institute_approval;
	}
	public String getState_nodal_approval() {
		return state_nodal_approval;
	}
	public void setState_nodal_approval(String state_nodal_approval) {
		this.state_nodal_approval = state_nodal_approval;
	}
	public String getMinistry_grant() {
		return ministry_grant;
	}
	public void setMinistry_grant(String ministry_grant) {
		this.ministry_grant = ministry_grant;
	}
	public ScholarshipStatus() {
		super();
	}
	@Override
	public String toString() {
		return "ScholarshipStatus [application_id=" + application_id + ", institute_approval=" + institute_approval
				+ ", state_nodal_approval=" + state_nodal_approval + ", ministry_grant=" + ministry_grant + "]";
	}
	
}
