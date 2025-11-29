/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

/* TASK: Claiming chest -> ClaimingchestTask */
@TaskDesc(name="Claiming chest", priority=150, blocking=true, register=true)
public class ClaimingChestTask
extends Task {
    private final /* synthetic */ SquireBarrows ak;
    private static /* synthetic */ String[] llllIIIlIlI;
    private static /* synthetic */ int[] llllIIIlIll;

    private static boolean lIllIIlllIlIll(Object object) {
        return object == null;
    }

    private static String lIllIIlllIIlII(String var23, String var6) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(llllIIIlIll[3], var11);
            return new String(var13.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlllIlIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    public w(SquireBarrows squireBarrows) {
        this.ak = squireBarrows;
    }

    private static boolean lIllIIlllIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIIlllIlIII() {
        llllIIIlIll = new int[9];
        w.llllIIIlIll[0] = (92 + 58 - 3 + 29 ^ 113 + 143 - 196 + 85) & (181 + 186 - 182 + 5 ^ 107 + 78 - 117 + 91 ^ -1);
        w.llllIIIlIll[1] = 1;
        w.llllIIIlIll[2] = 3;
        w.llllIIIlIll[3] = 2;
        w.llllIIIlIll[4] = 0xAF ^ 0xA7;
        w.llllIIIlIll[5] = 0x64 ^ 0x24 ^ (2 ^ 0x44);
        w.llllIIIlIll[6] = 67 + 120 - 165 + 139 ^ 110 + 69 - 141 + 127;
        w.llllIIIlIll[7] = 0x7B ^ 0x7E;
        w.llllIIIlIll[8] = 0xE8 ^ 0x95 ^ (0x1C ^ 0x66);
    }

    static {
        w.lIllIIlllIlIII();
        w.lIllIIlllIIlll();
    }

    private static boolean lIllIIlllIllll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var20;
        if (w.lIllIIlllIllll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (!w.lIllIIlllIlIlI(var20.getMessage().contains(llllIIIlIlI[llllIIIlIll[6]]) ? 1 : 0) || w.lIllIIlllIlIIl(var20.getMessage().contains(llllIIIlIlI[llllIIIlIll[7]]) ? 1 : 0)) {
            w var24;
            Log.info((String)llllIIIlIlI[llllIIIlIll[5]]);
            var24.ak.b(llllIIIlIll[1]);
        }
    }

    private static boolean lIllIIlllIllIl(Object object) {
        return object != null;
    }

    private static void lIllIIlllIIlll() {
        llllIIIlIlI = new String[llllIIIlIll[4]];
        w.llllIIIlIlI[w.llllIIIlIll[0]] = w."Chest";
        w.llllIIIlIlI[w.llllIIIlIll[1]] = w."Eat";
        w.llllIIIlIlI[w.llllIIIlIll[3]] = w."Open";
        w.llllIIIlIlI[w.llllIIIlIll[2]] = w."Search";
        w.llllIIIlIlI[w.llllIIIlIll[6]] = w."Barrows chest count";
        w.llllIIIlIlI[w.llllIIIlIll[7]] = w."The chest is empty";
        w.llllIIIlIlI[w.llllIIIlIll[5]] = w."Looted the chest, resetting";
        w.llllIIIlIlI[w.llllIIIlIll[8]] = w."Eat";
    }

    private static boolean lIllIIlllIlIIl(int n2) {
        return n2 != 0;
    }

    private static String lIllIIlllIIlIl(String var25, String var4) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var22 = var4.toCharArray();
        int var19 = llllIIIlIll[0];
        char[] var8 = var25.toCharArray();
        int var3 = var8.length;
        int var7 = llllIIIlIll[0];
        while (w.lIllIIlllIllII(var7, var3)) {
            char var16 = var8[var7];
            var9.append((char)(var16 ^ var22[var19 % var22.length]));
            0;
            ++var19;
            ++var7;
            0;
            
            return null;
        }
        return String.valueOf(var9);
    }

    private static String lIllIIlllIIllI(String var18, String var10) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), llllIIIlIll[4]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llllIIIlIll[3], var15);
            return new String(var1.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        w var2;
        if (!w.lIllIIlllIlIIl(this.ak.h() ? 1 : 0) || w.lIllIIlllIlIIl(this.ak.v() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        if (w.lIllIIlllIlIlI(var2.ak.g() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        String[] stringArray = new String[llllIIIlIll[1]];
        stringArray[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[0]];
        TileObject var12 = TileObjects.getNearest((String[])stringArray);
        if (w.lIllIIlllIlIll(var12)) {
            return llllIIIlIll[0];
        }
        Item var5 = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIIlIll[1]];
            stringArray[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[8]];
            return item.hasAction(stringArray);
        });
        if (w.lIllIIlllIllII(Inventory.getFreeSlots(), llllIIIlIll[2]) && w.lIllIIlllIllIl(var5)) {
            var5.interact(llllIIIlIlI[llllIIIlIll[1]]);
            var2.sleep(llllIIIlIll[2]);
            return llllIIIlIll[1];
        }
        String[] stringArray2 = new String[llllIIIlIll[1]];
        stringArray2[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[3]];
        if (!w.lIllIIlllIlIlI(var12.hasAction(stringArray2) ? 1 : 0) || !w.lIllIIlllIlIIl(Reachable.isInteractable((Locatable)var12) ? 1 : 0) || w.lIllIIlllIlllI(var12.distanceTo(Players.getLocal().getWorldLocation()), llllIIIlIll[4])) {
            return llllIIIlIll[0];
        }
        if (w.lIllIIlllIllII(var2.ak.e(), llllIIIlIll[5])) {
            return llllIIIlIll[0];
        }
        NPC var14 = var2.ak.y();
        if (w.lIllIIlllIllIl(var14) && w.lIllIIlllIlIlI(var14.isDead() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        var1_1.interact(llllIIIlIlI[llllIIIlIll[2]]);
        return llllIIIlIll[1];
    }

    private static boolean lIllIIlllIlllI(int n2, int n3) {
        return n2 > n3;
    }
}

