/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.DialogOption
 *  net.runelite.api.events.DialogProcessed
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.api.packets.PacketBufferNode
 *  net.runelite.api.packets.ServerPacket
 *  net.unethicalite.api.events.MenuAutomated
 *  net.unethicalite.api.events.PacketSent
 *  net.unethicalite.api.events.ServerPacketReceived
 */
package net.runelite.client.plugins.unethicaldevtools;

import com.google.inject.Provides;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.DialogOption;
import net.runelite.api.events.DialogProcessed;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.packets.ServerPacket;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.unethicaldevtools.InteractionOverlay;
import net.runelite.client.plugins.unethicaldevtools.RegionOverlay;
import net.runelite.client.plugins.unethicaldevtools.UnethicalDevToolsConfig;
import net.runelite.client.plugins.unethicaldevtools.UnethicalDevToolsOverlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.events.PacketSent;
import net.unethicalite.api.events.ServerPacketReceived;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Dev Tools", description="Shows entity information", enabledByDefault=false)
public class SquireDevToolsPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(SquireDevToolsPlugin.class);
    @Inject
    private UnethicalDevToolsConfig config;
    @Inject
    private UnethicalDevToolsOverlay overlay;
    @Inject
    private RegionOverlay regionOverlay;
    @Inject
    private InteractionOverlay interactionOverlay;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private EventBus eventBus;
    @Inject
    private Client client;

    @Override
    public void startUp() {
        this.overlayManager.add(this.overlay);
        this.overlayManager.add(this.regionOverlay);
        this.overlayManager.add(this.interactionOverlay);
        this.eventBus.register(this.regionOverlay);
    }

    @Override
    public void shutDown() {
        this.overlayManager.remove(this.overlay);
        this.overlayManager.remove(this.regionOverlay);
        this.overlayManager.remove(this.interactionOverlay);
        this.eventBus.unregister(this.regionOverlay);
    }

    @Provides
    public UnethicalDevToolsConfig getConfig(ConfigManager configManager) {
        return configManager.getConfig(UnethicalDevToolsConfig.class);
    }

    @Subscribe
    public void onMenuAutomated(MenuAutomated e) {
        if (this.config.debugMenuActions()) {
            String debug = "O=" + e.getOption() + " | T=" + e.getTarget() + " | ID=" + e.getIdentifier() + " | OP=" + e.getOpcode().getId() + " | P0=" + e.getParam0() + " | P1=" + e.getParam1() + " | X=" + e.getClickX() + " | Y=" + e.getClickY();
            log.info("[Automated] {}", (Object)debug);
        }
    }

    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked e) {
        if (this.config.debugMenuActions()) {
            String action = "O=" + e.getMenuOption() + " | T=" + e.getMenuTarget() + " | ID=" + e.getId() + " | OP=" + e.getMenuAction().getId() + " | P0=" + e.getParam0() + " | P1=" + e.getParam1() + " | ITEM=" + e.getItemId();
            log.info("[Menu Action] {}", (Object)action);
        }
    }

    @Subscribe
    public void onDialogProcessed(DialogProcessed e) {
        if (!this.config.debugDialogs()) {
            return;
        }
        DialogOption dialogOption = DialogOption.of((int)e.getDialogOption().getWidgetUid(), (int)e.getDialogOption().getMenuIndex());
        if (dialogOption != null) {
            log.info("Dialog processed {}", (Object)dialogOption);
        } else {
            log.warn("Unknown or unmapped dialog {}", (Object)e);
        }
    }

    @Subscribe
    public void onPacketSent(PacketSent e) {
        List opcodes;
        int opcode;
        if (!this.config.packets()) {
            return;
        }
        PacketBufferNode packetBufferNode = e.getPacketBufferNode();
        int n = opcode = packetBufferNode.getClientPacket() != null ? packetBufferNode.getClientPacket().getId() : -1;
        if (!(this.config.opcodes().isBlank() || (opcodes = Arrays.stream(this.config.opcodes().split(",")).map(Integer::parseInt).collect(Collectors.toList())).isEmpty() || opcodes.contains(opcode))) {
            return;
        }
        ClientPacket packet = packetBufferNode.getClientPacket();
        if (packet == null) {
            return;
        }
        String packetName = (String)Static.getClientPacket().getClientPackets().get(packet);
        String id = packetName != null ? packetName : String.valueOf(opcode);
        log.info("Packet sent: [{}] {}, length: {}, writes {}", opcode, id, e.getPacketBufferNode().getClientPacket().getLength(), e.getPacketBufferNode().getPacketBuffer().getWrites());
        if (this.config.hexDump()) {
            log.info(e.hexDump());
        }
    }

    @Subscribe
    public void onServerPacketReceived(ServerPacketReceived e) {
        List opcodes;
        if (!this.config.serverPackets()) {
            return;
        }
        ServerPacket serverPacket = e.getServerPacket();
        if (!(this.config.opcodes().isBlank() || (opcodes = Arrays.stream(this.config.opcodes().split(",")).map(Integer::parseInt).collect(Collectors.toList())).isEmpty() || opcodes.contains(serverPacket.getId()))) {
            return;
        }
        String packetName = (String)Static.getServerPacket().getServerPackets().get(serverPacket);
        String id = packetName != null ? packetName : String.valueOf(serverPacket.getId());
        log.info("Packet received: [{}] {}, length: {}", serverPacket.getId(), id, e.getLength());
        if (this.config.hexDump()) {
            log.info(e.hexDump());
        }
    }

    @Subscribe
    public void onConfigChanged(ConfigChanged e) {
        if (!e.getGroup().equals("entityinspector")) {
            return;
        }
        if ("staffLevel".equals(e.getKey())) {
            this.client.setStaffModLevel(Integer.parseInt(e.getNewValue()));
        }
    }
}

