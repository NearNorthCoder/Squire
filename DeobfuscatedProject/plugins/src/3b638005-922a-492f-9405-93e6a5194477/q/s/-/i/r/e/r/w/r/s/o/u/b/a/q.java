/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
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
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.a;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@TaskDesc(name="Digging next brother", priority=100, blocking=true)
public class q
extends Task {
    private final /* synthetic */ SquireBarrows X;
    private static /* synthetic */ int[] llllIlIIllI;
    private final /* synthetic */ a Y;
    private static /* synthetic */ String[] llllIlIIlIl;
    private final /* synthetic */ Client Z;

    private static String lIllIlIlIlIlIl(String llllllllllllllllIIIllIlIIIIllIIl, String llllllllllllllllIIIllIlIIIIllIII) {
        try {
            SecretKeySpec llllllllllllllllIIIllIlIIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIlIIIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIlIIIIllIll.init(llllIlIIllI[4], llllllllllllllllIIIllIlIIIIlllII);
            return new String(llllllllllllllllIIIllIlIIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIlIIIIllIlI) {
            llllllllllllllllIIIllIlIIIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIlIlllIl(Object object) {
        return object != null;
    }

    private static String lIllIlIlIlIllI(String llllllllllllllllIIIllIlIIIIIlIlI, String llllllllllllllllIIIllIlIIIIIlIll) {
        try {
            SecretKeySpec llllllllllllllllIIIllIlIIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIIIIIlIll.getBytes(StandardCharsets.UTF_8)), llllIlIIllI[7]), "DES");
            Cipher llllllllllllllllIIIllIlIIIIIlllI = Cipher.getInstance("DES");
            llllllllllllllllIIIllIlIIIIIlllI.init(llllIlIIllI[4], llllllllllllllllIIIllIlIIIIIllll);
            return new String(llllllllllllllllIIIllIlIIIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIlIIIIIllIl) {
            llllllllllllllllIIIllIlIIIIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIlIlII(String llllllllllllllllIIIllIIlllllIlll, String llllllllllllllllIIIllIIlllllIllI) {
        llllllllllllllllIIIllIIlllllIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIlllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIIllllllIlI = new StringBuilder();
        char[] llllllllllllllllIIIllIIllllllIIl = llllllllllllllllIIIllIIlllllIllI.toCharArray();
        int llllllllllllllllIIIllIIllllllIII = llllIlIIllI[0];
        char[] llllllllllllllllIIIllIIlllllIIlI = llllllllllllllllIIIllIIlllllIlll.toCharArray();
        int llllllllllllllllIIIllIIlllllIIIl = llllllllllllllllIIIllIIlllllIIlI.length;
        int llllllllllllllllIIIllIIlllllIIII = llllIlIIllI[0];
        while (q.lIllIlIlIllllI(llllllllllllllllIIIllIIlllllIIII, llllllllllllllllIIIllIIlllllIIIl)) {
            char llllllllllllllllIIIllIIlllllllIl = llllllllllllllllIIIllIIlllllIIlI[llllllllllllllllIIIllIIlllllIIII];
            llllllllllllllllIIIllIIllllllIlI.append((char)(llllllllllllllllIIIllIIlllllllIl ^ llllllllllllllllIIIllIIllllllIIl[llllllllllllllllIIIllIIllllllIII % llllllllllllllllIIIllIIllllllIIl.length]));
            "".length();
            ++llllllllllllllllIIIllIIllllllIII;
            ++llllllllllllllllIIIllIIlllllIIII;
            "".length();
            if (-"  ".length() <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIIllllllIlI);
    }

    public boolean run() {
        q llllllllllllllllIIIllIlIIIlIIllI;
        if (q.lIllIlIlIllIIl(this.X.u() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIIl(llllllllllllllllIIIllIlIIIlIIllI.X.h() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIIl(llllllllllllllllIIIllIlIIIlIIllI.Z.isInInstancedRegion() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllIlI(llllllllllllllllIIIllIlIIIlIIllI.X.m() ? 1 : 0)) {
            return llllIlIIllI[0];
        }
        d llllllllllllllllIIIllIlIIIlIIlIl = llllllllllllllllIIIllIlIIIlIIllI.X.n();
        if (q.lIllIlIlIllIlI(Movement.isRunEnabled() ? 1 : 0) && q.lIllIlIlIllIll(Movement.getRunEnergy(), llllIlIIllI[1])) {
            Movement.toggleRun();
        }
        WorldPoint llllllllllllllllIIIllIlIIIlIIlII = llllllllllllllllIIIllIlIIIlIIlIl.D();
        WorldPoint llllllllllllllllIIIllIlIIIlIIIll = Players.getLocal().getWorldLocation();
        if (q.lIllIlIlIllIlI(Gear.isEquipped((int[])llllllllllllllllIIIllIlIIIlIIllI.Y.c(llllllllllllllllIIIllIlIIIlIIlIl)) ? 1 : 0)) {
            Gear.swapTo((int[])llllllllllllllllIIIllIlIIIlIIllI.Y.c(llllllllllllllllIIIllIlIIIlIIlIl));
            "".length();
        }
        int[] nArray = new int[llllIlIIllI[2]];
        nArray[q.llllIlIIllI[0]] = llllIlIIllI[3];
        Item llllllllllllllllIIIllIlIIIlIIIlI = Inventory.getFirst((int[])nArray);
        if (q.lIllIlIlIlllII(llllllllllllllllIIIllIlIIIlIIIlI)) {
            int[] nArray2 = new int[llllIlIIllI[2]];
            nArray2[q.llllIlIIllI[0]] = llllIlIIllI[3];
            TileItem llllllllllllllllIIIllIlIIIlIIIIl = TileItems.getNearest((int[])nArray2);
            if (q.lIllIlIlIlllIl(llllllllllllllllIIIllIlIIIlIIIIl)) {
                llllllllllllllllIIIllIlIIIlIIIIl.interact(llllIlIIlIl[llllIlIIllI[0]]);
                llllllllllllllllIIIllIlIIIlIIllI.sleep(llllIlIIllI[4]);
                return llllIlIIllI[2];
            }
            Log.info((String)llllIlIIlIl[llllIlIIllI[2]]);
            return llllIlIIllI[0];
        }
        if (q.lIllIlIlIllllI(llllllllllllllllIIIllIlIIIlIIlII.distanceTo2D(llllllllllllllllIIIllIlIIIlIIIll), llllIlIIllI[4])) {
            int[] nArray3 = new int[llllIlIIllI[2]];
            nArray3[q.llllIlIIllI[0]] = llllIlIIllI[3];
            Inventory.interact((String)llllIlIIlIl[llllIlIIllI[4]], (int[])nArray3);
            "".length();
            llllllllllllllllIIIllIlIIIlIIllI.sleep(llllIlIIllI[5]);
            llllllllllllllllIIIllIlIIIlIIllI.X.j();
            llllllllllllllllIIIllIlIIIlIIllI.X.b(llllllllllllllllIIIllIlIIIlIIlIl);
            "".length();
            if ("  ".length() < " ".length()) {
                return ((201 + 109 - 134 + 62 ^ 10 + 155 - -18 + 8) & (0x72 ^ 6 ^ (0x23 ^ 6) ^ -" ".length())) != 0;
            }
        } else if (q.lIllIlIlIlllll(llllllllllllllllIIIllIlIIIlIIIll.getRegionID(), llllllllllllllllIIIllIlIIIlIIlII.getRegionID())) {
            Movement.setDestination((WorldPoint)llllllllllllllllIIIllIlIIIlIIlII);
        }
        return llllIlIIllI[2];
    }

    static {
        q.lIllIlIlIllIII();
        q.lIllIlIlIlIlll();
    }

    private static boolean lIllIlIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIlIlIllIII() {
        llllIlIIllI = new int[8];
        q.llllIlIIllI[0] = (147 + 72 - 21 + 42 ^ 120 + 89 - 191 + 146) & (0xA7 ^ 0xC3 ^ (4 ^ 0x34) ^ -" ".length());
        q.llllIlIIllI[1] = 0x7D ^ 0x69;
        q.llllIlIIllI[2] = " ".length();
        q.llllIlIIllI[3] = 0xFFFFD3FD & 0x2FBA;
        q.llllIlIIllI[4] = "  ".length();
        q.llllIlIIllI[5] = 113 + 84 - 181 + 183 ^ 156 + 140 - 294 + 193;
        q.llllIlIIllI[6] = "   ".length();
        q.llllIlIIllI[7] = 0x3B ^ 0x33;
    }

    private static boolean lIllIlIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllIlIlIlIlll() {
        llllIlIIlIl = new String[llllIlIIllI[6]];
        q.llllIlIIlIl[q.llllIlIIllI[0]] = q.lIllIlIlIlIlII("BTYuFg==", "QWEsk");
        q.llllIlIIlIl[q.llllIlIIllI[2]] = q.lIllIlIlIlIlIl("qKM6PsOQFLZaE7MrUqY7gE+ew8O7gyz8if8qfgW1ASNKPb5FDJxLThWlj3SREmCj", "IAEsq");
        q.llllIlIIlIl[q.llllIlIIllI[4]] = q.lIllIlIlIlIllI("II6p4QjMuDw=", "cBjOQ");
    }

    private static boolean lIllIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlIlIlllII(Object object) {
        return object == null;
    }

    @Inject
    public q(SquireBarrows squireBarrows, a a2, Client client) {
        this.X = squireBarrows;
        this.Y = a2;
        this.Z = client;
    }

    private static boolean lIllIlIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIlIllllI(int n2, int n3) {
        return n2 < n3;
    }
}

