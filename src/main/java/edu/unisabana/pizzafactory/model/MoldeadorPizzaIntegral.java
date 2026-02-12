package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;

public class MoldeadorPizzaIntegral implements Moldeador {

    private static final Logger LOG = Logger.getLogger(MoldeadorPizzaIntegral.class.getName());

    @Override
    public void moldearPizzaPequena() {
        LOG.info("[O] Moldeando pizza pequena de masa integral.");
    }

    @Override
    public void molderarPizzaMediana() {
        LOG.info("[O] Moldeando pizza mediana de masa integral.");
    }
}

