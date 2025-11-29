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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

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
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import q.s.r.i.e.s.o.u.a.d.n.-.b.d;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@Singleton
@TaskDesc(name="Placing cannon base", priority=20, blocking=true)
public class w
extends Task {
    private static final /* synthetic */ int ar;
    private static /* synthetic */ String[] llIllllIIII;
    private /* synthetic */ int aw;
    private final /* synthetic */ d av;
    private static final /* synthetic */ int as;
    private static final /* synthetic */ int at;
    private static /* synthetic */ int[] llIllllIIlI;
    private final /* synthetic */ e au;

    private static void lIlIlIllllIlIl() {
        llIllllIIII = new String[llIllllIIlI[10]];
        w.llIllllIIII[w.llIllllIIlI[0]] = w."Eat";
        w.llIllllIIII[w.llIllllIIlI[3]] = w."Pick-up";
        w.llIllllIIII[w.llIllllIIlI[9]] = w."Set-up";
        w.llIllllIIII[w.llIllllIIlI[7]] = w."Eat";
    }

    @Inject
    public w(e e2, d d2) {
        this.aw = llIllllIIlI[0];
        this.au = e2;
        this.av = d2;
    }

    private static boolean lIlIllIIIIIIII(int n2) {
        return n2 != 0;
    }

    private boolean M() {
        return llIllllIIlI[0];
    }

    public int Q() {
        return this.aw;
    }

    static {
        w.lIlIlIllllllII();
        w.lIlIlIllllIlIl();
        ar = llIllllIIlI[6];
        as = llIllllIIlI[1];
        at = llIllllIIlI[2];
    }

    public boolean run() {
        w llllllllllllllllIIlIlIIlllIIIlll;
        if (w.lIlIlIllllllIl(this.au.t() ? 1 : 0)) {
            return llIllllIIlI[0];
        }
        int llllllllllllllllIIlIlIIlllIIIllI = Static.getClient().getTickCount();
        if (w.lIlIlIllllllIl(llllllllllllllllIIlIlIIlllIIIlll.au.s() ? 1 : 0) && w.lIlIlIllllllIl(llllllllllllllllIIlIlIIlllIIIlll.au.v() ? 1 : 0) && w.lIlIlIlllllllI(llllllllllllllllIIlIlIIlllIIIllI, llllllllllllllllIIlIlIIlllIIIlll.aw) && (!w.lIlIlIllllllll(llllllllllllllllIIlIlIIlllIIIlll.au.r(), llIllllIIlI[1]) || w.lIlIlIlllllllI(llllllllllllllllIIlIlIIlllIIIllI - llllllllllllllllIIlIlIIlllIIIlll.aw, llIllllIIlI[2])) && w.lIlIllIIIIIIII(llllllllllllllllIIlIlIIlllIIIlll.au.y() ? 1 : 0)) {
            Item llllllllllllllllIIlIlIIlllIIIlIl;
            if (w.lIlIllIIIIIIII(Inventory.isFull() ? 1 : 0)) {
                int[] nArray = new int[llIllllIIlI[3]];
                nArray[w.llIllllIIlI[0]] = llIllllIIlI[4];
                llllllllllllllllIIlIlIIlllIIIlIl = Inventory.getFirst((int[])nArray);
                if (w.lIlIllIIIIIIIl(llllllllllllllllIIlIlIIlllIIIlIl)) {
                    llllllllllllllllIIlIlIIlllIIIlIl = Inventory.getFirst(item -> item.hasAction(llIllllIIII[llIllllIIlI[7]]::equals));
                }
                if (w.lIlIllIIIIIIIl(llllllllllllllllIIlIlIIlllIIIlIl)) {
                    return llIllllIIlI[0];
                }
                llllllllllllllllIIlIlIIlllIIIlIl.interact(llIllllIIII[llIllllIIlI[0]]);
            }
            int[] nArray = new int[llIllllIIlI[3]];
            nArray[w.llIllllIIlI[0]] = llIllllIIlI[5];
            llllllllllllllllIIlIlIIlllIIIlIl = TileObjects.getNearest((int[])nArray);
            llllllllllllllllIIlIlIIlllIIIlIl.interact(llIllllIIII[llIllllIIlI[3]]);
            return llIllllIIlI[3];
        }
        if (w.lIlIllIIIIIIlI(llllllllllllllllIIlIlIIlllIIIllI + llIllllIIlI[6] - llIllllIIlI[7], llllllllllllllllIIlIlIIlllIIIlll.aw)) {
            Movement.walkTo((WorldPoint)llllllllllllllllIIlIlIIlllIIIlll.av.p());
            0;
        }
        if (w.lIlIllIIIIIIII(llllllllllllllllIIlIlIIlllIIIlll.au.y() ? 1 : 0)) {
            return llIllllIIlI[0];
        }
        int[] nArray = new int[llIllllIIlI[3]];
        nArray[w.llIllllIIlI[0]] = llIllllIIlI[8];
        if (w.lIlIlIllllllIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return llllllllllllllllIIlIlIIlllIIIlll.M();
        }
        Player llllllllllllllllIIlIlIIlllIIIlIl = Players.getLocal();
        WorldPoint llllllllllllllllIIlIlIIlllIIIlII = llllllllllllllllIIlIlIIlllIIIlll.av.o();
        if (w.lIlIllIIIIIIII(llllllllllllllllIIlIlIIlllIIIlIl.getWorldLocation().equals((Object)llllllllllllllllIIlIlIIlllIIIlII) ? 1 : 0)) {
            int[] nArray2 = new int[llIllllIIlI[3]];
            nArray2[w.llIllllIIlI[0]] = llIllllIIlI[8];
            Item llllllllllllllllIIlIlIIlllIIIIll = Inventory.getFirst((int[])nArray2);
            llllllllllllllllIIlIlIIlllIIIIll.interact(llIllllIIII[llIllllIIlI[9]]);
            llllllllllllllllIIlIlIIlllIIIlll.aw = llllllllllllllllIIlIlIIlllIIIllI + llIllllIIlI[6];
            return llIllllIIlI[3];
        }
        if (w.lIlIlIllllllIl(llllllllllllllllIIlIlIIlllIIIlIl.isMoving() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllllIIlIlIIlllIIIlII);
            0;
        }
        return llIllllIIlI[3];
    }

    private static boolean lIlIllIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIllllllII() {
        llIllllIIlI = new int[12];
        w.llIllllIIlI[0] = (0x22 ^ 0x6C ^ (3 ^ 0xF)) & (169 + 207 - 159 + 13 ^ 146 + 56 - 186 + 148 ^ -1);
        w.llIllllIIlI[1] = 0x99 ^ 0xC6 ^ (0xD1 ^ 0x97);
        w.llIllllIIlI[2] = 86 + 102 - 25 + 12 + (108 + 24 - 120 + 145) - (0xFFFFADDF & 0x5363) + (182 + 75 - 137 + 71);
        w.llIllllIIlI[3] = 1;
        w.llIllllIIlI[4] = 0xFFFFBEFB & 0x5BE7;
        w.llIllllIIlI[5] = 0x35 ^ 0x6A ^ (0xFD ^ 0xA5);
        w.llIllllIIlI[6] = -(0xFFFFD4B3 & 0x7B6F) & (0xFFFFDFF7 & 0x77FA);
        w.llIllllIIlI[7] = 3;
        w.llIllllIIlI[8] = 0x9B ^ 0x9D;
        w.llIllllIIlI[9] = 2;
        w.llIllllIIlI[10] = 82 + 5 - -29 + 12 ^ 104 + 35 - 73 + 66;
        w.llIllllIIlI[11] = 0xD1 ^ 0xA5 ^ (0x53 ^ 0x2F);
    }

    private static String lIlIlIllllIIll(String llllllllllllllllIIlIlIIllIIllllI, String llllllllllllllllIIlIlIIllIIllIII) {
        llllllllllllllllIIlIlIIllIIllllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIlIIllIIlllII = new StringBuilder();
        char[] llllllllllllllllIIlIlIIllIIllIll = llllllllllllllllIIlIlIIllIIllIII.toCharArray();
        int llllllllllllllllIIlIlIIllIIllIlI = llIllllIIlI[0];
        char[] llllllllllllllllIIlIlIIllIIlIlII = llllllllllllllllIIlIlIIllIIllllI.toCharArray();
        int llllllllllllllllIIlIlIIllIIlIIll = llllllllllllllllIIlIlIIllIIlIlII.length;
        int llllllllllllllllIIlIlIIllIIlIIlI = llIllllIIlI[0];
        while (w.lIlIllIIIIIIlI(llllllllllllllllIIlIlIIllIIlIIlI, llllllllllllllllIIlIlIIllIIlIIll)) {
            char llllllllllllllllIIlIlIIllIIlllll = llllllllllllllllIIlIlIIllIIlIlII[llllllllllllllllIIlIlIIllIIlIIlI];
            llllllllllllllllIIlIlIIllIIlllII.append((char)(llllllllllllllllIIlIlIIllIIlllll ^ llllllllllllllllIIlIlIIllIIllIll[llllllllllllllllIIlIlIIllIIllIlI % llllllllllllllllIIlIlIIllIIllIll.length]));
            0;
            ++llllllllllllllllIIlIlIIllIIllIlI;
            ++llllllllllllllllIIlIlIIllIIlIIlI;
            0;
            if (3 >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIlIIllIIlllII);
    }

    private static boolean lIlIlIlllllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIIIIIIl(Object object) {
        return object == null;
    }

    private static String lIlIlIllllIlII(String llllllllllllllllIIlIlIIllIlIllII, String llllllllllllllllIIlIlIIllIlIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIllIllIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIllIllIIII.init(llIllllIIlI[9], llllllllllllllllIIlIlIIllIllIIIl);
            return new String(llllllllllllllllIIlIlIIllIllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIllIlIllll) {
            llllllllllllllllIIlIlIIllIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllllllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIllllllIl(int n2) {
        return n2 == 0;
    }

    private static String lIlIlIllllIIlI(String llllllllllllllllIIlIlIIllIlllIIl, String llllllllllllllllIIlIlIIllIlllIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIllIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), llIllllIIlI[11]), "DES");
            Cipher llllllllllllllllIIlIlIIllIllllIl = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIllIllllIl.init(llIllllIIlI[9], llllllllllllllllIIlIlIIllIlllllI);
            return new String(llllllllllllllllIIlIlIIllIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIllIllllII) {
            llllllllllllllllIIlIlIIllIllllII.printStackTrace();
            return null;
        }
    }
}

