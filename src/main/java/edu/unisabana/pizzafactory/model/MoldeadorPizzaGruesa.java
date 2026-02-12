package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;

public class MoldeadorPizzaGruesa implements Moldeador {
    private static final Logger LOG = Logger.getLogger(MoldeadorPizzaGruesa.class.getName());

    @Override
    public void moldearPizzaPequena() {
        LOG.info("[O] Moldeando pizza pequena de masa gruesa.");
    }

    @Override
    public void molderarPizzaMediana() {
        LOG.info("[O] Moldeando pizza mediana de masa gruesa.");
    }
}
