/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/* TASK: Banking -> BankingTask */
@TaskDesc(name="Banking", priority=10, blocking=true)
public class bU
extends Task {
    private static /* synthetic */ int[] llIlIII;
    private static /* synthetic */ String[] llIIlll;
    private /* synthetic */ BankLocation ha;

    private static boolean llIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static void llIlIIlll() {
        llIlIII = new int[6];
        bU.llIlIII[0] = (0xF ^ 0x3E) & ~(0x8B ^ 0xBA);
        bU.llIlIII[1] = 1;
        bU.llIlIII[2] = 2;
        bU.llIlIII[3] = 3;
        bU.llIlIII[4] = 0xE2 ^ 0xAE ^ (0xF4 ^ 0xBC);
        bU.llIlIII[5] = 159 + 34 - 77 + 58 ^ 23 + 102 - 122 + 163;
    }

    private static void llIlIIllI() {
        llIIlll = new String[llIlIII[4]];
        bU.llIIlll[bU.llIlIII[0]] = bU."Chest";
        bU.llIIlll[bU.llIlIII[1]] = bU."Bank";
        bU.llIIlll[bU.llIlIII[2]] = bU."Bank";
        bU.llIIlll[bU.llIlIII[3]] = bU."Coins";
    }

    private static boolean llIlIlIll(Object object) {
        return object != null;
    }

    private static boolean llIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIII(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        if (bU.llIlIlIII(Inventory.isFull() ? 1 : 0)) {
            if (bU.llIlIlIIl(this.ha)) {
                this.ha = BankLocation.getNearest();
            }
            return llIlIII[0];
        }
        if (bU.llIlIlIlI(Bank.isOpen() ? 1 : 0)) {
            Bank.depositAllExcept(item -> item.getName().equals(llIIlll[llIlIII[3]]));
            return llIlIII[1];
        }
        String[] stringArray = new String[llIlIII[1]];
        stringArray[bU.llIlIII[0]] = llIIlll[llIlIII[0]];
        TileObject lllIlIIlIIlllII = TileObjects.getNearest((String[])stringArray);
        if (bU.llIlIlIll(lllIlIIlIIlllII)) {
            String[] stringArray2 = new String[llIlIII[1]];
            stringArray2[bU.llIlIII[0]] = llIIlll[llIlIII[1]];
            if (bU.llIlIlIlI(lllIlIIlIIlllII.hasAction(stringArray2) ? 1 : 0)) {
                lllIlIIlIIlllII.interact(llIIlll[llIlIII[2]]);
                return llIlIII[1];
            }
        }
        if (bU.llIlIlIlI(Bank.open() ? 1 : 0)) {
            return llIlIII[1];
        }
        Movement.walkTo((WorldArea)this.ha.getArea());
        0;
        return llIlIII[1];
    }

    private static String llIlIIlIl(String lllIlIIIlllllII, String lllIlIIIllllIll) {
        try {
            SecretKeySpec lllIlIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIllllIll.getBytes(StandardCharsets.UTF_8)), llIlIII[5]), "DES");
            Cipher lllIlIIIllllllI = Cipher.getInstance("DES");
            lllIlIIIllllllI.init(llIlIII[2], lllIlIIIlllllll);
            return new String(lllIlIIIllllllI.doFinal(Base64.getDecoder().decode(lllIlIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIlllllIl) {
            lllIlIIIlllllIl.printStackTrace();
            return null;
        }
    }

    static {
        bU.llIlIIlll();
        bU.llIlIIllI();
    }

    private static String llIlIIlII(String lllIlIIlIIIllII, String lllIlIIlIIlIIII) {
        lllIlIIlIIIllII = new String(Base64.getDecoder().decode(lllIlIIlIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIlIIIllll = new StringBuilder();
        char[] lllIlIIlIIIlllI = lllIlIIlIIlIIII.toCharArray();
        int lllIlIIlIIIllIl = llIlIII[0];
        char[] lllIlIIlIIIIlll = lllIlIIlIIIllII.toCharArray();
        int lllIlIIlIIIIllI = lllIlIIlIIIIlll.length;
        int lllIlIIlIIIIlIl = llIlIII[0];
        while (bU.llIlIllII(lllIlIIlIIIIlIl, lllIlIIlIIIIllI)) {
            char lllIlIIlIIlIIlI = lllIlIIlIIIIlll[lllIlIIlIIIIlIl];
            lllIlIIlIIIllll.append((char)(lllIlIIlIIlIIlI ^ lllIlIIlIIIlllI[lllIlIIlIIIllIl % lllIlIIlIIIlllI.length]));
            0;
            ++lllIlIIlIIIllIl;
            ++lllIlIIlIIIIlIl;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(lllIlIIlIIIllll);
    }

    private static String llIlIIIll(String lllIlIIIllIllIl, String lllIlIIIllIllII) {
        try {
            SecretKeySpec lllIlIIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIIlllIIIl = Cipher.getInstance("Blowfish");
            lllIlIIIlllIIIl.init(llIlIII[2], lllIlIIIlllIIlI);
            return new String(lllIlIIIlllIIIl.doFinal(Base64.getDecoder().decode(lllIlIIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIlIIIlllIIII) {
            lllIlIIIlllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIlIIl(Object object) {
        return object == null;
    }
}

