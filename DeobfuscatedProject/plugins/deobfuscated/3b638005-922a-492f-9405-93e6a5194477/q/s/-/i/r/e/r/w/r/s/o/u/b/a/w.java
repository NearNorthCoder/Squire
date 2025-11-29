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

@TaskDesc(name="Claiming chest", priority=150, blocking=true, register=true)
public class w
extends Task {
    private final /* synthetic */ SquireBarrows ak;
    private static /* synthetic */ String[] llllIIIlIlI;
    private static /* synthetic */ int[] llllIIIlIll;

    private static boolean lIllIIlllIlIll(Object object) {
        return object == null;
    }

    private static String lIllIIlllIIlII(String llllllllllllllllIIIlllIlIlIlIIIl, String llllllllllllllllIIIlllIlIlIlIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIlIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIlllIlIlIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIlllIlIlIlIlIl.init(llllIIIlIll[3], llllllllllllllllIIIlllIlIlIlIllI);
            return new String(llllllllllllllllIIIlllIlIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIlIlIlIlII) {
            llllllllllllllllIIIlllIlIlIlIlII.printStackTrace();
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
        void llllllllllllllllIIIlllIlIlIllIll;
        if (w.lIllIIlllIllll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (!w.lIllIIlllIlIlI(llllllllllllllllIIIlllIlIlIllIll.getMessage().contains(llllIIIlIlI[llllIIIlIll[6]]) ? 1 : 0) || w.lIllIIlllIlIIl(llllllllllllllllIIIlllIlIlIllIll.getMessage().contains(llllIIIlIlI[llllIIIlIll[7]]) ? 1 : 0)) {
            w llllllllllllllllIIIlllIlIlIlllII;
            Log.info((String)llllIIIlIlI[llllIIIlIll[5]]);
            llllllllllllllllIIIlllIlIlIlllII.ak.b(llllIIIlIll[1]);
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

    private static String lIllIIlllIIlIl(String llllllllllllllllIIIlllIlIlIIIIll, String llllllllllllllllIIIlllIlIlIIIIlI) {
        llllllllllllllllIIIlllIlIlIIIIll = new String(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIlllIlIlIIIIIl = new StringBuilder();
        char[] llllllllllllllllIIIlllIlIlIIIIII = llllllllllllllllIIIlllIlIlIIIIlI.toCharArray();
        int llllllllllllllllIIIlllIlIIllllll = llllIIIlIll[0];
        char[] llllllllllllllllIIIlllIlIIlllIIl = llllllllllllllllIIIlllIlIlIIIIll.toCharArray();
        int llllllllllllllllIIIlllIlIIlllIII = llllllllllllllllIIIlllIlIIlllIIl.length;
        int llllllllllllllllIIIlllIlIIllIlll = llllIIIlIll[0];
        while (w.lIllIIlllIllII(llllllllllllllllIIIlllIlIIllIlll, llllllllllllllllIIIlllIlIIlllIII)) {
            char llllllllllllllllIIIlllIlIlIIIlII = llllllllllllllllIIIlllIlIIlllIIl[llllllllllllllllIIIlllIlIIllIlll];
            llllllllllllllllIIIlllIlIlIIIIIl.append((char)(llllllllllllllllIIIlllIlIlIIIlII ^ llllllllllllllllIIIlllIlIlIIIIII[llllllllllllllllIIIlllIlIIllllll % llllllllllllllllIIIlllIlIlIIIIII.length]));
            0;
            ++llllllllllllllllIIIlllIlIIllllll;
            ++llllllllllllllllIIIlllIlIIllIlll;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIlllIlIlIIIIIl);
    }

    private static String lIllIIlllIIllI(String llllllllllllllllIIIlllIlIIlIllII, String llllllllllllllllIIIlllIlIIlIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIIlllIlIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIlllIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIll[4]), "DES");
            Cipher llllllllllllllllIIIlllIlIIllIIII = Cipher.getInstance("DES");
            llllllllllllllllIIIlllIlIIllIIII.init(llllIIIlIll[3], llllllllllllllllIIIlllIlIIllIIIl);
            return new String(llllllllllllllllIIIlllIlIIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIlllIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIlllIlIIlIllll) {
            llllllllllllllllIIIlllIlIIlIllll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        w llllllllllllllllIIIlllIlIllIIIlI;
        if (!w.lIllIIlllIlIIl(this.ak.h() ? 1 : 0) || w.lIllIIlllIlIIl(this.ak.v() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        if (w.lIllIIlllIlIlI(llllllllllllllllIIIlllIlIllIIIlI.ak.g() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        String[] stringArray = new String[llllIIIlIll[1]];
        stringArray[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[0]];
        TileObject llllllllllllllllIIIlllIlIllIIIIl = TileObjects.getNearest((String[])stringArray);
        if (w.lIllIIlllIlIll(llllllllllllllllIIIlllIlIllIIIIl)) {
            return llllIIIlIll[0];
        }
        Item llllllllllllllllIIIlllIlIllIIIII = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIIIlIll[1]];
            stringArray[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[8]];
            return item.hasAction(stringArray);
        });
        if (w.lIllIIlllIllII(Inventory.getFreeSlots(), llllIIIlIll[2]) && w.lIllIIlllIllIl(llllllllllllllllIIIlllIlIllIIIII)) {
            llllllllllllllllIIIlllIlIllIIIII.interact(llllIIIlIlI[llllIIIlIll[1]]);
            llllllllllllllllIIIlllIlIllIIIlI.sleep(llllIIIlIll[2]);
            return llllIIIlIll[1];
        }
        String[] stringArray2 = new String[llllIIIlIll[1]];
        stringArray2[w.llllIIIlIll[0]] = llllIIIlIlI[llllIIIlIll[3]];
        if (!w.lIllIIlllIlIlI(llllllllllllllllIIIlllIlIllIIIIl.hasAction(stringArray2) ? 1 : 0) || !w.lIllIIlllIlIIl(Reachable.isInteractable((Locatable)llllllllllllllllIIIlllIlIllIIIIl) ? 1 : 0) || w.lIllIIlllIlllI(llllllllllllllllIIIlllIlIllIIIIl.distanceTo(Players.getLocal().getWorldLocation()), llllIIIlIll[4])) {
            return llllIIIlIll[0];
        }
        if (w.lIllIIlllIllII(llllllllllllllllIIIlllIlIllIIIlI.ak.e(), llllIIIlIll[5])) {
            return llllIIIlIll[0];
        }
        NPC llllllllllllllllIIIlllIlIlIlllll = llllllllllllllllIIIlllIlIllIIIlI.ak.y();
        if (w.lIllIIlllIllIl(llllllllllllllllIIIlllIlIlIlllll) && w.lIllIIlllIlIlI(llllllllllllllllIIIlllIlIlIlllll.isDead() ? 1 : 0)) {
            return llllIIIlIll[0];
        }
        var1_1.interact(llllIIIlIlI[llllIIIlIll[2]]);
        return llllIIIlIll[1];
    }

    private static boolean lIllIIlllIlllI(int n2, int n3) {
        return n2 > n3;
    }
}

