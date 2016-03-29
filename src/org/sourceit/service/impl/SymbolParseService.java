package org.sourceit.service.impl;

import org.sourceit.service.ParseService;

import java.io.*;

public abstract class SymbolParseService implements ParseService {

    @Override
    public String readEntities(File file) throws IOException {

        Reader reader = new BufferedReader(new FileReader(file));

        String entities = "";
        int symbol = 0;

        while ((symbol = reader.read()) != -1) {
            entities += (char) symbol;
        }

        return entities;
    }

    @Override
    public void writeEntities(String entities, File file) throws IOException {

        Writer writer = new BufferedWriter(new FileWriter(file));

        String[] symbols = entities.split("");

        for (int i = 0; i < symbols.length; i++) {
            writer.write(symbols[i]);
        }

        writer.flush();

    }

}
