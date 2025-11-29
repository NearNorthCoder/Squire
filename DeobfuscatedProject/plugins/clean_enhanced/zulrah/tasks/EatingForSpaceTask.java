/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating for space", priority=0x7FFFFFFF, register=true)
public class EatingForSpaceTask
extends ad {

    private  boolean au;

    @Override
    public boolean ac() {
        if (this.au == 0) {
            return 0;
        }
        Inventory.getFirst(item -> item.hasAction(var2[2]::equals)).interact(var2[0]);
        this.au = 0;
        return 1;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var3;
        if ((chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        if ((var3.getMessage( == 0).contains(var2[1]) ? 1 : 0)) {
            return;
        }
        this.au = 1;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    protected EatingForSpaceTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
        this.au = 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }
}

