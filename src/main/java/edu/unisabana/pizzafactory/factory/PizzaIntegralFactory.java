package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.HorneadorPizzaIntegral;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaIntegral;

public class PizzaIntegralFactory implements PizzaFactory {
    public Amasador crearAmasador() { return new AmasadorPizzaIntegral(); }
    public Moldeador crearMoldeador() { return new MoldeadorPizzaIntegral(); }
    public Horneador crearHorneador() { return new HorneadorPizzaIntegral(); }
}
