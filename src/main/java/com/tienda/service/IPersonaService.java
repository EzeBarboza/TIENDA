package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona>getAllPersona();
    public Persona getPersonaById (long id);
    public void savePersona (Persona persona);
    public void delete (long id);
}
