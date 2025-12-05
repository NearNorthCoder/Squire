/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

import net.runelite.api.packets.PacketBufferNode;

public class PacketBufferFlushed {
    private PacketBufferNode[] nodes;

    public PacketBufferNode[] getNodes() {
        return this.nodes;
    }

    public void setNodes(PacketBufferNode[] nodes) {
        this.nodes = nodes;
    }
}

