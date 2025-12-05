/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.events.GameTick
 */
package net.unethicalite.client.managers;

import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;

@Singleton
public class AutoContinueManager {
    @Inject
    AutoContinueManager(EventBus eventBus) {
        eventBus.register(this);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (Dialog.canContinue() && Static.getSquireConfig().autoContinue()) {
            Dialog.continueSpace();
        }
    }
}

