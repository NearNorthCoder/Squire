/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Killing annoying egg", priority=20, register=true, blocking=true)
public class bg
extends bh {
    private static /* synthetic */ String[] llIlIllIlll;
    private static /* synthetic */ int[] llIlIlllIII;
    private static final /* synthetic */ int eM;
    private static final /* synthetic */ Point eL;

    private static void lIlIlIIIIIIIIl() {
        llIlIllIlll = new String[llIlIlllIII[8]];
        bg.llIlIllIlll[bg.llIlIlllIII[1]] = bg."Wield";
        bg.llIlIllIlll[bg.llIlIlllIII[3]] = bg."Attack";
        bg.llIlIllIlll[bg.llIlIlllIII[2]] = bg."keris";
        bg.llIlIllIlll[bg.llIlIlllIII[4]] = bg."egg";
        bg.llIlIllIlll[bg.llIlIlllIII[0]] = bg."Attack";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var2_2;
        bg llllllllllllllllIIllIIIlIIIlllII;
        if (!bg.lIlIlIIIIIIIll(bg.bV() ? 1 : 0) || bg.lIlIlIIIIIIlII(this.bR() ? 1 : 0)) {
            llllllllllllllllIIllIIIlIIIlllII.sleep(llIlIlllIII[0]);
            return llIlIlllIII[1];
        }
        WorldPoint llllllllllllllllIIllIIIlIIIllIll = llllllllllllllllIIllIIIlIIIlllII.a(eL);
        NPC llllllllllllllllIIllIIIlIIIllIlI = NPCs.getAll(nPC -> {
            int n2;
            if (bg.lIlIlIIIIIIlII(nPC.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[4]]) ? 1 : 0)) {
                String[] stringArray = new String[llIlIlllIII[3]];
                stringArray[bg.llIlIlllIII[1]] = llIlIllIlll[llIlIlllIII[0]];
                if (bg.lIlIlIIIIIIlII(nPC.hasAction(stringArray) ? 1 : 0) && bg.lIlIlIIIIIIlII(nPC.getWorldLocation().equals((Object)llllllllllllllllIIllIIIlIIIllIll) ? 1 : 0) && bg.lIlIlIIIIIIlll(nPC.getId(), llIlIlllIII[5]) && bg.lIlIlIIIIIIIll(nPC.isDead() ? 1 : 0)) {
                    n2 = llIlIlllIII[3];
                    0;
                    if (1 > 0) return n2 != 0;
                    return ((0xD ^ 0x16) & ~(0x18 ^ 3)) != 0;
                }
            }
            n2 = llIlIlllIII[1];
            return n2 != 0;
        }).stream().findFirst().orElse(null);
        if (bg.lIlIlIIIIIIlIl(llllllllllllllllIIllIIIlIIIllIlI)) {
            return llIlIlllIII[1];
        }
        if (bg.lIlIlIIIIIIIll(llllllllllllllllIIllIIIlIIIllIlI.getWorldArea().offset(llIlIlllIII[2]).contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIlIlllIII[1];
        }
        Set<WorldPoint> llllllllllllllllIIllIIIlIIIllIIl = llllllllllllllllIIllIIIlIIIlllII.bU();
        WorldArea llllllllllllllllIIllIIIlIIIllIII = llllllllllllllllIIllIIIlIIIllIlI.getWorldArea().offset(llIlIlllIII[3]);
        if (bg.lIlIlIIIIIIlII(llllllllllllllllIIllIIIlIIIllIIl.stream().anyMatch(worldPoint -> llllllllllllllllIIllIIIlIIIllIlI.getWorldArea().offset(llIlIlllIII[3]).contains(worldPoint)) ? 1 : 0)) {
            WorldPoint llllllllllllllllIIllIIIlIIIlIlll = llllllllllllllllIIllIIIlIIIllIII.toWorldPointList().stream().filter(worldPoint -> worldPoint.toWorldArea().isInMeleeDistance(llllllllllllllllIIllIIIlIIIllIlI.getWorldLocation())).filter(worldPoint -> {
                boolean bl2;
                if (bg.lIlIlIIIIIIIll(llllllllllllllllIIllIIIlIIIllIIl.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIlllIII[3];
                    0;
                    if ((0x4B ^ 0x53 ^ (0x6D ^ 0x71)) <= 2) {
                        return ((0x6F ^ 0x27 ^ (0xF7 ^ 0x9A)) & (28 + 65 - 38 + 99 ^ 27 + 126 - 20 + 58 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIlllIII[1];
                }
                return bl2;
            }).findFirst().orElse(null);
            if (bg.lIlIlIIIIIIlIl(llllllllllllllllIIllIIIlIIIlIlll)) {
                return llIlIlllIII[1];
            }
            Movement.setDestination((WorldPoint)llllllllllllllllIIllIIIlIIIlIlll);
            return llIlIlllIII[1];
        }
        llllllllllllllllIIllIIIlIIIlllII.bp();
        Item llllllllllllllllIIllIIIlIIIlIlll = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[2]]));
        if (bg.lIlIlIIIIIIllI(llllllllllllllllIIllIIIlIIIlIlll)) {
            llllllllllllllllIIllIIIlIIIlIlll.interact(llIlIllIlll[llIlIlllIII[1]]);
        }
        var2_2.interact(llIlIllIlll[llIlIlllIII[3]]);
        return llIlIlllIII[3];
    }

    private static String lIlIIllllllllI(String llllllllllllllllIIllIIIIlllIIIII, String llllllllllllllllIIllIIIIllIlllll) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIllIlllll.getBytes(StandardCharsets.UTF_8)), llIlIlllIII[9]), "DES");
            Cipher llllllllllllllllIIllIIIIlllIIlII = Cipher.getInstance("DES");
            llllllllllllllllIIllIIIIlllIIlII.init(llIlIlllIII[2], llllllllllllllllIIllIIIIlllIIlIl);
            return new String(llllllllllllllllIIllIIIIlllIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIIlllIIIll) {
            llllllllllllllllIIllIIIIlllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIIIIIIIII(String llllllllllllllllIIllIIIlIIIIIlII, String llllllllllllllllIIllIIIlIIIIIIll) {
        llllllllllllllllIIllIIIlIIIIIlII = new String(Base64.getDecoder().decode(llllllllllllllllIIllIIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIllIIIlIIIIIIlI = new StringBuilder();
        char[] llllllllllllllllIIllIIIlIIIIIIIl = llllllllllllllllIIllIIIlIIIIIIll.toCharArray();
        int llllllllllllllllIIllIIIlIIIIIIII = llIlIlllIII[1];
        char[] llllllllllllllllIIllIIIIlllllIlI = llllllllllllllllIIllIIIlIIIIIlII.toCharArray();
        int llllllllllllllllIIllIIIIlllllIIl = llllllllllllllllIIllIIIIlllllIlI.length;
        int llllllllllllllllIIllIIIIlllllIII = llIlIlllIII[1];
        while (bg.lIlIlIIIIIlIII(llllllllllllllllIIllIIIIlllllIII, llllllllllllllllIIllIIIIlllllIIl)) {
            char llllllllllllllllIIllIIIlIIIIIlIl = llllllllllllllllIIllIIIIlllllIlI[llllllllllllllllIIllIIIIlllllIII];
            llllllllllllllllIIllIIIlIIIIIIlI.append((char)(llllllllllllllllIIllIIIlIIIIIlIl ^ llllllllllllllllIIllIIIlIIIIIIIl[llllllllllllllllIIllIIIlIIIIIIII % llllllllllllllllIIllIIIlIIIIIIIl.length]));
            0;
            ++llllllllllllllllIIllIIIlIIIIIIII;
            ++llllllllllllllllIIllIIIIlllllIII;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIllIIIlIIIIIIlI);
    }

    @Inject
    public bg(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIlIlIIIIIIIlI() {
        llIlIlllIII = new int[10];
        bg.llIlIlllIII[0] = 0x67 ^ 0xC ^ (0x65 ^ 0xA);
        bg.llIlIlllIII[1] = (0x94 ^ 0xBE) & ~(0x12 ^ 0x38);
        bg.llIlIlllIII[2] = 2;
        bg.llIlIlllIII[3] = 1;
        bg.llIlIlllIII[4] = 3;
        bg.llIlIlllIII[5] = -(0xFFFFE137 & 0x5EEF) & (0xFFFFFFF6 & 0x6DFF);
        bg.llIlIlllIII[6] = 0x6D ^ 0x72;
        bg.llIlIlllIII[7] = 0x6B ^ 0x34 ^ (0x25 ^ 0x5E);
        bg.llIlIlllIII[8] = 0x84 ^ 0x81;
        bg.llIlIlllIII[9] = 0x17 ^ 0x1F;
    }

    private static boolean lIlIlIIIIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIIIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        bg.lIlIlIIIIIIIlI();
        bg.lIlIlIIIIIIIIl();
        eM = llIlIlllIII[5];
        eL = new Point(llIlIlllIII[6], llIlIlllIII[7]);
    }

    private static String lIlIIlllllllll(String llllllllllllllllIIllIIIIlllIllll, String llllllllllllllllIIllIIIIlllIlllI) {
        try {
            SecretKeySpec llllllllllllllllIIllIIIIllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllIIIIlllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIllIIIIllllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIllIIIIllllIIIl.init(llIlIlllIII[2], llllllllllllllllIIllIIIIllllIIlI);
            return new String(llllllllllllllllIIllIIIIllllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllIIIIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIllIIIIllllIIII) {
            llllllllllllllllIIllIIIIllllIIII.printStackTrace();
            return null;
        }
    }
}

