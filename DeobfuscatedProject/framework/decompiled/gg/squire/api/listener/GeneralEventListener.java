/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.InteractingChanged
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.api.listener;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.InteractingChanged;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class GeneralEventListener {
    @Inject
    private static Client client;
    private static int lastCombatTick;

    @Inject
    GeneralEventListener(EventBus eventBus) {
        eventBus.register((Object)this);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        this.updateCombatState();
    }

    private void updateCombatState() {
        if (client.getLocalPlayer().getHealthRatio() == -1) {
            lastCombatTick = client.getTickCount();
        }
    }

    @Subscribe
    public void onInteractingChanged(InteractingChanged interactingChanged) {
        if (interactingChanged.getSource() == client.getLocalPlayer()) {
            // empty if block
        }
    }

    public static int getLastCombatTick() {
        return lastCombatTick;
    }
}
