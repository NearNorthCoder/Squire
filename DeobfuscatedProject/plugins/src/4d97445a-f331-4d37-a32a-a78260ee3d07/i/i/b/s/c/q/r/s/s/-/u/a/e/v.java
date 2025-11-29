/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import i.i.b.s.c.q.r.s.s.-.u.a.e.h;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Looting items", priority=10)
public class v
extends Task {
    private static /* synthetic */ String[] lIlIlIIl;
    private final /* synthetic */ SquireCerberus aG;
    private final /* synthetic */ a aH;
    private static /* synthetic */ int[] lIlIlIlI;

    private static String lIIllIIIII(String llIllllllIIIlll, String llIllllllIIIllI) {
        llIllllllIIIlll = new String(Base64.getDecoder().decode(llIllllllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllllllIIlIlI = new StringBuilder();
        char[] llIllllllIIlIIl = llIllllllIIIllI.toCharArray();
        int llIllllllIIlIII = lIlIlIlI[0];
        char[] llIllllllIIIIlI = llIllllllIIIlll.toCharArray();
        int llIllllllIIIIIl = llIllllllIIIIlI.length;
        int llIllllllIIIIII = lIlIlIlI[0];
        while (v.lIIllIlIIl(llIllllllIIIIII, llIllllllIIIIIl)) {
            char llIllllllIIllIl = llIllllllIIIIlI[llIllllllIIIIII];
            llIllllllIIlIlI.append((char)(llIllllllIIllIl ^ llIllllllIIlIIl[llIllllllIIlIII % llIllllllIIlIIl.length]));
            "".length();
            ++llIllllllIIlIII;
            ++llIllllllIIIIII;
            "".length();
            if ("   ".length() > 0) continue;
            return null;
        }
        return String.valueOf(llIllllllIIlIlI);
    }

    static {
        v.lIIllIIIlI();
        v.lIIllIIIIl();
    }

    public boolean run() {
        v llIlllllllIlIIl;
        if (v.lIIllIIlII(this.aH.f() ? 1 : 0)) {
            return lIlIlIlI[0];
        }
        if (!v.lIIllIIlIl(llIlllllllIlIIl.aG.p()) || v.lIIllIIllI(llIlllllllIlIIl.aG.p().isEmpty() ? 1 : 0)) {
            return lIlIlIlI[0];
        }
        Instant llIlllllllIlIII = Instant.now();
        Iterator<h> llIlllllllIIlll = llIlllllllIlIIl.aG.p().iterator();
        while (v.lIIllIIllI(llIlllllllIIlll.hasNext() ? 1 : 0)) {
            block12: {
                TileItem llIlllllllIIlIl;
                block11: {
                    h llIlllllllIIllI = llIlllllllIIlll.next();
                    if (v.lIIllIIlll(v.lIIllIIIll(Duration.between(llIlllllllIIllI.O(), llIlllllllIlIII).toMinutes(), 2L))) {
                        llIlllllllIlIIl.aG.p().remove(llIlllllllIIllI);
                        "".length();
                    }
                    int[] nArray = new int[lIlIlIlI[1]];
                    nArray[v.lIlIlIlI[0]] = llIlllllllIIllI.P();
                    llIlllllllIIlIl = TileItems.getNearest((int[])nArray);
                    if (v.lIIllIlIII(llIlllllllIIlIl)) {
                        llIlllllllIlIIl.aG.p().remove(llIlllllllIIllI);
                        "".length();
                        "".length();
                        if ((123 + 77 - 169 + 99 ^ 60 + 120 - 124 + 78) != 0) continue;
                        return ((0xCE ^ 0x98 ^ (0xB1 ^ 0xC5)) & (0x18 ^ 0x61 ^ (0x6E ^ 0x35) ^ -" ".length())) != 0;
                    }
                    if (!v.lIIllIIllI(Inventory.isFull() ? 1 : 0)) break block11;
                    if (v.lIIllIIlII(llIlllllllIIlIl.isStackable() ? 1 : 0) && !v.lIIllIIllI(llIlllllllIIlIl.isNoted() ? 1 : 0)) break block12;
                    int[] nArray2 = new int[lIlIlIlI[1]];
                    nArray2[v.lIlIlIlI[0]] = llIlllllllIIlIl.getId();
                    if (!v.lIIllIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block12;
                }
                if (v.lIIllIIlII(Movement.shouldWalk() ? 1 : 0)) {
                    return lIlIlIlI[1];
                }
                llIlllllllIIlIl.interact(lIlIlIIl[lIlIlIlI[0]]);
                return lIlIlIlI[1];
            }
            if (v.lIIllIIllI(Inventory.isFull() ? 1 : 0)) {
                Item llIlllllllIIlII = Inventory.getFirst(item -> {
                    String[] stringArray = new String[lIlIlIlI[1]];
                    stringArray[v.lIlIlIlI[0]] = lIlIlIIl[lIlIlIlI[2]];
                    return item.hasAction(stringArray);
                });
                if (v.lIIllIlIII(llIlllllllIIlII)) {
                    return lIlIlIlI[0];
                }
                llIlllllllIIlII.interact(lIlIlIIl[lIlIlIlI[1]]);
                llIlllllllIlIIl.sleep(lIlIlIlI[2]);
                return lIlIlIlI[1];
            }
            "".length();
            if (((0x5A ^ 0x49 ^ (0x9E ^ 0x90)) & (0x69 ^ 0x37 ^ (0x73 ^ 0x30) ^ -" ".length())) <= "   ".length()) continue;
            return ((0x63 ^ 0x72 ^ (0x1B ^ 0x5D)) & (9 ^ 0x37 ^ (0x1A ^ 0x73) ^ -" ".length())) != 0;
        }
        return lIlIlIlI[0];
    }

    private static boolean lIIllIlIII(Object object) {
        return object == null;
    }

    private static void lIIllIIIIl() {
        lIlIlIIl = new String[lIlIlIlI[3]];
        v.lIlIlIIl[v.lIlIlIlI[0]] = v.lIIlIllllI("lOYiAkFOIRQ=", "XXkNh");
        v.lIlIlIIl[v.lIlIlIlI[1]] = v.lIIlIlllll("HF+/R5UOtqQ=", "UmErX");
        v.lIlIlIIl[v.lIlIlIlI[2]] = v.lIIllIIIII("DA8t", "InYIK");
    }

    private static boolean lIIllIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIIlll(int n2) {
        return n2 > 0;
    }

    @Inject
    private v(SquireCerberus squireCerberus, a a2) {
        this.aG = squireCerberus;
        this.aH = a2;
    }

    private static void lIIllIIIlI() {
        lIlIlIlI = new int[5];
        v.lIlIlIlI[0] = (8 ^ 0x39 ^ "  ".length()) & (0xCE ^ 0x9C ^ (0x36 ^ 0x57) ^ -" ".length());
        v.lIlIlIlI[1] = " ".length();
        v.lIlIlIlI[2] = "  ".length();
        v.lIlIlIlI[3] = "   ".length();
        v.lIlIlIlI[4] = 14 + 100 - 23 + 56 ^ 140 + 55 - 132 + 92;
    }

    private static String lIIlIllllI(String llIllllllIlllII, String llIllllllIllIIl) {
        try {
            SecretKeySpec llIllllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllllllIllIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlI[4]), "DES");
            Cipher llIllllllIllllI = Cipher.getInstance("DES");
            llIllllllIllllI.init(lIlIlIlI[2], llIllllllIlllll);
            return new String(llIllllllIllllI.doFinal(Base64.getDecoder().decode(llIllllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllllllIlllIl) {
            llIllllllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlIlllll(String llIlllllIllIlll, String llIlllllIllIlII) {
        try {
            SecretKeySpec llIlllllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlllllIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlllllIlllIIl = Cipher.getInstance("Blowfish");
            llIlllllIlllIIl.init(lIlIlIlI[2], llIlllllIlllIlI);
            return new String(llIlllllIlllIIl.doFinal(Base64.getDecoder().decode(llIlllllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlllllIlllIII) {
            llIlllllIlllIII.printStackTrace();
            return null;
        }
    }

    private static int lIIllIIIll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static boolean lIIllIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIllIIllI(int n2) {
        return n2 != 0;
    }
}

