/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.packets;

import net.runelite.api.packets.IsaacCipher;
import net.runelite.api.packets.PacketBuffer;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.packets.ServerPacket;

public interface PacketWriter {
    public void queuePacket(PacketBufferNode var1);

    public IsaacCipher getIsaacCipher();

    public ServerPacket getServerPacket();

    public PacketBuffer getPacketBuffer();
}

