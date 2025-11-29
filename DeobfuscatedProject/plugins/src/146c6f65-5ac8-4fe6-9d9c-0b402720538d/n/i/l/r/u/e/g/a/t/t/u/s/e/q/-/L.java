/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.b;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.h;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Harvesting resources", priority=2, blocking=true)
public class L
extends n {
    private static /* synthetic */ int[] llIIlllllIIl;
    private static /* synthetic */ String[] llIIllllIIlI;
    private final /* synthetic */ String[] bW;
    private final /* synthetic */ b bV;

    static {
        L.lIIIIIIIIlIIIII();
        L.lIIIIIIIIIlllll();
    }

    private static void lIIIIIIIIlIIIII() {
        llIIlllllIIl = new int[9];
        L.llIIlllllIIl[0] = 0x80 ^ 0xA5 ^ (0x9D ^ 0xBC);
        L.llIIlllllIIl[1] = "  ".length() & ("  ".length() ^ -" ".length());
        L.llIIlllllIIl[2] = " ".length();
        L.llIIlllllIIl[3] = "  ".length();
        L.llIIlllllIIl[4] = "   ".length();
        L.llIIlllllIIl[5] = 0xB9 ^ 0xAD;
        L.llIIlllllIIl[6] = 0x98 ^ 0x9D;
        L.llIIlllllIIl[7] = 0x30 ^ 0x36;
        L.llIIlllllIIl[8] = 0x77 ^ 0x7F;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        L lllllllllllllllIlIIIllllllIlllll;
        Player player = Players.getLocal();
        if (L.lIIIIIIIIlIIIIl(player)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIIlI(lllllllllllllllIlIIIllllllIlllll.ba.M(), llIIlllllIIl[5])) {
            return llIIlllllIIl[1];
        }
        Item lllllllllllllllIlIIIllllllIlllIl = lllllllllllllllIlIIIllllllIlllll.bC();
        if (L.lIIIIIIIIlIIIll(lllllllllllllllIlIIIllllllIlllIl)) {
            lllllllllllllllIlIIIllllllIlllIl.interact(llIIllllIIlI[llIIlllllIIl[0]]);
            return llIIlllllIIl[2];
        }
        if (L.lIIIIIIIIlIIlII(lllllllllllllllIlIIIllllllIlllll.ba.R() ? 1 : 0)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIlII(Inventory.isFull() ? 1 : 0)) {
            return llIIlllllIIl[1];
        }
        if (L.lIIIIIIIIlIIlII(lllllllllllllllIlIIIllllllIlllll.bV.p() ? 1 : 0)) {
            return llIIlllllIIl[2];
        }
        Player lllllllllllllllIlIIIllllllIlllII = Players.getLocal();
        GameObject lllllllllllllllIlIIIllllllIllIll = lllllllllllllllIlIIIllllllIlllll.ba.U();
        if (L.lIIIIIIIIlIIIll(lllllllllllllllIlIIIllllllIllIll)) {
            void lllllllllllllllIlIIIllllllIllllI;
            if (L.lIIIIIIIIlIIIll(lllllllllllllllIlIIIllllllIlllII.getInteracting())) {
                lllllllllllllllIlIIIllllllIlllll.bV.e(Rand.nextInt((int)llIIlllllIIl[3], (int)llIIlllllIIl[0]));
                return llIIlllllIIl[2];
            }
            h lllllllllllllllIlIIIllllllIllIlI = lllllllllllllllIlIIIllllllIlllll.ba.V();
            if (L.lIIIIIIIIlIIIIl(lllllllllllllllIlIIIllllllIllIlI)) {
                return llIIlllllIIl[1];
            }
            l lllllllllllllllIlIIIllllllIllIIl = lllllllllllllllIlIIIllllllIllIlI.d(lllllllllllllllIlIIIllllllIllIll.getWorldLocation());
            if (L.lIIIIIIIIlIIIIl(lllllllllllllllIlIIIllllllIllIIl)) {
                return llIIlllllIIl[1];
            }
            if (L.lIIIIIIIIlIIlIl(lllllllllllllllIlIIIllllllIllIIl.e(lllllllllllllllIlIIIllllllIllllI.getWorldLocation()) ? 1 : 0)) {
                return lllllllllllllllIlIIIllllllIlllll.ba.a(lllllllllllllllIlIIIllllllIllIIl, lllllllllllllllIlIIIllllllIllllI.getWorldLocation());
            }
            if (L.lIIIIIIIIlIIlII(lllllllllllllllIlIIIllllllIllIll.hasAction(lllllllllllllllIlIIIllllllIlllll.bW) ? 1 : 0)) {
                lllllllllllllllIlIIIllllllIllIll.interact(lllllllllllllllIlIIIllllllIlllll.bW);
                lllllllllllllllIlIIIllllllIlllll.bV.e(Rand.nextInt((int)llIIlllllIIl[3], (int)llIIlllllIIl[0]));
                return llIIlllllIIl[2];
            }
            Object[] objectArray = new Object[llIIlllllIIl[3]];
            objectArray[L.llIIlllllIIl[1]] = lllllllllllllllIlIIIllllllIllIll.getName();
            objectArray[L.llIIlllllIIl[2]] = lllllllllllllllIlIIIllllllIllIll.getActions();
            Log.info((String)llIIllllIIlI[llIIlllllIIl[6]], (Object[])objectArray);
            return llIIlllllIIl[1];
        }
        return llIIlllllIIl[1];
    }

    private static String lIIIIIIIIIIllII(String lllllllllllllllIlIIIlllllIlIllll, String lllllllllllllllIlIIIlllllIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllllIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllllIllIIII.getBytes(StandardCharsets.UTF_8)), llIIlllllIIl[8]), "DES");
            Cipher lllllllllllllllIlIIIlllllIllIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIIlllllIllIIll.init(llIIlllllIIl[3], lllllllllllllllIlIIIlllllIllIlII);
            return new String(lllllllllllllllIlIIIlllllIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlllllIllIIlI) {
            lllllllllllllllIlIIIlllllIllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIIIIlIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIIIIIlIIIll(Object object) {
        return object != null;
    }

    private static boolean lIIIIIIIIlIIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIIIIlIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public L(c c2, b b2) {
        d[] dArray = new d[llIIlllllIIl[0]];
        dArray[L.llIIlllllIIl[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[L.llIIlllllIIl[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[L.llIIlllllIIl[3]] = d.EXTRA_FOOD_EXPLORE;
        dArray[L.llIIlllllIIl[4]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
        String[] stringArray = new String[llIIlllllIIl[0]];
        stringArray[L.llIIlllllIIl[1]] = llIIllllIIlI[llIIlllllIIl[1]];
        stringArray[L.llIIlllllIIl[2]] = llIIllllIIlI[llIIlllllIIl[2]];
        stringArray[L.llIIlllllIIl[3]] = llIIllllIIlI[llIIlllllIIl[3]];
        stringArray[L.llIIlllllIIl[4]] = llIIllllIIlI[llIIlllllIIl[4]];
        this.bW = stringArray;
        this.bV = b2;
    }

    private static boolean lIIIIIIIIlIlIII(int n2) {
        return n2 <= 0;
    }

    private static String lIIIIIIIIIIlIll(String lllllllllllllllIlIIIlllllIlIIIlI, String lllllllllllllllIlIIIlllllIlIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIlllllIlIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIlllllIlIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIlllllIlIIllI.init(llIIlllllIIl[3], lllllllllllllllIlIIIlllllIlIIlll);
            return new String(lllllllllllllllIlIIIlllllIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIlllllIlIIlIl) {
            lllllllllllllllIlIIIlllllIlIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIIIIIIIIIlllll() {
        llIIllllIIlI = new String[llIIlllllIIl[7]];
        L.llIIllllIIlI[L.llIIlllllIIl[1]] = L.lIIIIIIIIIIlIll("RFjCy9A8ZaY=", "bvBdR");
        L.llIIllllIIlI[L.llIIlllllIIl[2]] = L.lIIIIIIIIIIllII("RdFTnI8em1U=", "LgJVe");
        L.llIIllllIIlI[L.llIIlllllIIl[3]] = L.lIIIIIIIIIllllI("DBkSOQ==", "JpaQG");
        L.llIIllllIIlI[L.llIIlllllIIl[4]] = L.lIIIIIIIIIIlIll("NIaKBKVZ7Qc=", "FEVuh");
        L.llIIllllIIlI[L.llIIlllllIIl[0]] = L.lIIIIIIIIIIllII("mrOeT2+sqlI=", "JUeBG");
        L.llIIllllIIlI[L.llIIlllllIIl[6]] = L.lIIIIIIIIIllllI("CQFDLQozBwwiSSEBFiINZwgMPkkzDxErDDNUQzcUa04COgguAgIuBSJOAi8dLgENP1NnFR4=", "GncLi");
    }

    private static boolean lIIIIIIIIlIIIIl(Object object) {
        return object == null;
    }

    private static String lIIIIIIIIIllllI(String lllllllllllllllIlIIIllllllIIIIIl, String lllllllllllllllIlIIIllllllIIIlIl) {
        lllllllllllllllIlIIIllllllIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllllllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIIllllllIIIlII = new StringBuilder();
        char[] lllllllllllllllIlIIIllllllIIIIll = lllllllllllllllIlIIIllllllIIIlIl.toCharArray();
        int lllllllllllllllIlIIIllllllIIIIlI = llIIlllllIIl[1];
        char[] lllllllllllllllIlIIIlllllIllllII = lllllllllllllllIlIIIllllllIIIIIl.toCharArray();
        int lllllllllllllllIlIIIlllllIlllIll = lllllllllllllllIlIIIlllllIllllII.length;
        int lllllllllllllllIlIIIlllllIlllIlI = llIIlllllIIl[1];
        while (L.lIIIIIIIIlIlIIl(lllllllllllllllIlIIIlllllIlllIlI, lllllllllllllllIlIIIlllllIlllIll)) {
            char lllllllllllllllIlIIIllllllIIIlll = lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIlllIlI];
            lllllllllllllllIlIIIllllllIIIlII.append((char)(lllllllllllllllIlIIIllllllIIIlll ^ lllllllllllllllIlIIIllllllIIIIll[lllllllllllllllIlIIIllllllIIIIlI % lllllllllllllllIlIIIllllllIIIIll.length]));
            "".length();
            ++lllllllllllllllIlIIIllllllIIIIlI;
            ++lllllllllllllllIlIIIlllllIlllIlI;
            "".length();
            if (-(0x5C ^ 0x58) < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIIllllllIIIlII);
    }

    private static boolean lIIIIIIIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean a(Item item, i i2) {
        return i2.ay().contains(item.getId());
    }

    private static boolean lIIIIIIIIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIIIIIIIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private Item bC() {
        return Inventory.getFirst(item -> {
            boolean bl;
            void lllllllllllllllIlIIIllllllIlIIll;
            Optional<i> lllllllllllllllIlIIIllllllIlIIlI2;
            L lllllllllllllllIlIIIllllllIlIlII;
            if (L.lIIIIIIIIlIIlII(i.FISH.ay().contains(item.getId()) ? 1 : 0)) {
                if (!L.lIIIIIIIIlIIllI((Object)this.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) || L.lIIIIIIIIlIIlll(Inventory.getFreeSlots())) {
                    return llIIlllllIIl[1];
                }
                int lllllllllllllllIlIIIllllllIlIIlI2 = lllllllllllllllIlIIIllllllIlIlII.ba.E().getOrDefault((Object)i.FISH, llIIlllllIIl[1]);
                if (L.lIIIIIIIIlIIllI((Object)lllllllllllllllIlIIIllllllIlIlII.ba.W(), (Object)d.DEMI_BOSS_EXPLORE) && L.lIIIIIIIIlIIlll(lllllllllllllllIlIIIllllllIlIIlI2)) {
                    return llIIlllllIIl[1];
                }
            }
            if (L.lIIIIIIIIlIIlII((lllllllllllllllIlIIIllllllIlIIlI2 = Arrays.stream(i.values()).filter(arg_0 -> L.a((Item)lllllllllllllllIlIIIllllllIlIIll, arg_0)).findFirst()).isEmpty() ? 1 : 0)) {
                return llIIlllllIIl[1];
            }
            int lllllllllllllllIlIIIllllllIlIIIl = lllllllllllllllIlIIIllllllIlIlII.ba.E().getOrDefault((Object)lllllllllllllllIlIIIllllllIlIIlI2.get(), llIIlllllIIl[1]);
            if (L.lIIIIIIIIlIlIII(lllllllllllllllIlIIIllllllIlIIIl)) {
                bl = llIIlllllIIl[2];
                "".length();
                if (((0xAC ^ 0xA9) & ~(2 ^ 7)) != 0) {
                    return ("   ".length() & ~"   ".length()) != 0;
                }
            } else {
                bl = llIIlllllIIl[1];
            }
            return bl;
        });
    }
}

