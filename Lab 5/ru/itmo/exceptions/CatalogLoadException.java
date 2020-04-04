package ru.itmo.exceptions;

import java.io.FileNotFoundException;

public class CatalogLoadException extends Exception {
    public CatalogLoadException(FileNotFoundException e) {
        System.out.println(e.getMessage());
    }

    public CatalogLoadException(ItemAlreadyExistsException e) {
        System.out.println(e.getMessage());
    }
}