package org.designpattern.estrutural.composite;

import java.util.ArrayList;
import java.util.List;

public class Universidade implements Area{
    List<Area> areas = new ArrayList<>();

    public void adicionar(Area area) {
        areas.add(area);
    }

    @Override
    public void mostrarEstrutura() {
        areas.forEach(Area::mostrarEstrutura);
    }

    public void mostrarEstruturaString(StringBuilder estrutura) {
        estrutura.append("Universidade:\n");
        areas.forEach(it -> it.mostrarEstruturaString(estrutura));
    }
}
