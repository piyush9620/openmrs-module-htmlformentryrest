package org.openmrs.module.htmlformentryrest.web.resources;

import org.openmrs.module.webservices.rest.web.RequestContext;
import org.openmrs.module.webservices.rest.web.representation.Representation;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingCrudResource;
import org.openmrs.module.webservices.rest.web.resource.impl.DelegatingResourceDescription;
import org.openmrs.module.webservices.rest.web.response.ResponseException;

public class Data extends DelegatingCrudResource {
	
	Integer id;
	
	String msg;
	
	public Data(Integer id, String msg) {
		this.id = id;
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public Integer getId() {
		return id;
	}
	
	@Override
	public void purge(Object delegate, RequestContext context) throws ResponseException {
		
	}
	
	@Override
	public Object getByUniqueId(String uniqueId) {
		return null;
	}
	
	@Override
	public Object save(Object delegate) {
		return null;
	}
	
	@Override
	protected void delete(Object delegate, String reason, RequestContext context) throws ResponseException {
		
	}
	
	@Override
	public Object newDelegate() {
		return null;
	}
	
	@Override
	public DelegatingResourceDescription getRepresentationDescription(Representation rep) {
		return null;
	}
}
