package com.fpmislata.spartanbank_api.presentation.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface WebSessionProvider {

    WebSession getWebSession(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);

}
