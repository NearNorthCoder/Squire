/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.c;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

@TaskDesc(name="Placing cannon base", priority=20, blocking=true)
@Singleton
public class B
extends Task {
    private static final /* synthetic */ int az;
    private final /* synthetic */ c aD;
    private static final /* synthetic */ int aA;
    private /* synthetic */ int aE;
    private static final /* synthetic */ int aB;
    private static /* synthetic */ String[] lIllIIlIlIIll;
    private static /* synthetic */ int[] lIllIIlIlIlIl;
    private final /* synthetic */ l aC;

    public int Q() {
        return this.aE;
    }

    private static boolean llIIIllIIIlIlII(int n2) {
        return n2 != 0;
    }

    private boolean N() {
        return lIllIIlIlIlIl[0];
    }

    private static boolean llIIIllIIIlIlIl(Object object) {
        return object == null;
    }

    private static String llIIIllIIIIIlll(String llllllllllllllIllIIlIIllllIIIIIl, String llllllllllllllIllIIlIIllllIIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIllllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIllllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIllllIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIllllIIIIll.init(lIllIIlIlIlIl[9], llllllllllllllIllIIlIIllllIIIlII);
            return new String(llllllllllllllIllIIlIIllllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIllllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIIllllIIIIlI) {
            llllllllllllllIllIIlIIllllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llIIIllIIIIlIII(String llllllllllllllIllIIlIIlllIllIlII, String llllllllllllllIllIIlIIlllIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIlllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIlllIllIIIl.getBytes(StandardCharsets.UTF_8)), lIllIIlIlIlIl[11]), "DES");
            Cipher llllllllllllllIllIIlIIlllIllIllI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIIlllIllIllI.init(lIllIIlIlIlIl[9], llllllllllllllIllIIlIIlllIllIlll);
            return new String(llllllllllllllIllIIlIIlllIllIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIlllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIIlllIllIlIl) {
            llllllllllllllIllIIlIIlllIllIlIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public B(l l2, c c2) {
        this.aE = lIllIIlIlIlIl[0];
        this.aC = l2;
        this.aD = c2;
    }

    public boolean run() {
        B llllllllllllllIllIIlIIlllllIIlIl;
        if (B.llIIIllIIIlIIIl(this.aC.B() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int llllllllllllllIllIIlIIlllllIIlII = Static.getClient().getTickCount();
        if (B.llIIIllIIIlIIIl(llllllllllllllIllIIlIIlllllIIlIl.aC.A() ? 1 : 0) && B.llIIIllIIIlIIIl(llllllllllllllIllIIlIIlllllIIlIl.aC.D() ? 1 : 0) && B.llIIIllIIIlIIlI(llllllllllllllIllIIlIIlllllIIlII, llllllllllllllIllIIlIIlllllIIlIl.aE) && (!B.llIIIllIIIlIIll(llllllllllllllIllIIlIIlllllIIlIl.aC.z(), lIllIIlIlIlIl[1]) || B.llIIIllIIIlIIlI(llllllllllllllIllIIlIIlllllIIlII - llllllllllllllIllIIlIIlllllIIlIl.aE, lIllIIlIlIlIl[2])) && B.llIIIllIIIlIlII(llllllllllllllIllIIlIIlllllIIlIl.aC.G() ? 1 : 0)) {
            Item llllllllllllllIllIIlIIlllllIIIll;
            if (B.llIIIllIIIlIlII(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[lIllIIlIlIlIl[3]];
                nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[4];
                llllllllllllllIllIIlIIlllllIIIll = Inventory.getFirst((int[])nArray);
                if (B.llIIIllIIIlIlIl(llllllllllllllIllIIlIIlllllIIIll)) {
                    llllllllllllllIllIIlIIlllllIIIll = Inventory.getFirst(item -> item.hasAction(lIllIIlIlIIll[lIllIIlIlIlIl[7]]::equals));
                }
                if (B.llIIIllIIIlIlIl(llllllllllllllIllIIlIIlllllIIIll)) {
                    return lIllIIlIlIlIl[0];
                }
                llllllllllllllIllIIlIIlllllIIIll.interact(lIllIIlIlIIll[lIllIIlIlIlIl[0]]);
            }
            int[] nArray = new int[lIllIIlIlIlIl[3]];
            nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[5];
            llllllllllllllIllIIlIIlllllIIIll = TileObjects.getNearest((int[])nArray);
            llllllllllllllIllIIlIIlllllIIIll.interact(lIllIIlIlIIll[lIllIIlIlIlIl[3]]);
            return lIllIIlIlIlIl[3];
        }
        if (B.llIIIllIIIlIllI(llllllllllllllIllIIlIIlllllIIlII + lIllIIlIlIlIl[6] - lIllIIlIlIlIl[7], llllllllllllllIllIIlIIlllllIIlIl.aE)) {
            Movement.walkTo((WorldPoint)llllllllllllllIllIIlIIlllllIIlIl.aD.i());
            "".length();
        }
        if (B.llIIIllIIIlIlII(llllllllllllllIllIIlIIlllllIIlIl.aC.G() ? 1 : 0)) {
            return lIllIIlIlIlIl[0];
        }
        int[] nArray = new int[lIllIIlIlIlIl[3]];
        nArray[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
        if (B.llIIIllIIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llllllllllllllIllIIlIIlllllIIlIl.N();
        }
        Player llllllllllllllIllIIlIIlllllIIIll = Players.getLocal();
        WorldPoint llllllllllllllIllIIlIIlllllIIIlI = llllllllllllllIllIIlIIlllllIIlIl.aD.h();
        if (B.llIIIllIIIlIlII(llllllllllllllIllIIlIIlllllIIIll.getWorldLocation().equals((Object)llllllllllllllIllIIlIIlllllIIIlI) ? 1 : 0)) {
            int[] nArray2 = new int[lIllIIlIlIlIl[3]];
            nArray2[B.lIllIIlIlIlIl[0]] = lIllIIlIlIlIl[8];
            Item llllllllllllllIllIIlIIlllllIIIIl = Inventory.getFirst((int[])nArray2);
            llllllllllllllIllIIlIIlllllIIIIl.interact(lIllIIlIlIIll[lIllIIlIlIlIl[9]]);
            llllllllllllllIllIIlIIlllllIIlIl.aE = llllllllllllllIllIIlIIlllllIIlII + lIllIIlIlIlIl[6];
            return lIllIIlIlIlIl[3];
        }
        if (B.llIIIllIIIlIIIl(llllllllllllllIllIIlIIlllllIIIll.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllIllIIlIIlllllIIIlI);
            "".length();
        }
        return lIllIIlIlIlIl[3];
    }

    private static boolean llIIIllIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIllIIIIIllI(String llllllllllllllIllIIlIIllllIlIIIl, String llllllllllllllIllIIlIIllllIlIIII) {
        llllllllllllllIllIIlIIllllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIllllIlIlII = new StringBuilder();
        char[] llllllllllllllIllIIlIIllllIlIIll = llllllllllllllIllIIlIIllllIlIIII.toCharArray();
        int llllllllllllllIllIIlIIllllIlIIlI = lIllIIlIlIlIl[0];
        char[] llllllllllllllIllIIlIIllllIIllII = llllllllllllllIllIIlIIllllIlIIIl.toCharArray();
        int llllllllllllllIllIIlIIllllIIlIll = llllllllllllllIllIIlIIllllIIllII.length;
        int llllllllllllllIllIIlIIllllIIlIlI = lIllIIlIlIlIl[0];
        while (B.llIIIllIIIlIllI(llllllllllllllIllIIlIIllllIIlIlI, llllllllllllllIllIIlIIllllIIlIll)) {
            char llllllllllllllIllIIlIIllllIlIlll = llllllllllllllIllIIlIIllllIIllII[llllllllllllllIllIIlIIllllIIlIlI];
            llllllllllllllIllIIlIIllllIlIlII.append((char)(llllllllllllllIllIIlIIllllIlIlll ^ llllllllllllllIllIIlIIllllIlIIll[llllllllllllllIllIIlIIllllIlIIlI % llllllllllllllIllIIlIIllllIlIIll.length]));
            "".length();
            ++llllllllllllllIllIIlIIllllIlIIlI;
            ++llllllllllllllIllIIlIIllllIIlIlI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIIllllIlIlII);
    }

    static {
        B.llIIIllIIIlIIII();
        B.llIIIllIIIIllII();
        aB = lIllIIlIlIlIl[2];
        az = lIllIIlIlIlIl[6];
        aA = lIllIIlIlIlIl[1];
    }

    private static boolean llIIIllIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIllIIIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIIllIIIlIIII() {
        lIllIIlIlIlIl = new int[12];
        B.lIllIIlIlIlIl[0] = (0x62 ^ 0x39) & ~(0x50 ^ 0xB);
        B.lIllIIlIlIlIl[1] = 0x23 ^ 0x16 ^ (0xEF ^ 0xC3);
        B.lIllIIlIlIlIl[2] = 37 + 4 - -14 + 145;
        B.lIllIIlIlIlIl[3] = " ".length();
        B.lIllIIlIlIlIl[4] = -(0xFFFF87F5 & 0x7D1F) & (0xFFFFFFFF & 0x1FF7);
        B.lIllIIlIlIlIl[5] = 0x2D ^ 0x2A;
        B.lIllIIlIlIlIl[6] = 0xFFFF9FD4 & 0x67FB;
        B.lIllIIlIlIlIl[7] = "   ".length();
        B.lIllIIlIlIlIl[8] = 0x1F ^ 0x72 ^ (0x4C ^ 0x27);
        B.lIllIIlIlIlIl[9] = "  ".length();
        B.lIllIIlIlIlIl[10] = 0x44 ^ 4 ^ (0x6D ^ 0x29);
        B.lIllIIlIlIlIl[11] = 0x77 ^ 0x7F;
    }

    private static boolean llIIIllIIIlIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIIllIIIIllII() {
        lIllIIlIlIIll = new String[lIllIIlIlIlIl[10]];
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[0]] = B.llIIIllIIIIIllI("EhYG", "Wwrgl");
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[3]] = B.llIIIllIIIIIllI("PjAIEkQbKQ==", "nYkyi");
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[9]] = B.llIIIllIIIIIlll("S+zdkdwby9I=", "WoXzu");
        B.lIllIIlIlIIll[B.lIllIIlIlIlIl[7]] = B.llIIIllIIIIlIII("5WxkzNIwuB4=", "xVlow");
    }
}

