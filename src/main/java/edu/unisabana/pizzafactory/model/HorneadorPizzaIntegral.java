package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;

public class HorneadorPizzaIntegral implements Horneador {

    private static final Logger LOG = Logger.getLogger(HorneadorPizzaIntegral.class.getName());

    @Override
    public void hornear() {
        LOG.info("[~~] Horneando la pizza con masa integral.");
    }
}
