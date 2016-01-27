package com.fpmislata.spartanbank_api.presentation.json;

/**
 *
 * @author PEDRO DEL BARRIO
 */
public interface JsonTransformer {

    String toJson(Object data);

    <T> T fromJson(String json, Class<T> clazz);
}
