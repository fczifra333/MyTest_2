/*
 * Author:  Ferenc Czifra
 * Created: 2019.04.08
 */
package com.tsystems.gslacloud;

/**
 * Common interface of the XxxFields enums.
 */
public interface FieldsInterface {
    FieldType getType ();
    int       getMaxNameLen();
}

