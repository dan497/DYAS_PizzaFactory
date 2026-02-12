package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;

public class PizzaDelgadaFactory implements PizzaFactory {
    public Amasador crearAmasador() { return new AmasadorPizzaDelgada(); }
    public Moldeador crearMoldeador() { return new MoldeadorPizzaDelgada(); }
    public Horneador crearHorneador() { return new HorneadorPizzaDelgada(); }
}
