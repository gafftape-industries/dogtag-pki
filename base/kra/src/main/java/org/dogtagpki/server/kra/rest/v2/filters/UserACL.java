package org.dogtagpki.server.kra.rest.v2.filters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;

import org.dogtagpki.server.rest.v2.ACLFilter;

@WebFilter(servletNames = "kraUser")
public class UserACL extends ACLFilter {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        setAcl("users");
    }

}
