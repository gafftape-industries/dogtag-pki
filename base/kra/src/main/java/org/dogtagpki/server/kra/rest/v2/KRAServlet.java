//
// Copyright Red Hat, Inc.
//
// SPDX-License-Identifier: GPL-2.0-or-later
//
package org.dogtagpki.server.kra.rest.v2;

import javax.servlet.ServletContext;

import org.dogtagpki.server.kra.KRAEngine;
import org.dogtagpki.server.rest.v2.PKIServlet;

/**
 * @author Marco Fargetta {@literal <mfargett@redhat.com>}
 */
public class KRAServlet extends PKIServlet {
    public static final long serialVersionUID = 1L;

    public KRAEngine getKRAEngine() {
        ServletContext servletContext = getServletContext();
        return (KRAEngine) servletContext.getAttribute("engine");
    }
}