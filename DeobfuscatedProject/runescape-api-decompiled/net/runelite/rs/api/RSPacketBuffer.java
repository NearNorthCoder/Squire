/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.packets.PacketBuffer
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.packets.PacketBuffer;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSIsaacCipher;

public interface RSPacketBuffer
extends RSBuffer,
PacketBuffer {
    @Import(value="isaacCipher")
    public RSIsaacCipher getIsaacCipher();

    @Import(value="readSmartByteShortIsaac")
    public int readSmartByteShortIsaac();

    @Import(value="bitsRemaining")
    public int bitsRemaining(int var1);

    @Import(value="exportIndex")
    public void exportIndex();

    @Import(value="readBits")
    public int readBits(int var1);

    @Import(value="importIndex")
    public void importIndex();
}

