/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.leagues.banknote;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.leagues.banknote.NoteItemsConfig;
import gg.squire.leagues.banknote.NoteItemTask;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name="[Leagues] Note items", enabledByDefault=false)
@SquireUtil
public class NoteItems
extends SquirePlugin {
    private static  int[] llIlI;

    @Provides
    NoteItemsConfig a(ConfigManager configManager) {
        return (NoteItemsConfig)configManager.getConfig(NoteItemsConfig.class);
    }

    protected void onStop() {
    }

    private static void lIIllII() {
        llIlI = new int[2];
        NoteItems.llIlI[0] = 1;
        NoteItems.llIlI[1] = (0xAE ^ 0x97 ^ (0xC ^ 0x72)) & (80 + 39 - 114 + 125 ^ 195 + 131 - 199 + 70 ^ -1);
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIlI[0]];
        classArray[NoteItems.llIlI[1]] = NoteItemTask.class;
        return classArray;
    }

    public void onGameTick(GameTick gameTick) {
    }
}

