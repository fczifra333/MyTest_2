/*
 * Author:  Ferenc Czifra
 * Created: 2019.04.08
 */
package com.tsystems.gslacloud;

public interface StreamNode {
    public void nodeProcess (StreamRecord record);
    public void nodeCommit  (StreamRecord record);
    public void nodeRollback(StreamRecord record);
}
