/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.driftnet.tasks;

import com.google.inject.Singleton;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class DriftnetManager {

    private  int j;

    public int i() {
        return this.j;
    }

    @Subscribe
    public void DriftnetManager(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if ((string.contains(var1[0] != 0) ? 1 : 0)) {
            this.j += 1;
        }
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public void h() {
        this.j = 0;
    }
}

