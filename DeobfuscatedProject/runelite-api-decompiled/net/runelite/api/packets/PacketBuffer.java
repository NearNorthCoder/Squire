/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.packets;

import net.runelite.api.Buffer;
import net.runelite.api.packets.IsaacCipher;

public interface PacketBuffer
extends Buffer {
    public void setAutomated(boolean var1);

    public IsaacCipher getIsaacCipher();

    public boolean isAutomated();

    public void consume();

    public boolean isConsumed();
}

