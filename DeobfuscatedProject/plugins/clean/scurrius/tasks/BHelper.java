/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.scurrius.SquireScurrius;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.scurrius.tasks.ScurriusManager;

@Singleton
public class BHelper {
    
    final  Client u;
    final  SquireScurrius t;

    private static boolean lIlIllIlIlllIII(int n2) {
        return n2 != 0;
    }

    @Subscribe(priority=-2.1474836E9f)
    public void a(GameTick gameTick) {
    }

    private static boolean lIlIllIlIlllIIl(Object object) {
        return object == null;
    }

    static {
        b.lIlIllIlIllIllI();
        b.lIlIllIlIllIlIl();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        b var1;
        void var2;
        String string = chatMessage.getMessage();
        if (b.lIlIllIlIllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && b.lIlIllIlIllIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (b.lIlIllIlIlllIII(var2.contains(lIIlIllIllIlI[lIIlIllIllIll[0]]) ? 1 : 0)) {
            var1.o();
            System.out.println(lIIlIllIllIlI[lIIlIllIllIll[1]]);
            var1.t.e();
        }
        if (b.lIlIllIlIlllIII(var2.contains(lIIlIllIllIlI[lIIlIllIllIll[2]]) ? 1 : 0)) {
            var1.t.d(lIIlIllIllIll[1]);
            var1.o();
        }
    }

    private WorldPoint BHelper() {
        int[] nArray = new int[lIIlIllIllIll[1]];
        nArray[b.lIIlIllIllIll[0]] = d.A;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (b.lIlIllIlIlllIIl(tileObject)) {
            return new WorldPoint(lIIlIllIllIll[0], lIIlIllIllIll[0], lIIlIllIllIll[0]);
        }
        return tileObject.getWorldLocation().dx(lIIlIllIllIll[2]).dy(lIIlIllIllIll[4]);
    }

    private static boolean lIlIllIlIllIlll(Object object, Object object2) {
        return object != object2;
    }

    public void o() {
        this.t.d();
    }

    public int p() {
        return Vars.getBit((int)lIIlIllIllIll[3]);
    }

    private static void lIlIllIlIllIlIl() {
        lIIlIllIllIlI = new String[lIIlIllIllIll[5]];
        b.lIIlIllIllIlI[b.lIIlIllIllIll[0]] = "Your Scurrius kill count is";
        b.lIIlIllIllIlI[b.lIIlIllIllIll[1]] = "Finishing kill";
        b.lIIlIllIllIlI[b.lIIlIllIllIll[2]] = "Oh dear, you are dead!";
    }

    @Subscribe(priority=2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
    }

    @Inject
    public BHelper(SquireScurrius squireScurrius, Client client) {
        this.t = squireScurrius;
        this.u = client;
    }
}

