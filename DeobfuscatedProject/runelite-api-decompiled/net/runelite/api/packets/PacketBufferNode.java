/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.packets;

import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBuffer;

public interface PacketBufferNode {
    public PacketBuffer getPacketBuffer();

    public ClientPacket getClientPacket();

    public void send();
}

