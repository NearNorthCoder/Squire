/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.events.NpcDespawned
 */
package net.runelite.client.plugins.bosstimer;

import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.NpcUtil;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.bosstimer.Boss;
import net.runelite.client.plugins.bosstimer.RespawnTimer;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Boss Timers", description="Show boss spawn timer overlays", tags={"combat", "pve", "overlay", "spawn"})
public class BossTimersPlugin
extends Plugin {
    private static final Logger log = LoggerFactory.getLogger(BossTimersPlugin.class);
    @Inject
    private InfoBoxManager infoBoxManager;
    @Inject
    private ItemManager itemManager;
    @Inject
    private NpcUtil npcUtil;

    @Override
    protected void shutDown() throws Exception {
        this.infoBoxManager.removeIf(t -> t instanceof RespawnTimer);
    }

    @Subscribe
    public void onNpcDespawned(NpcDespawned npcDespawned) {
        NPC npc = npcDespawned.getNpc();
        if (!this.npcUtil.isDying(npc)) {
            return;
        }
        int npcId = npc.getId();
        Boss boss = Boss.find(npcId);
        if (boss == null) {
            return;
        }
        this.infoBoxManager.removeIf(t -> t instanceof RespawnTimer && ((RespawnTimer)t).getBoss() == boss);
        log.debug("Creating spawn timer for {} ({} seconds)", (Object)npc.getName(), (Object)boss.getSpawnTime());
        RespawnTimer timer = new RespawnTimer(boss, this.itemManager.getImage(boss.getItemSpriteId()), this);
        timer.setTooltip(npc.getName());
        this.infoBoxManager.addInfoBox(timer);
    }
}

