package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;

public class AmasadorPizzaIntegral implements Amasador {

    private static final Logger LOG = Logger.getLogger(AmasadorPizzaIntegral.class.getName());

    @Override
    public void amasar() {
        LOG.info("[@@] Amasando la pizza con masa integral.");
    }
}
