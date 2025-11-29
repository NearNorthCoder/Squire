/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.o;

@TaskDesc(name="Withdrawing items")
public class q
extends o {
    private /* synthetic */ int W;
    private static /* synthetic */ String[] lIIlIlIIllIIl;
    private /* synthetic */ CompletableFuture<Boolean> X;
    private /* synthetic */ BankLocation V;
    private final /* synthetic */ g U;
    private static /* synthetic */ int[] lIIlIlIlIIIII;
    private static final /* synthetic */ int T;

    private static boolean lIlIlIllllIIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        q llllllllllllllIllllIllllIIllIIlI;
        if (q.lIlIlIllllIIIll(this.S() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIlII(llllllllllllllIllllIllllIIllIIlI.U.s() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(llllllllllllllIllllIllllIIllIIlI.O.a() ? 1 : 0)) {
            if (q.lIlIlIllllIIlII(llllllllllllllIllllIllllIIllIIlI.T() ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlIlIIIII[1]];
                stringArray[q.lIIlIlIlIIIII[0]] = lIIlIlIIllIIl[lIIlIlIlIIIII[0]];
                stringArray[q.lIIlIlIlIIIII[2]] = lIIlIlIIllIIl[lIIlIlIlIIIII[2]];
                TileObject llllllllllllllIllllIllllIIllIIIl = TileObjects.getNearest((String[])stringArray);
                if (q.lIlIlIllllIIlIl(llllllllllllllIllllIllllIIllIIIl) && q.lIlIlIllllIIlII(Reachable.isInteractable((Locatable)llllllllllllllIllllIllllIIllIIIl) ? 1 : 0)) {
                    llllllllllllllIllllIllllIIllIIlI.O.a(lIIlIlIlIIIII[2]);
                }
            }
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(llllllllllllllIllllIllllIIllIIlI.T() ? 1 : 0)) {
            llllllllllllllIllllIllllIIllIIlI.O.a(lIIlIlIlIIIII[0]);
            return lIIlIlIlIIIII[0];
        }
        BankLoadout llllllllllllllIllllIllllIIllIIIl = (BankLoadout)llllllllllllllIllllIllllIIllIIlI.N.bankLoadout().selected(BankLoadout.class);
        if (q.lIlIlIllllIIllI(llllllllllllllIllllIllllIIllIIIl)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIlIlIlIIIII[0];
        }
        if (q.lIlIlIllllIIIll(Bank.open() ? 1 : 0)) {
            if (q.lIlIlIllllIIllI(llllllllllllllIllllIllllIIllIIlI.V)) {
                llllllllllllllIllllIllllIIllIIlI.V = BankLocation.getNearestCommon();
            }
            Movement.walkTo((BankLocation)llllllllllllllIllllIllllIIllIIlI.V);
            "".length();
            return lIIlIlIlIIIII[2];
        }
        if (q.lIlIlIllllIIIll(Bank.isOpen() ? 1 : 0)) {
            Bank.open();
            "".length();
            return lIIlIlIlIIIII[2];
        }
        if (q.lIlIlIllllIIIll(BankLoadouts.withdrawWithRetries((BankLoadout)llllllllllllllIllllIllllIIllIIIl, (int)lIIlIlIlIIIII[3]).booleanValue() ? 1 : 0)) {
            Log.info((String)lIIlIlIIllIIl[lIIlIlIlIIIII[1]]);
            return lIIlIlIlIIIII[0];
        }
        return lIIlIlIlIIIII[2];
    }

    static {
        q.lIlIlIllllIIIlI();
        q.lIlIlIllllIIIIl();
        T = lIIlIlIlIIIII[4];
    }

    private static boolean lIlIlIllllIIlIl(Object object) {
        return object != null;
    }

    private static void lIlIlIllllIIIlI() {
        lIIlIlIlIIIII = new int[6];
        q.lIIlIlIlIIIII[0] = (0x49 ^ 0x17 ^ (0xC5 ^ 0x9E)) & (0x53 ^ 0x5E ^ (0x9E ^ 0x96) ^ -" ".length());
        q.lIIlIlIlIIIII[1] = "  ".length();
        q.lIIlIlIlIIIII[2] = " ".length();
        q.lIIlIlIlIIIII[3] = 45 + 87 - 12 + 34 ^ 142 + 20 - 146 + 133;
        q.lIIlIlIlIIIII[4] = -(0xFFFFDAEF & 0x3555) & (0xFFFFF777 & Short.MAX_VALUE);
        q.lIIlIlIlIIIII[5] = "   ".length();
    }

    private static void lIlIlIllllIIIIl() {
        lIIlIlIIllIIl = new String[lIIlIlIlIIIII[5]];
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[0]] = q.lIlIlIlllIIIlIl("EhQIJXQyGgk6PA==", "PufNT");
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[2]] = q.lIlIlIlllIIIlIl("JzgrBlAGMSAeBA==", "eYEmp");
        q.lIIlIlIIllIIl[q.lIIlIlIlIIIII[1]] = q.lIlIlIlllIIIllI("Xx7VkvqyTuT2TDSnLhvR9qV7JdasSZaHcC+WrVs/OOH+sJi5B4wDurNSc8lSiYU2Nkigh2u6D03qRFBDp+yKdRPyJRwchcbI", "NRrSn");
    }

    private static boolean lIlIlIllllIIllI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllllIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIlllIIIlIl(String llllllllllllllIllllIllllIIlIIIIl, String llllllllllllllIllllIllllIIlIIIII) {
        llllllllllllllIllllIllllIIlIIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllllIllllIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllllIIlIIlII = new StringBuilder();
        char[] llllllllllllllIllllIllllIIlIIIll = llllllllllllllIllllIllllIIlIIIII.toCharArray();
        int llllllllllllllIllllIllllIIlIIIlI = lIIlIlIlIIIII[0];
        char[] llllllllllllllIllllIllllIIIlllII = llllllllllllllIllllIllllIIlIIIIl.toCharArray();
        int llllllllllllllIllllIllllIIIllIll = llllllllllllllIllllIllllIIIlllII.length;
        int llllllllllllllIllllIllllIIIllIlI = lIIlIlIlIIIII[0];
        while (q.lIlIlIllllIIlll(llllllllllllllIllllIllllIIIllIlI, llllllllllllllIllllIllllIIIllIll)) {
            char llllllllllllllIllllIllllIIlIIlll = llllllllllllllIllllIllllIIIlllII[llllllllllllllIllllIllllIIIllIlI];
            llllllllllllllIllllIllllIIlIIlII.append((char)(llllllllllllllIllllIllllIIlIIlll ^ llllllllllllllIllllIllllIIlIIIll[llllllllllllllIllllIllllIIlIIIlI % llllllllllllllIllllIllllIIlIIIll.length]));
            "".length();
            ++llllllllllllllIllllIllllIIlIIIlI;
            ++llllllllllllllIllllIllllIIIllIlI;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIllllIIlIIlII);
    }

    @Inject
    public q(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, Client client, g g2) {
        super(squireSaraConfig, squireSaradomin, client);
        this.U = g2;
    }

    private static String lIlIlIlllIIIllI(String llllllllllllllIllllIllllIIIIllll, String llllllllllllllIllllIllllIIIlIIII) {
        try {
            SecretKeySpec llllllllllllllIllllIllllIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllllIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIllllIIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIllllIIIlIIll.init(lIIlIlIlIIIII[1], llllllllllllllIllllIllllIIIlIlII);
            return new String(llllllllllllllIllllIllllIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllllIIIlIIlI) {
            llllllllllllllIllllIllllIIIlIIlI.printStackTrace();
            return null;
        }
    }
}

