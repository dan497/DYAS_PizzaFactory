package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;

public class AmasadorPizzaGruesa implements Amasador {
    private static final Logger LOG = Logger.getLogger(AmasadorPizzaGruesa.class.getName());

    @Override
    public void amasar() {
        LOG.info("[@@] Amasando la pizza de masa gruesa (masa de pan).");
    }
}
