/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package i.e.e.f.s.q.i.e.h.r.-.r.u.s.l.a.-.r.i.a;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Fishing", priority=5)
public class b
extends Task {
    private static /* synthetic */ String[] lIlIlllIIII;
    private static /* synthetic */ int[] lIlIlllIIIl;
    private static final /* synthetic */ int k;
    private static final /* synthetic */ Predicate<NPC> j;

    private static boolean lIIlIIllllIIIl(int n) {
        return n == 0;
    }

    private static void lIIlIIlllIlllI() {
        lIlIlllIIII = new String[lIlIlllIIIl[5]];
        b.lIlIlllIIII[b.lIlIlllIIIl[1]] = b.lIIlIIlllIllII("CLgiRPzkZog=", "fIqeZ");
        b.lIlIlllIIII[b.lIlIlllIIIl[3]] = b.lIIlIIlllIllIl("CxCuJPDjgsFslrMybHc9xA==", "SYTUr");
    }

    private static String lIIlIIlllIllIl(String llllllllllllllllIlIlIlllIllIlllI, String llllllllllllllllIlIlIlllIllIlIll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlllIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlllIllIlIll.getBytes(StandardCharsets.UTF_8)), lIlIlllIIIl[12]), "DES");
            Cipher llllllllllllllllIlIlIlllIlllIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlllIlllIIII.init(lIlIlllIIIl[5], llllllllllllllllIlIlIlllIlllIIIl);
            return new String(llllllllllllllllIlIlIlllIlllIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlllIllIllll) {
            llllllllllllllllIlIlIlllIllIllll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIllII(String llllllllllllllllIlIlIlllIlIlllll, String llllllllllllllllIlIlIlllIlIllllI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlllIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlllIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlllIllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlllIllIIIll.init(lIlIlllIIIl[5], llllllllllllllllIlIlIlllIllIIlII);
            return new String(llllllllllllllllIlIlIlllIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlllIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlllIllIIIlI) {
            llllllllllllllllIlIlIlllIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllllIIII(Object object) {
        return object != null;
    }

    private static boolean lIIlIIllllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIllllIlII(int n, int n2) {
        return n <= n2;
    }

    private static void lIIlIIlllIllll() {
        lIlIlllIIIl = new int[13];
        b.lIlIlllIIIl[0] = 41 + 148 - 112 + 121 ^ 141 + 123 - 130 + 60;
        b.lIlIlllIIIl[1] = (0x12 ^ 0x2B) & ~(0xAD ^ 0x94);
        b.lIlIlllIIIl[2] = -(69 + 47 - 76 + 105) & (0xFFFFDBFA & 0x7DBF);
        b.lIlIlllIIIl[3] = " ".length();
        b.lIlIlllIIIl[4] = 0xFFFFFF6F & 0x59BD;
        b.lIlIlllIIIl[5] = "  ".length();
        b.lIlIlllIIIl[6] = -(0xFFFFB2FD & 0x6F8F) & (0xFFFFFBBE & 0x7FFD);
        b.lIlIlllIIIl[7] = "   ".length();
        b.lIlIlllIIIl[8] = 0xFFFFFD3F & 0x5BF3;
        b.lIlIlllIIIl[9] = -(0xFFFFFC6B & 0x13DD) & (0xFFFFDFFB & 0x33FE);
        b.lIlIlllIIIl[10] = 0xFFFFE6E1 & 0x1F7E;
        b.lIlIlllIIIl[11] = 0xA1 ^ 0xAE;
        b.lIlIlllIIIl[12] = 0xA3 ^ 0xAB;
    }

    private static boolean lIIlIIllllIIlI(int n) {
        return n != 0;
    }

    public boolean run() {
        NPC llllllllllllllllIlIlIllllIIIIIlI;
        NPC nPC2;
        int[] nArray = new int[lIlIlllIIIl[0]];
        nArray[b.lIlIlllIIIl[1]] = lIlIlllIIIl[2];
        nArray[b.lIlIlllIIIl[3]] = lIlIlllIIIl[4];
        nArray[b.lIlIlllIIIl[5]] = lIlIlllIIIl[6];
        nArray[b.lIlIlllIIIl[7]] = lIlIlllIIIl[8];
        Item item = Inventory.getFirst((int[])nArray);
        if (b.lIIlIIllllIIII(item)) {
            int[] nArray2 = new int[lIlIlllIIIl[3]];
            nArray2[b.lIlIlllIIIl[1]] = lIlIlllIIIl[9];
            item.useOn(Inventory.getFirst((int[])nArray2));
        }
        int[] nArray3 = new int[lIlIlllIIIl[3]];
        nArray3[b.lIlIlllIIIl[1]] = lIlIlllIIIl[10];
        Projectile llllllllllllllllIlIlIllllIIIIlIl = Projectiles.getNearest((int[])nArray3);
        if (b.lIIlIIllllIIII(llllllllllllllllIlIlIllllIIIIlIl) && b.lIIlIIllllIIIl(llllllllllllllllIlIlIllllIIIIlIl.getTarget().equals((Object)Players.getLocal().getLocalLocation()) ? 1 : 0)) {
            return lIlIlllIIIl[3];
        }
        NPC llllllllllllllllIlIlIllllIIIIlII = NPCs.getNearest(nPC -> {
            int n;
            if (b.lIIlIIllllIIlI(j.test((NPC)nPC) ? 1 : 0) && b.lIIlIIllllIIll(Static.getClient().getHintArrowNpc(), nPC)) {
                n = lIlIlllIIIl[3];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((0 ^ 0x38) & ~(0x4F ^ 0x77)) != 0;
                }
            } else {
                n = lIlIlllIIIl[1];
            }
            return n != 0;
        });
        NPC llllllllllllllllIlIlIllllIIIIIll = NPCs.getNearest(j);
        if (b.lIIlIIllllIIII(llllllllllllllllIlIlIllllIIIIlII)) {
            nPC2 = llllllllllllllllIlIlIllllIIIIlII;
            "".length();
            if ((0x4A ^ 0x4E) == 0) {
                return ((0x12 ^ 0x16) & ~(9 ^ 0xD)) != 0;
            }
        } else {
            nPC2 = llllllllllllllllIlIlIllllIIIIIll;
        }
        if (b.lIIlIIllllIIII(llllllllllllllllIlIlIllllIIIIIlI = nPC2)) {
            llllllllllllllllIlIlIllllIIIIIlI.interact(lIlIlllIIII[lIlIlllIIIl[1]]);
        }
        return lIlIlllIIIl[3];
    }

    static {
        b.lIIlIIlllIllll();
        b.lIIlIIlllIlllI();
        k = lIlIlllIIIl[10];
        j = nPC -> {
            int n;
            if (b.lIIlIIllllIIII(nPC.getName()) && b.lIIlIIllllIIlI(nPC.getName().equals(lIlIlllIIII[lIlIlllIIIl[3]]) ? 1 : 0) && b.lIIlIIllllIlII(nPC.distanceTo((Locatable)Players.getLocal()), lIlIlllIIIl[11]) && b.lIIlIIllllIlIl(Players.getNearest(player -> {
                int n;
                if (b.lIIlIIllllIIII(player.getInteracting()) && b.lIIlIIllllIIlI(player.getInteracting().equals(nPC) ? 1 : 0)) {
                    n = lIlIlllIIIl[3];
                    "".length();
                    if ((0x71 ^ 0x75) <= " ".length()) {
                        return ((0xC9 ^ 0x8A) & ~(0x68 ^ 0x2B)) != 0;
                    }
                } else {
                    n = lIlIlllIIIl[1];
                }
                return n != 0;
            })) && b.lIIlIIllllIlIl(Projectiles.getNearest(projectile -> {
                int n;
                if (b.lIIlIIllllIIII(projectile.getTarget()) && b.lIIlIIllllIIlI(projectile.getTarget().equals((Object)nPC.getLocalLocation()) ? 1 : 0)) {
                    n = lIlIlllIIIl[3];
                    "".length();
                    if (-" ".length() > ((0x14 ^ 1) & ~(0x28 ^ 0x3D))) {
                        return ((0x37 ^ 0x10) & ~(0x7F ^ 0x58)) != 0;
                    }
                } else {
                    n = lIlIlllIIIl[1];
                }
                return n != 0;
            }))) {
                n = lIlIlllIIIl[3];
                "".length();
                if (-"  ".length() > 0) {
                    return ((0xBD ^ 0x95) & ~(0x62 ^ 0x4A)) != 0;
                }
            } else {
                n = lIlIlllIIIl[1];
            }
            return n != 0;
        };
    }
}

