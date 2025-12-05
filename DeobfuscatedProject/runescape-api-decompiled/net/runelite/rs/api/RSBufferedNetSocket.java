/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.net.Socket;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAbstractSocket;

public interface RSBufferedNetSocket
extends RSAbstractSocket {
    @Import(value="socket")
    public Socket getSocket();
}

