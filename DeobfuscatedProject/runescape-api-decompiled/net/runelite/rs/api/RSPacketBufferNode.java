/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.packets.PacketBufferNode
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.packets.PacketBufferNode;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSClientPacket;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSPacketBuffer;

public interface RSPacketBufferNode
extends PacketBufferNode,
RSNode {
    @Import(value="packetBuffer")
    public RSPacketBuffer getPacketBuffer();

    @Import(value="clientPacket")
    public RSClientPacket getClientPacket();

    @Import(value="index")
    public int getIndex();

    @Import(value="index")
    public void setIndex(int var1);

    @Import(value="release")
    public void release();
}

