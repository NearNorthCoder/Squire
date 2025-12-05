/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.packets.PacketWriter
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.packets.PacketWriter;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAbstractSocket;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSIsaacCipher;
import net.runelite.rs.api.RSIterableNodeDeque;
import net.runelite.rs.api.RSPacketBuffer;
import net.runelite.rs.api.RSPacketBufferNode;
import net.runelite.rs.api.RSServerPacket;

public interface RSPacketWriter
extends PacketWriter {
    @Import(value="addNode")
    public void sendPacket(RSPacketBufferNode var1);

    @Import(value="packetBufferNodes")
    public RSIterableNodeDeque getQueuedPackets();

    @Import(value="isaacCipher")
    public RSIsaacCipher getIsaacCipher();

    @Import(value="serverPacket")
    public RSServerPacket getServerPacket();

    @Import(value="serverPacket")
    public void setServerPacket(RSServerPacket var1);

    @Import(value="serverPacketLength")
    public int getServerPacketLength();

    @Import(value="serverPacketLength")
    public void setServerPacketLength(int var1);

    @Import(value="socket")
    public RSAbstractSocket getSocket();

    @Import(value="packetBuffer")
    public RSPacketBuffer getPacketBuffer();

    @Import(value="buffer")
    public RSBuffer getBuffer();

    @Import(value="bufferSize")
    public int getBufferSize();

    @Import(value="bufferSize")
    public void setBufferSize(int var1);

    @Import(value="pendingWrites")
    public int getPendingWrites();

    @Import(value="pendingWrites")
    public void setPendingWrites(int var1);
}

