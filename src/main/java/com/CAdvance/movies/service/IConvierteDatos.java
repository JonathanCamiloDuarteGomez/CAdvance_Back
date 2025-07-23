package com.CAdvance.movies.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
