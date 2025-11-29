/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.combat.Lure.LureConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.M;
import i.i.b.s.c.q.r.s.s.-.u.a.e.N;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Running")
public class Q
extends Task {
    private final /* synthetic */ M cc;
    private static /* synthetic */ int[] llIlIIIll;
    private final /* synthetic */ LureConfig cd;
    private static /* synthetic */ String[] llIIlIlll;

    private static void lIllIIlIlII() {
        llIIlIlll = new String[llIlIIIll[3]];
        Q.llIIlIlll[Q.llIlIIIll[0]] = Q."Wield";
        Q.llIIlIlll[Q.llIlIIIll[1]] = Q."Wield";
    }

    private static boolean lIllIlllIIl(Object object) {
        return object == null;
    }

    private static String lIllIIlIIll(String lIllIIIllIIIlII, String lIllIIIllIIIIll) {
        lIllIIIllIIIlII = new String(Base64.getDecoder().decode(lIllIIIllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIIIllIIIIlI = new StringBuilder();
        char[] lIllIIIllIIIIIl = lIllIIIllIIIIll.toCharArray();
        int lIllIIIllIIIIII = llIlIIIll[0];
        char[] lIllIIIlIlllIlI = lIllIIIllIIIlII.toCharArray();
        int lIllIIIlIlllIIl = lIllIIIlIlllIlI.length;
        int lIllIIIlIlllIII = llIlIIIll[0];
        while (Q.lIllIlllIll(lIllIIIlIlllIII, lIllIIIlIlllIIl)) {
            char lIllIIIllIIIlIl = lIllIIIlIlllIlI[lIllIIIlIlllIII];
            lIllIIIllIIIIlI.append((char)(lIllIIIllIIIlIl ^ lIllIIIllIIIIIl[lIllIIIllIIIIII % lIllIIIllIIIIIl.length]));
            0;
            ++lIllIIIllIIIIII;
            ++lIllIIIlIlllIII;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(lIllIIIllIIIIlI);
    }

    private static void lIllIllIllI() {
        llIlIIIll = new int[4];
        Q.llIlIIIll[0] = (0x13 ^ 0x78 ^ (0x38 ^ 0x42)) & (66 + 179 - 241 + 181 ^ 156 + 58 - 147 + 101 ^ -1);
        Q.llIlIIIll[1] = 1;
        Q.llIlIIIll[2] = 0x80 ^ 0x8F;
        Q.llIlIIIll[3] = 2;
    }

    static {
        Q.lIllIllIllI();
        Q.lIllIIlIlII();
    }

    private boolean aN() {
        if (Q.lIllIlllIlI(Movement.getRunEnergy(), llIlIIIll[2])) {
            return llIlIIIll[0];
        }
        if (Q.lIllIllIlll(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        return llIlIIIll[0];
    }

    @Inject
    public Q(M m2, LureConfig lureConfig) {
        this.cc = m2;
        this.cd = lureConfig;
    }

    public boolean run() {
        Q lIllIIIllIlIIlI;
        if (Q.lIllIllIlll(this.cc.aI() ? 1 : 0)) {
            return llIlIIIll[0];
        }
        if (Q.lIllIlllIII(lIllIIIllIlIIlI.aN() ? 1 : 0)) {
            return llIlIIIll[1];
        }
        Player lIllIIIllIlIIIl = Players.getLocal();
        if (Q.lIllIlllIIl(lIllIIIllIlIIIl)) {
            return llIlIIIll[0];
        }
        N lIllIIIllIlIIII = lIllIIIllIlIIlI.cc.aG();
        if (Q.lIllIlllIIl(lIllIIIllIlIIlI.cc.a(llIlIIIll[0], null))) {
            if (Q.lIllIllIlll(lIllIIIllIlIIII.aJ().equals((Object)lIllIIIllIlIIIl.getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)lIllIIIllIlIIII.aJ());
                0;
            }
            int[] nArray = new int[llIlIIIll[1]];
            nArray[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.primaryWeaponID();
            if (Q.lIllIllIlll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIIIll[1]];
                nArray2[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.primaryWeaponID();
                if (Q.lIllIlllIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIlIIIll[1]];
                    nArray3[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.primaryWeaponID();
                    Inventory.getFirst((int[])nArray3).interact(llIIlIlll[llIlIIIll[0]]);
                }
            }
            if (Q.lIllIlllIII(lIllIIIllIlIIlI.cd.usingSecondary() ? 1 : 0)) {
                int[] nArray4 = new int[llIlIIIll[1]];
                nArray4[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.secondaryWeaponID();
                if (Q.lIllIllIlll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[llIlIIIll[1]];
                    nArray5[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.secondaryWeaponID();
                    if (Q.lIllIlllIII(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                        int[] nArray6 = new int[llIlIIIll[1]];
                        nArray6[Q.llIlIIIll[0]] = lIllIIIllIlIIlI.cd.secondaryWeaponID();
                        Inventory.getFirst((int[])nArray6).interact(llIIlIlll[llIlIIIll[1]]);
                    }
                }
            }
            return llIlIIIll[0];
        }
        WorldPoint lIllIIIllIIllll = Movement.getDestination();
        if (Q.lIllIlllIIl(lIllIIIllIIllll)) {
            WorldPoint worldPoint;
            if (Q.lIllIlllIII(lIllIIIllIlIIIl.getWorldLocation().equals((Object)lIllIIIllIlIIII.aJ()) ? 1 : 0)) {
                worldPoint = lIllIIIllIlIIII.aK();
                0;
                if (1 <= 0) {
                    return ((0x18 ^ 0x7C ^ (0xD8 ^ 0xA2)) & (0x27 ^ 0xA ^ (0x8F ^ 0xBC) ^ -1)) != 0;
                }
            } else {
                worldPoint = lIllIIIllIlIIII.aJ();
            }
            Movement.walkTo((WorldPoint)worldPoint);
            0;
            return llIlIIIll[1];
        }
        if (Q.lIllIlllIII(lIllIIIllIlIIII.aJ().equals((Object)lIllIIIllIIllll) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lIllIIIllIlIIII.aK());
            0;
            0;
            if (null != null) {
                return ((0x3C ^ 0x57 ^ (0xC6 ^ 0x83)) & (0x1D ^ 0x3D ^ (0x2A ^ 0x24) ^ -1)) != 0;
            }
        } else {
            Movement.walkTo((WorldPoint)lIllIIIllIlIIII.aJ());
            0;
        }
        return llIlIIIll[1];
    }

    private static boolean lIllIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIlll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIlIIlI(String lIllIIIlIlIllIl, String lIllIIIlIlIllII) {
        try {
            SecretKeySpec lIllIIIlIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIIlIllIIIl = Cipher.getInstance("Blowfish");
            lIllIIIlIllIIIl.init(llIlIIIll[3], lIllIIIlIllIIlI);
            return new String(lIllIIIlIllIIIl.doFinal(Base64.getDecoder().decode(lIllIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIIlIllIIII) {
            lIllIIIlIllIIII.printStackTrace();
            return null;
        }
    }
}

