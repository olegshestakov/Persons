package org.sourceit.service.impl;

import org.sourceit.service.ParseService;

import java.io.*;

public abstract class ByteParseService implements ParseService {

    @Override
    public String readEntities(File file) throws IOException {

        InputStream stream = new BufferedInputStream(new FileInputStream(file));

        String entities = "";
        int symbol = 0;

        while ((symbol = stream.read()) != -1) {
            entities += (char) symbol;
        }

        return entities;
    }

    @Override
    public void writeEntities(String entities, File file) throws IOException {

        OutputStream stream = new BufferedOutputStream(new FileOutputStream(file));

        for (int i = 0; i < entities.length(); i++) {
            stream.write(entities.charAt(i));
        }

        stream.flush();

    }

}
