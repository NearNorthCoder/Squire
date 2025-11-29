/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum16;
import gg.squire.hunter.tasks.GameEnum;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

public abstract class HunterTaskBase
extends HunterTaskBase {

    private static boolean lIIIlllIllllIII(int n2, int n3) {
        return n2 == n3;
    }

    protected i H() {
        return this.z().pitfallAnimal();
    }

    private boolean a(NPC nPC) {
        RectangularArea rectangularArea = this.H().w();
        if (x.lIIIlllIlllIllI(rectangularArea)) {
            return llllIIIlIlII[1];
        }
        return rectangularArea.contains(nPC.getWorldLocation());
    }

    private static void lIIIlllIlllIIll() {
        llllIIIlIIll = new String[llllIIIlIlII[4]];
        x.llllIIIlIIll[x.llllIIIlIlII[0]] = "Collapsed trap";
        x.llllIIIlIIll[x.llllIIIlIlII[1]] = "Dismantle";
        x.llllIIIlIIll[x.llllIIIlIlII[2]] = "Spiked pit";
        x.llllIIIlIIll[x.llllIIIlIlII[3]] = "Jump";
    }

    protected TileObject a(boolean bl) {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lIIIlllIlllIlll(llllIIIlIIll[llllIIIlIlII[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[llllIIIlIlII[1]];
                stringArray[x.llllIIIlIlII[0]] = llllIIIlIIll[llllIIIlIlII[1]];
                if (x.lIIIlllIllllIII(tileObject.hasAction(stringArray) ? 1 : 0, bl ? 1 : 0)) {
                    n2 = llllIIIlIlII[1];

                    if (((0x4A ^ 0x57 ^ (0x3A ^ 0x18)) & (82 + 77 - 146 + 160 ^ 73 + 113 - 105 + 65 ^ -1)) != 2) return n2 != 0;
                    return ((0xD8 ^ 0x91 ^ (0xD4 ^ 0xAC)) & (124 + 95 - 82 + 50 ^ 32 + 111 - 69 + 64 ^ -1)) != 0;
                }
            }
            n2 = llllIIIlIlII[0];
            return n2 != 0;
        });
    }

    protected TileObject F() {
        return TileObjects.getNearest(tileObject -> {
            int n2;
            if (x.lIIIlllIlllIlll(llllIIIlIIll[llllIIIlIlII[2]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[llllIIIlIlII[1]];
                stringArray[x.llllIIIlIlII[0]] = llllIIIlIIll[llllIIIlIlII[3]];
                if (x.lIIIlllIlllIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llllIIIlIlII[1];

                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llllIIIlIlII[0];
            return n2 != 0;
        });
    }

    public HunterTaskBase(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.PITFALL);
    }

        return String.valueOf(var1);
    }

    protected NPC D() {
        return this.a((NPC nPC) -> {
            boolean bl;
            if (x.lIIIlllIlllIllI(nPC.getInteracting())) {
                bl = llllIIIlIlII[1];

                if (((0xA6 ^ 0x83 ^ (0 ^ 6)) & (75 + 116 - 101 + 46 ^ 30 + 29 - -68 + 44 ^ -1)) >= 1) {
                    return ((29 + 90 - 81 + 145 ^ 101 + 7 - 48 + 69) & (0xED ^ 0xC3 ^ (0x11 ^ 9) ^ -1)) != 0;
                }
            } else {
                bl = llllIIIlIlII[0];
            }
            return bl;
        });
    }

    private static boolean lIIIlllIllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    protected NPC E() {
        return this.a((NPC nPC) -> {
            boolean bl;
            if (x.lIIIlllIllllIIl(nPC.getInteracting(), Players.getLocal())) {
                bl = llllIIIlIlII[1];

                if ((10 + 13 - -64 + 44 ^ 108 + 77 - 117 + 67) < ((0x52 ^ 0x7B ^ (0xC4 ^ 0xC3)) & (9 + 127 - 38 + 31 ^ 137 + 113 - 96 + 21 ^ -1))) {
                    return ((0x3B ^ 0xF ^ (0x8C ^ 0x9E)) & (0xCF ^ 0xC6 ^ (0x49 ^ 0x66) ^ -1)) != 0;
                }
            } else {
                bl = llllIIIlIlII[0];
            }
            return bl;
        });
    }

    private static boolean lIIIlllIlllIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    protected NPC a(Predicate<NPC> predicate) {
        WorldPoint worldPoint;
        TileObject tileObject = this.G();
        if (x.lIIIlllIlllIllI(tileObject)) {
            worldPoint = Players.getLocal().getWorldLocation();

            if (((0x1F ^ 0x23) & ~(0xBB ^ 0x87)) > ((0x14 ^ 0x2E) & ~(0x1B ^ 0x21))) {
                return null;
            }
        } else {
            void var2;
            worldPoint = var2.getWorldLocation();
        }
        WorldPoint worldPoint2 = worldPoint;
        return NPCs.getNearest((WorldPoint)worldPoint2, predicate.and(nPC -> {
            int n2;
            if (x.lIIIlllIlllIlll(this.H().v().equalsIgnoreCase(nPC.getName()) ? 1 : 0) && x.lIIIlllIlllIlll(this.a((NPC)nPC) ? 1 : 0)) {
                n2 = llllIIIlIlII[1];

            } else {
                n2 = llllIIIlIlII[0];
            }
            return n2 != 0;
        }));
    }

    private static boolean lIIIlllIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlllIllllIIl(Object object, Object object2) {
        return object == object2;
    }

    static {
        x.lIIIlllIlllIlII();
        x.lIIIlllIlllIIll();
    }

    private static boolean lIIIlllIlllIlIl(Object object) {
        return object != null;
    }

    protected TileObject G() {
        x var3;
        TileObject var4;
        TileObject tileObject = this.F();
        if (x.lIIIlllIlllIlIl(tileObject)) {
            return var4;
        }
        var4 = var3.a(llllIIIlIlII[0]);
        if (x.lIIIlllIlllIlIl(var4)) {
            return var4;
        }
        return this.a(llllIIIlIlII[1]);
    }
}

