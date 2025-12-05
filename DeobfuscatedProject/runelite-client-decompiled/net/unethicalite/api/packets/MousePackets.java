/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.api.packets.PacketBufferNode
 */
package net.unethicalite.api.packets;

import java.awt.Point;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MousePackets {
    private static final Logger log = LoggerFactory.getLogger(MousePackets.class);
    private static int lastMouseRecordX = -1;
    private static int lastMouseRecordY = -1;
    private static long lastMouseRecordTime = -1L;

    public static void queueClickPacket(int x, int y) {
        InteractionManager.setLastClickPoint(new Point(x, y));
        Static.getClient().setMouseLastPressedMillis(System.currentTimeMillis());
        int mousePressedTime = (int)(Static.getClient().getMouseLastPressedMillis() - Static.getClient().getClientMouseLastPressedMillis());
        if (mousePressedTime < 0) {
            mousePressedTime = 0;
        }
        if (mousePressedTime > Short.MAX_VALUE) {
            mousePressedTime = Short.MAX_VALUE;
        }
        Static.getClient().setClientMouseLastPressedMillis(Static.getClient().getMouseLastPressedMillis());
        int mouseInfo = mousePressedTime << 1;
        MousePackets.queueClickPacket(mouseInfo, x, y);
    }

    public static void queueClickPacket(int mouseInfo, int x, int y) {
        GameThread.invoke(() -> MousePackets.createClickPacket(mouseInfo, x, y).send());
    }

    public static void queueClickPacket() {
        MousePackets.queueClickPacket(0, 0);
    }

    public static void queueRecorderPacket(int[] xs, int[] ys, long[] millis) {
        Client client = Static.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = null;
        int offset = 0;
        int totalTime = 0;
        int packetEntries = 0;
        int indicesParsed = 0;
        for (int index = 0; index < xs.length && (packetBufferNode == null || packetBufferNode.getPacketBuffer().getOffset() - offset < 246); ++index) {
            int td;
            int yd;
            int xd;
            indicesParsed = index;
            int x = xs[index];
            if (x < -1) {
                x = -1;
            } else if (x > 65534) {
                x = 65534;
            }
            int y = ys[index];
            if (y < -1) {
                y = -1;
            } else if (y > 65534) {
                y = 65534;
            }
            if (packetBufferNode == null) {
                packetBufferNode = Static.getClient().preparePacket(clientPacket.MOUSE_RECORDER_DATA(), client.getPacketWriter().getIsaacCipher());
                packetBufferNode.getPacketBuffer().writeByte(0);
                offset = packetBufferNode.getPacketBuffer().getOffset();
                packetBufferNode.getPacketBuffer().setOffset(offset + 2);
            }
            if (lastMouseRecordTime != -1L) {
                xd = x - lastMouseRecordX;
                yd = y - lastMouseRecordY;
                td = (int)((millis[index] - lastMouseRecordTime) / 20L);
                totalTime = (int)((long)totalTime + (millis[index] - lastMouseRecordTime) % 20L);
            } else {
                xd = x;
                yd = y;
                td = Integer.MAX_VALUE;
            }
            lastMouseRecordX = x;
            lastMouseRecordY = y;
            if (td < 8 && xd >= -32 && xd <= 31 && yd >= -32 && yd <= 31) {
                packetBufferNode.getPacketBuffer().writeShort((td << 12) + (yd += 32) + ((xd += 32) << 6));
            } else if (td < 32 && xd >= -128 && xd <= 127 && yd >= -128 && yd <= 127) {
                packetBufferNode.getPacketBuffer().writeByte(td + 128);
                packetBufferNode.getPacketBuffer().writeShort((yd += 128) + ((xd += 128) << 8));
            } else if (td < 32) {
                packetBufferNode.getPacketBuffer().writeByte(td + 192);
                if (x != -1 && y != -1) {
                    packetBufferNode.getPacketBuffer().writeInt(x | y << 16);
                } else {
                    packetBufferNode.getPacketBuffer().writeInt(Integer.MIN_VALUE);
                }
            } else {
                packetBufferNode.getPacketBuffer().writeShort((td & 0x1FFF) + 57344);
                if (x != -1 && y != -1) {
                    packetBufferNode.getPacketBuffer().writeInt(x | y << 16);
                } else {
                    packetBufferNode.getPacketBuffer().writeInt(Integer.MIN_VALUE);
                }
            }
            ++packetEntries;
            lastMouseRecordTime = millis[index];
        }
        if (packetBufferNode != null) {
            packetBufferNode.getPacketBuffer().writeLengthByte(packetBufferNode.getPacketBuffer().getOffset() - offset);
            int currentOffset = packetBufferNode.getPacketBuffer().getOffset();
            packetBufferNode.getPacketBuffer().setOffset(offset);
            packetBufferNode.getPacketBuffer().writeByte(totalTime / packetEntries);
            packetBufferNode.getPacketBuffer().writeByte(totalTime % packetEntries);
            packetBufferNode.getPacketBuffer().setOffset(currentOffset);
            client.getPacketWriter().queuePacket(packetBufferNode);
        }
        if (indicesParsed + 1 < xs.length) {
            int[] xsRemaining = new int[xs.length - indicesParsed];
            System.arraycopy(xs, indicesParsed, xsRemaining, 0, xs.length - indicesParsed);
            int[] ysRemaining = new int[ys.length - indicesParsed];
            System.arraycopy(ys, indicesParsed, ysRemaining, 0, ys.length - indicesParsed);
            long[] millisRemaining = new long[millis.length - indicesParsed];
            System.arraycopy(millis, indicesParsed, millisRemaining, 0, millis.length - indicesParsed);
            log.debug("Mouse recording too large for one packet, trying to send another with {} entries remaining", (Object)xsRemaining.length);
            MousePackets.queueRecorderPacket(xsRemaining, ysRemaining, millisRemaining);
        }
    }

    public static void queueMouseWheelRotationPacket(int rotation) {
        Client client = Static.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.ROTATE_MOUSE_WHEEL(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShort(rotation);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static PacketBufferNode createClickPacket(int mouseInfo, int x, int y) {
        Client client = Static.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.EVENT_MOUSE_CLICK(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAddLE(y);
        packetBufferNode.getPacketBuffer().writeShort(mouseInfo);
        packetBufferNode.getPacketBuffer().writeShortLE(x);
        packetBufferNode.getPacketBuffer().writeByteNeg(0);
        return packetBufferNode;
    }
}

