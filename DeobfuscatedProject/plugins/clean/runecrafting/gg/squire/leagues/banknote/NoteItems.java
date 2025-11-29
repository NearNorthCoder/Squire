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

    @Provides
    NoteItemsConfig a(ConfigManager configManager) {
        return (NoteItemsConfig)configManager.getConfig(NoteItemsConfig.class);
    }

    protected void onStop() {
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIlI[0]];
        classArray[NoteItems.llIlI[1]] = NoteItemTask.class;
        return classArray;
    }

    static {
        NoteItems.lIIllII();
    }

    public void onGameTick(GameTick gameTick) {
    }
}

