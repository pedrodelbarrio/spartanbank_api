package com.fpmislata.spartanbank_api.presentation.security;

import com.fpmislata.spartanbank_service.business.domain.Usuario;
import java.util.Date;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class WebSession {

    private Usuario usuario;
    private Date fecha;

    public WebSession() {
    }

    public WebSession(Usuario usuario, Date fecha) {
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
