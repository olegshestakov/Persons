package org.sourceit.service;

import java.io.File;
import java.io.IOException;

public interface ParseService {

    /**
     *
     * @param file
     * @return
     * @throws IOException
     */
    String readEntities(File file) throws IOException;

    /**
     *
     * @param entity
     * @param file
     * @throws IOException
     */
    void writeEntities(String entity, File file) throws IOException;

}
