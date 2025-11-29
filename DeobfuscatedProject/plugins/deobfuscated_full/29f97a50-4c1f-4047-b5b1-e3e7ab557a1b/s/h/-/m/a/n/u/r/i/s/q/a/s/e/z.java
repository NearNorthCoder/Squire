/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

/* TASK: Teleporting out -> TeleportOutTask */
@TaskDesc(name="Teleporting out", priority=8, register=true)
public class z
extends Task {
    private final /* synthetic */ SquireShamansPlugin aH;
    private final /* synthetic */ SquireShamanConfig aI;
    private static final /* synthetic */ Logger aF;
    private static final /* synthetic */ WorldPoint aG;
    private static /* synthetic */ String[] lIIlIlllIlIll;
    private final /* synthetic */ c aJ;
    private static /* synthetic */ int[] lIIlIlllIllII;

    private static boolean lIlIllIllllIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIllIlllIIlll() {
        lIIlIlllIlIll = new String[lIIlIlllIllII[9]];
        z.lIIlIlllIlIll[z.lIIlIlllIllII[1]] = z."Lizardman shaman";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[0]] = z."blowpipe needs to be charged";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[2]] = z."Oh dear, you are dead!";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[3]] = z."You died, stopping plugin";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[4]] = z."Eat";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[5]] = z."anti";
        z.lIIlIlllIlIll[z.lIIlIlllIllII[6]] = z."Drink";
    }

    static {
        z.lIlIllIlllIlllI();
        z.lIlIllIlllIIlll();
        aF = LoggerFactory.getLogger(z.class);
        aG = new WorldPoint(lIIlIlllIllII[7], lIIlIlllIllII[8], lIIlIlllIllII[1]);
    }

    private static String lIlIllIlllIIlII(String var16, String var1) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var13 = var1.toCharArray();
        int var3 = lIIlIlllIllII[1];
        char[] var12 = var16.toCharArray();
        int var9 = var12.length;
        int var14 = lIIlIlllIllII[1];
        while (z.lIlIllIllllIllI(var14, var9)) {
            char var11 = var12[var14];
            var20.append((char)(var11 ^ var13[var3 % var13.length]));
            0;
            ++var3;
            ++var14;
            0;
            if (((0x69 ^ 0x30 ^ (0x2E ^ 0x61)) & (110 + 30 - 133 + 175 ^ 112 + 92 - 140 + 96 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    @Inject
    public z(SquireShamansPlugin squireShamansPlugin, SquireShamanConfig squireShamanConfig, c c2) {
        this.aH = squireShamansPlugin;
        this.aI = squireShamanConfig;
        this.aJ = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        z var7;
        String[] stringArray = new String[lIIlIlllIllII[0]];
        stringArray[z.lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (z.lIlIllIlllIllll(nPC)) {
            this.aH.f(lIIlIlllIllII[1]);
            return lIIlIlllIllII[1];
        }
        Item var19 = Inventory.getFirst(item -> {
            int n2;
            if (z.lIlIllIllllIIll(item.getName().toLowerCase().contains(lIIlIlllIlIll[lIIlIlllIllII[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlllIllII[0]];
                stringArray[z.lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[6]];
                if (z.lIlIllIllllIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlIlllIllII[0];
                    0;
                    if ((0xA6 ^ 0xA2) > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlIlllIllII[1];
            return n2 != 0;
        });
        Item var15 = Inventory.getFirst(item -> item.hasAction(lIIlIlllIlIll[lIIlIlllIllII[4]]::equals));
        if (z.lIlIllIllllIIII(var15) && z.lIlIllIllllIIII(var19) && z.lIlIllIllllIIIl(var7.aH.i() ? 1 : 0) && z.lIlIllIllllIIlI(Prayers.getPoints())) {
            return lIIlIlllIllII[1];
        }
        Item var22 = Inventory.getFirst(var7.aI.teleportItem().u());
        if (z.lIlIllIlllIllll(var22)) {
            return lIIlIlllIllII[1];
        }
        var7.aH.f(lIIlIlllIllII[0]);
        if (z.lIlIllIllllIIll(var7.aJ.s() ? 1 : 0) && z.lIlIllIllllIIll(var7.aI.teleportItem().E() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)aG);
            0;
            return lIIlIlllIllII[0];
        }
        this.aI.teleportItem().B().accept((Item)var4_4);
        return lIIlIlllIllII[0];
    }

    private static boolean lIlIllIllllIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIllIllllIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        z var23;
        void var21;
        if (z.lIlIllIllllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (z.lIlIllIllllIIll(var21.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[0]]) ? 1 : 0)) {
            var23.aH.e(lIIlIlllIllII[0]);
        }
        if (z.lIlIllIllllIIll(var21.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[2]]) ? 1 : 0)) {
            Log.info((String)lIIlIlllIlIll[lIIlIlllIllII[3]]);
            var23.aH.forceStop();
        }
    }

    private static String lIlIllIlllIIlIl(String var10, String var24) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lIIlIlllIllII[2], var17);
            return new String(var25.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (z.lIlIllIllllIlIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.aH.f(lIIlIlllIllII[1]);
        }
    }

    private static boolean lIlIllIllllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlllIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIllllIIII(Object object) {
        return object != null;
    }

    private static String lIlIllIlllIIllI(String var18, String var4) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIlIlllIllII[10]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIIlIlllIllII[2], var8);
            return new String(var2.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllllIIll(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIlllIlllI() {
        lIIlIlllIllII = new int[11];
        z.lIIlIlllIllII[0] = 1;
        z.lIIlIlllIllII[1] = (0x29 ^ 0x6C) & ~(0xDB ^ 0x9E);
        z.lIIlIlllIllII[2] = 2;
        z.lIIlIlllIllII[3] = 3;
        z.lIIlIlllIllII[4] = 0x7D ^ 0x3D ^ (0x14 ^ 0x50);
        z.lIIlIlllIllII[5] = 0x51 ^ 0x54;
        z.lIIlIlllIllII[6] = 0x92 ^ 0x94;
        z.lIIlIlllIllII[7] = 0xFFFFE70E & 0x1DFD;
        z.lIIlIlllIllII[8] = -(28 + 22 - 12 + 91) & (0xFFFFBFEE & 0x67FB);
        z.lIIlIlllIllII[9] = 0x3C ^ 0x3B;
        z.lIIlIlllIllII[10] = 0xBF ^ 0xB7;
    }

    private static boolean lIlIllIllllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

