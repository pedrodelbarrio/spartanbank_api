package com.fpmislata.spartanbank_api.presentation.database;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class ServletContextListenerImplDataBaseMigration implements ServletContextListener {

    @Autowired
    private DataBaseMigration dataBaseMigration;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
        AutowireCapableBeanFactory autowireCapableBeanFactory = webApplicationContext.getAutowireCapableBeanFactory();
        autowireCapableBeanFactory.autowireBean(this);
        dataBaseMigration.migrate();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
