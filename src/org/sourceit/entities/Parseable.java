package org.sourceit.entities;

import org.sourceit.exception.ReadException;

public interface Parseable {

    Object readProperties(String properties) throws ReadException;

}
