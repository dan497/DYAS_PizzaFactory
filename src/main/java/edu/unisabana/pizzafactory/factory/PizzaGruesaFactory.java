package edu.unisabana.pizzafactory.factory;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaGruesa;

public class PizzaGruesaFactory implements PizzaFactory {
    public Amasador crearAmasador() { return new AmasadorPizzaGruesa(); }
    public Moldeador crearMoldeador() { return new MoldeadorPizzaGruesa(); }
    public Horneador crearHorneador() { return new HorneadorPizzaGruesa(); }
}
