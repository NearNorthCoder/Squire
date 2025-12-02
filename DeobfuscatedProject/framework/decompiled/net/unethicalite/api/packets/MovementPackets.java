/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.api.packets.PacketBuffer
 *  net.runelite.api.packets.PacketBufferNode
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.client.Static
 */
package net.unethicalite.api.packets;

import net.runelite.api.Client;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBuffer;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;

public class MovementPackets {
    public static void sendMovement(int worldX, int worldY) {
        MovementPackets.sendMovement(worldX, worldY, false);
    }

    public static void sendMovement(WorldPoint worldPoint, boolean ctrlDown) {
        MovementPackets.sendMovement(worldPoint.getX(), worldPoint.getY(), ctrlDown);
    }

    public static void sendMovement(WorldPoint worldPoint) {
        MovementPackets.sendMovement(worldPoint, false);
    }

    public static void sendMovement(int worldPointX, int worldPointY, boolean ctrlDown) {
        Client client = Static.getClient();
        MovementPackets.createMovement(worldPointX, worldPointY, ctrlDown).send();
    }

    public static PacketBufferNode createMovement(int worldPointX, int worldPointY, boolean ctrlDown) {
        Client client = Static.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.MOVE_GAMECLICK(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByte(5);
        packetBufferNode.getPacketBuffer().writeShortAdd(worldPointY);
        packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 2 : 0);
        packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
        return packetBufferNode;
    }

    public static void sendMinimapMovement(WorldPoint worldPoint, int clickX, int clickY) {
        Client client = Static.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.MINIMAP_CLICK(), client.getPacketWriter().getIsaacCipher());
        Widget minimapDrawWidget = null;
        minimapDrawWidget = client.isResized() ? (client.getVarbitValue(4607) == 1 ? client.getWidget(WidgetInfo.RESIZABLE_MINIMAP_DRAW_AREA) : client.getWidget(WidgetInfo.RESIZABLE_MINIMAP_STONES_DRAW_AREA)) : client.getWidget(WidgetInfo.FIXED_VIEWPORT_MINIMAP_DRAW_AREA);
        if (minimapDrawWidget == null) {
            System.out.println("No minimap widget found");
            return;
        }
        PacketBuffer buffer = packetBufferNode.getPacketBuffer();
        Player local = Players.getLocal();
        buffer.writeByte(18);
        buffer.writeByteSub(0);
        buffer.writeShortAddLE(worldPoint.getWorldY());
        buffer.writeShortAddLE(worldPoint.getWorldX());
        int clickInMinimapX = clickX - minimapDrawWidget.getBounds().x;
        buffer.writeByte(clickInMinimapX);
        int clickInMinimapY = clickY - minimapDrawWidget.getBounds().y;
        buffer.writeByte(clickInMinimapY);
        buffer.writeShort(client.getMapAngle());
        buffer.writeByte(57);
        buffer.writeByte(0);
        buffer.writeByte(0);
        buffer.writeByte(89);
        buffer.writeShort(local.getWorldLocation().getX());
        buffer.writeShort(local.getWorldLocation().getY());
        buffer.writeByte(63);
        packetBufferNode.send();
    }
}
