package com.fpmislata.spartanbank_api.presentation.database.impl;

import com.fpmislata.spartanbank_api.presentation.database.DataBaseMigration;
import com.fpmislata.spartanbank_service.persistence.jdbc.DataSourceFactory;
import javax.sql.DataSource;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public class DataBaseMigrationImplFlyway implements DataBaseMigration {

    @Autowired
    private DataSourceFactory dataSourceFactory;

    @Override
    public void migrate() {
        try {
            DataSource dataSource = dataSourceFactory.getDataSource();
            Flyway flyway = new Flyway();
            flyway.setDataSource(dataSource);
            flyway.setLocations("el.paquete.con.los.scripts.de.la.base.de.datos");
            flyway.setEncoding("utf-8");
            flyway.migrate();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
