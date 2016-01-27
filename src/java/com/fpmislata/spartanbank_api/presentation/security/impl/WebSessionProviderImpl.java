package com.fpmislata.spartanbank_api.presentation.security.impl;

import com.fpmislata.spartanbank_api.presentation.security.WebSession;
import com.fpmislata.spartanbank_api.presentation.security.WebSessionProvider;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class WebSessionProviderImpl implements WebSessionProvider {

    @Override
    public WebSession getWebSession(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        HttpSession httpSession = httpServletRequest.getSession();
        WebSession webSession = (WebSession) httpSession.getAttribute("webSession");
        return webSession;
    }

}
