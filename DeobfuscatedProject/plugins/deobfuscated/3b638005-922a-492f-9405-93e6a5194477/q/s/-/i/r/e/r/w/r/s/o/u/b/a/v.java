/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.movement.Reachable
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.a;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.c;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@TaskDesc(name="Attacking monster for potential", priority=200)
public class v
extends Task {
    private final /* synthetic */ a ai;
    private final /* synthetic */ c aj;
    private static /* synthetic */ String[] llllIlIllIl;
    private final /* synthetic */ SquireBarrows ah;
    private static /* synthetic */ int[] llllIlIllll;

    private static boolean lIllIllIIIIllI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        v llllllllllllllllIIIllIIlIIlllIII;
        if (v.lIllIllIIIIIIl(this.ah.g() ? 1 : 0)) {
            return llllIlIllll[0];
        }
        if (v.lIllIllIIIIIlI(llllllllllllllllIIIllIIlIIlllIII.ah.h() ? 1 : 0)) {
            return llllIlIllll[0];
        }
        Actor llllllllllllllllIIIllIIlIIllIlll = Players.getLocal().getInteracting();
        if (v.lIllIllIIIIIll(llllllllllllllllIIIllIIlIIllIlll) && v.lIllIllIIIIIIl(d.a(llllllllllllllllIIIllIIlIIllIlll) ? 1 : 0)) {
            return llllIlIllll[0];
        }
        if (v.lIllIllIIIIIIl(llllllllllllllllIIIllIIlIIlllIII.ah.v() ? 1 : 0)) {
            return llllIlIllll[0];
        }
        int llllllllllllllllIIIllIIlIIllIllI = llllllllllllllllIIIllIIlIIlllIII.aj.d();
        Player llllllllllllllllIIIllIIlIIllIlIl = Players.getLocal();
        List llllllllllllllllIIIllIIlIIllIlII = NPCs.getAll(nPC -> {
            int n3;
            if (v.lIllIllIIIIllI(nPC.getInteracting(), llllllllllllllllIIIllIIlIIllIlIl) && v.lIllIllIIIIIIl(this.aj.c(llllllllllllllllIIIllIIlIIllIllI).contains(nPC.getName()) ? 1 : 0)) {
                n3 = llllIlIllll[2];
                0;
                if (1 != 1) {
                    return ((0x4E ^ 0x2E) & ~(0xF ^ 0x6F)) != 0;
                }
            } else {
                n3 = llllIlIllll[0];
            }
            return n3 != 0;
        });
        NPC llllllllllllllllIIIllIIlIIllIIll = NPCs.getNearest(nPC -> {
            int n2;
            if (v.lIllIllIIIIllI(nPC.getInteracting(), llllllllllllllllIIIllIIlIIllIlIl) && v.lIllIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                n2 = llllIlIllll[2];
                0;
                if (-1 > 0) {
                    return ((0x87 ^ 0xB5) & ~(0x2C ^ 0x1E)) != 0;
                }
            } else {
                n2 = llllIlIllll[0];
            }
            return n2 != 0;
        });
        if (v.lIllIllIIIIIll(llllllllllllllllIIIllIIlIIllIIll) && v.lIllIllIIIIIIl(llllllllllllllllIIIllIIlIIllIlII.contains(llllllllllllllllIIIllIIlIIllIIll) ? 1 : 0)) {
            if (v.lIllIllIIIIIlI(Gear.isEquipped((int[])llllllllllllllllIIIllIIlIIlllIII.ai.B()) ? 1 : 0)) {
                Gear.swapTo((int[])llllllllllllllllIIIllIIlIIlllIII.ai.B());
                0;
            }
            if (v.lIllIllIIIIlII(llllllllllllllllIIIllIIlIIllIlIl.getInteracting(), llllllllllllllllIIIllIIlIIllIIll)) {
                llllllllllllllllIIIllIIlIIllIIll.interact(llllIlIllIl[llllIlIllll[0]]);
                llllllllllllllllIIIllIIlIIlllIII.sleep(llllIlIllll[1]);
                return llllIlIllll[2];
            }
            return llllIlIllll[0];
        }
        NPC llllllllllllllllIIIllIIlIIllIIlI = NPCs.getNearest(nPC -> {
            int n2;
            if (v.lIllIllIIIIIIl(llllllllllllllllIIIllIIlIIllIlII.contains(nPC) ? 1 : 0) && v.lIllIllIIIIIIl(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
                n2 = llllIlIllll[2];
                0;
                if (((0xC5 ^ 0xBB ^ (0xDE ^ 0xA7)) & (89 + 81 - 139 + 125 ^ 35 + 147 - 34 + 7 ^ -1)) != ((0x79 ^ 0x40 ^ (0x7B ^ 2)) & (21 + 33 - -55 + 20 ^ 156 + 150 - 251 + 138 ^ -1))) {
                    return ((91 + 36 - 15 + 15 ^ (0x6F ^ 0x53)) & (0x48 ^ 0x53 ^ (0x7C ^ 0x24) ^ -1)) != 0;
                }
            } else {
                n2 = llllIlIllll[0];
            }
            return n2 != 0;
        });
        if (!v.lIllIllIIIIIll(llllllllllllllllIIIllIIlIIllIIlI) || v.lIllIllIIIIIll(llllllllllllllllIIIllIIlIIllIIll) && v.lIllIllIIIIIlI(Reachable.isInteractable((Locatable)llllllllllllllllIIIllIIlIIllIIll) ? 1 : 0)) {
            TileObject llllllllllllllllIIIllIIlIIllIIIl = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.lIllIllIIIIIIl(tileObject.getName().equals(llllIlIllIl[llllIlIllll[5]]) ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIllll[1]];
                    stringArray[v.llllIlIllll[0]] = llllIlIllIl[llllIlIllll[6]];
                    stringArray[v.llllIlIllll[2]] = llllIlIllIl[llllIlIllll[7]];
                    if (v.lIllIllIIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llllIlIllll[2];
                        0;
                        if (-1 < ((89 + 147 - 85 + 2 ^ 29 + 102 - 7 + 71) & (157 + 221 - 256 + 113 ^ 136 + 21 - 33 + 53 ^ -1))) return n2 != 0;
                        return ((0x55 ^ 0x69 ^ (0x1D ^ 0x6B)) & (0xD ^ 0x23 ^ (0xE7 ^ 0x83) ^ -1)) != 0;
                    }
                }
                n2 = llllIlIllll[0];
                return n2 != 0;
            });
            if (v.lIllIllIIIIIll(llllllllllllllllIIIllIIlIIllIIIl) && v.lIllIllIIIIIlI(Reachable.isInteractable((Locatable)llllllllllllllllIIIllIIlIIllIIIl) ? 1 : 0)) {
                return llllIlIllll[0];
            }
            TileObject llllllllllllllllIIIllIIlIIllIIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (v.lIllIllIIIIIIl(tileObject.getName().equals(llllIlIllIl[llllIlIllll[3]]) ? 1 : 0)) {
                    String[] stringArray = new String[llllIlIllll[2]];
                    stringArray[v.llllIlIllll[0]] = llllIlIllIl[llllIlIllll[4]];
                    if (v.lIllIllIIIIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llllIlIllll[2];
                        0;
                        if (-1 != ((9 ^ 0x70 ^ (0xB1 ^ 0xAB)) & (0x75 ^ 0x67 ^ (0x75 ^ 4) ^ -1))) return n2 != 0;
                        return ((14 + 124 - 136 + 208 ^ 14 + 66 - -27 + 37) & (2 ^ (0x33 ^ 0x73) ^ -1)) != 0;
                    }
                }
                n2 = llllIlIllll[0];
                return n2 != 0;
            });
            if (v.lIllIllIIIIlIl(llllllllllllllllIIIllIIlIIllIIII)) {
                return llllIlIllll[0];
            }
            llllllllllllllllIIIllIIlIIllIIII.interact(llllIlIllIl[llllIlIllll[2]]);
            llllllllllllllllIIIllIIlIIlllIII.sleep(llllIlIllll[3]);
            return llllIlIllll[2];
        }
        var6_6.interact(llllIlIllIl[llllIlIllll[1]]);
        return llllIlIllll[0];
    }

    private static String lIllIlIllllIIl(String llllllllllllllllIIIllIIlIIIIIlll, String llllllllllllllllIIIllIIlIIIIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIlIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIlIIIIIlII.getBytes(StandardCharsets.UTF_8)), llllIlIllll[8]), "DES");
            Cipher llllllllllllllllIIIllIIlIIIIlIIl = Cipher.getInstance("DES");
            llllllllllllllllIIIllIIlIIIIlIIl.init(llllIlIllll[1], llllllllllllllllIIIllIIlIIIIlIlI);
            return new String(llllllllllllllllIIIllIIlIIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIIlIIIIlIII) {
            llllllllllllllllIIIllIIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIIlII(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIllIIIIIII() {
        llllIlIllll = new int[9];
        v.llllIlIllll[0] = (0xC5 ^ 0xC0 ^ (0x14 ^ 0x26)) & (0x1C ^ 0x6E ^ (0xC4 ^ 0x81) ^ -1);
        v.llllIlIllll[1] = 2;
        v.llllIlIllll[2] = 1;
        v.llllIlIllll[3] = 3;
        v.llllIlIllll[4] = 140 + 20 - 59 + 65 ^ 77 + 107 - 60 + 38;
        v.llllIlIllll[5] = 0x25 ^ 0x20;
        v.llllIlIllll[6] = 0x76 ^ 0x70;
        v.llllIlIllll[7] = 152 + 51 - 69 + 34 ^ 13 + 150 - 66 + 78;
        v.llllIlIllll[8] = 0x52 ^ 0x5A;
    }

    private static boolean lIllIllIIIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIIlIl(Object object) {
        return object == null;
    }

    static {
        v.lIllIllIIIIIII();
        v.lIllIlIllllllI();
    }

    private static String lIllIlIllllIII(String llllllllllllllllIIIllIIlIIIlIlII, String llllllllllllllllIIIllIIlIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllllIIIllIIlIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIIlIIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIIlIIIlIllI.init(llllIlIllll[1], llllllllllllllllIIIllIIlIIIlIlll);
            return new String(llllllllllllllllIIIllIIlIIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIIlIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIIlIIIlIlIl) {
            llllllllllllllllIIIllIIlIIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIllllllI() {
        llllIlIllIl = new String[llllIlIllll[8]];
        v.llllIlIllIl[v.llllIlIllll[0]] = v."Attack";
        v.llllIlIllIl[v.llllIlIllll[2]] = v."Open";
        v.llllIlIllIl[v.llllIlIllll[1]] = v."Attack";
        v.llllIlIllIl[v.llllIlIllll[3]] = v."Door";
        v.llllIlIllIl[v.llllIlIllll[4]] = v."Open";
        v.llllIlIllIl[v.llllIlIllll[5]] = v."Chest";
        v.llllIlIllIl[v.llllIlIllll[6]] = v."Open";
        v.llllIlIllIl[v.llllIlIllll[7]] = v."Search";
    }

    private static boolean lIllIllIIIIIll(Object object) {
        return object != null;
    }

    private static String lIllIlIllllIlI(String llllllllllllllllIIIllIIIllllIIlI, String llllllllllllllllIIIllIIIllllIllI) {
        llllllllllllllllIIIllIIIllllIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIIIllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIIIllllIlIl = new StringBuilder();
        char[] llllllllllllllllIIIllIIIllllIlII = llllllllllllllllIIIllIIIllllIllI.toCharArray();
        int llllllllllllllllIIIllIIIllllIIll = llllIlIllll[0];
        char[] llllllllllllllllIIIllIIIlllIlIll = llllllllllllllllIIIllIIIllllIIlI.toCharArray();
        int llllllllllllllllIIIllIIIlllIlIIl = llllllllllllllllIIIllIIIlllIlIll.length;
        int llllllllllllllllIIIllIIIlllIlIII = llllIlIllll[0];
        while (v.lIllIllIIIIlll(llllllllllllllllIIIllIIIlllIlIII, llllllllllllllllIIIllIIIlllIlIIl)) {
            char llllllllllllllllIIIllIIIlllllIII = llllllllllllllllIIIllIIIlllIlIll[llllllllllllllllIIIllIIIlllIlIII];
            llllllllllllllllIIIllIIIllllIlIl.append((char)(llllllllllllllllIIIllIIIlllllIII ^ llllllllllllllllIIIllIIIllllIlII[llllllllllllllllIIIllIIIllllIIll % llllllllllllllllIIIllIIIllllIlII.length]));
            0;
            ++llllllllllllllllIIIllIIIllllIIll;
            ++llllllllllllllllIIIllIIIlllIlIII;
            0;
            if (1 > -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIIIllllIlIl);
    }

    @Inject
    public v(SquireBarrows squireBarrows, a a2, c c2) {
        this.ah = squireBarrows;
        this.ai = a2;
        this.aj = c2;
    }
}

