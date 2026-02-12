package edu.unisabana.pizzafactory.model;

import java.util.logging.Logger;

public class HorneadorPizzaGruesa implements Horneador {
    private static final Logger LOG = Logger.getLogger(HorneadorPizzaGruesa.class.getName());

    @Override
    public void hornear() {
        LOG.info("[~~] Horneando la pizza de masa gruesa.");
    }
}
