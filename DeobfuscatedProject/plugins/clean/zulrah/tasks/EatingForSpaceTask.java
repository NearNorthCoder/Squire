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

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating for space", priority=0x7FFFFFFF, register=true)
public class EatingForSpaceTask
extends ZulrahTaskBase {

    private  boolean au;

    @Override
    public boolean ac() {
        if (X.llIIIlllIlIIlIl(this.au ? 1 : 0)) {
            return lIllIlIIIIIll[0];
        }
        Inventory.getFirst(item -> item.hasAction(lIllIlIIIIIlI[lIllIlIIIIIll[2]]::equals)).interact(lIllIlIIIIIlI[lIllIlIIIIIll[0]]);
        this.au = lIllIlIIIIIll[0];
        return lIllIlIIIIIll[1];
    }

    private static void llIIIlllIlIIIll() {
        lIllIlIIIIIlI = new String[lIllIlIIIIIll[3]];
        X.lIllIlIIIIIlI[X.lIllIlIIIIIll[0]] = "Eat";
        X.lIllIlIIIIIlI[X.lIllIlIIIIIll[1]] = "You don't have enough free inventory space";
        X.lIllIlIIIIIlI[X.lIllIlIIIIIll[2]] = "Eat";
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if (X.llIIIlllIlIIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (X.llIIIlllIlIIlIl(var1.getMessage().contains(lIllIlIIIIIlI[lIllIlIIIIIll[1]]) ? 1 : 0)) {
            return;
        }
        this.au = lIllIlIIIIIll[1];
    }

    static {
        X.llIIIlllIlIIlII();
        X.llIIIlllIlIIIll();
    }

    private static boolean llIIIlllIlIIllI(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    protected EatingForSpaceTask(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
        this.au = lIllIlIIIIIll[0];
    }

    private static boolean llIIIlllIlIIlIl(int n2) {
        return n2 == 0;
    }

}

