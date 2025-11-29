/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.client.Static
 */
package gg.squire.combat.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;

@Singleton
public class AHelper {

    private final  SquireBlueDragonKillerConfig n;

    private void l() {
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n;
            if (a.llIlIIIlIIlIIl(nPC.isDead() ? 1 : 0) && a.llIlIIIlIIlIlI(nPC.getInteracting(), Players.getLocal())) {
                n = lIIlllIllIIl[1];

                if (((0x31 ^ 0x2C) & ~(0x77 ^ 0x6A)) >= (0x5B ^ 0x5F)) {
                    return false;
                }
            } else {
                n = lIIlllIllIIl[0];
            }
            return n != 0;
        });
        if (a.llIlIIIlIIlIII(nPC2)) {
            return;
        }
        nPC2.interact(lIIlllIlIlll[lIIlllIllIIl[1]]);
    }

        return String.valueOf(var1);
    }

    public boolean n() {
        return this.n.dragonLocation().p().contains(Players.getLocal().getWorldLocation());
    }

    public NPC j() {
        return NPCs.getNearest(nPC -> {
            int n;
            if (a.llIlIIIlIIlIIl(nPC.isDead() ? 1 : 0) && a.llIlIIIlIIIlll(nPC.getName().equals(lIIlllIlIlll[lIIlllIllIIl[3]]) ? 1 : 0) && a.llIlIIIlIIIlll(nPC.getWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldArea()) ? 1 : 0)) {
                n = lIIlllIllIIl[1];

                if (((35 + 92 - 110 + 117 ^ 108 + 50 - 19 + 0) & (0xA ^ 0x38 ^ (0xFD ^ 0xC2) ^ -1)) != ((70 + 73 - 22 + 82 ^ 131 + 119 - 189 + 72) & (142 + 119 - 205 + 140 ^ 76 + 92 - 70 + 40 ^ -1))) {
                    return ((210 + 153 - 152 + 24 ^ 139 + 117 - 190 + 130) & (0x2A ^ 0x43 ^ (0x62 ^ 0x24) ^ -1)) != 0;
                }
            } else {
                n = lIIlllIllIIl[0];
            }
            return n != 0;
        });
    }

    private static boolean llIlIIIlIIlIIl(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public void k() {
        void var1_1;
        NPC var2;
        a var3;
        if (a.llIlIIIlIIIllI(Players.getLocal().getInteracting())) {
            return;
        }
        if (a.llIlIIIlIIIlll(var3.m() ? 1 : 0)) {
            var3.l();
        }
        if (a.llIlIIIlIIlIII(var2 = var3.j())) {
            return;
        }
        var1_1.interact(lIIlllIlIlll[lIIlllIllIIl[0]]);
    }

    private static boolean llIlIIIlIIIllI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean m() {
        boolean bl;
        block4: {
            block3: {
                block2: {
                    Actor actor = Players.getLocal().getInteracting();
                    if (!a.llIlIIIlIIIllI(actor)) break block2;
                    String[] stringArray = new String[lIIlllIllIIl[1]];
                    stringArray[a.lIIlllIllIIl[0]] = lIIlllIlIlll[lIIlllIllIIl[2]];
                    if (!a.llIlIIIlIIlIIl(actor.hasAction(stringArray) ? 1 : 0)) break block3;
                }
                if (!a.llIlIIIlIIlIIl(NPCs.getAll(nPC -> {
                    boolean bl;
                    if (a.llIlIIIlIIlIlI(nPC.getInteracting(), Players.getLocal())) {
                        bl = lIIlllIllIIl[1];

                        if (((0xC6 ^ 0x88 ^ (0x57 ^ 0x79)) & (0x29 ^ 0x2F ^ (0xE7 ^ 0x81) ^ -1)) > 0) {
                            return ((0x60 ^ 0x67 ^ (0x2C ^ 0x66)) & (135 + 41 - 83 + 153 ^ 40 + 9 - -63 + 75 ^ -1)) != 0;
                        }
                    } else {
                        bl = lIIlllIllIIl[0];
                    }
                    return bl;
                }).isEmpty() ? 1 : 0)) break block4;
            }
            bl = lIIlllIllIIl[1];

            if (-1 >= -1) return bl;
            return false;
        }
        bl = lIIlllIllIIl[0];
        return bl;
    }

    private static boolean llIlIIIlIIlIII(Object object) {
        return object == null;
    }

    private static boolean llIlIIIlIIlIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIIlIIIlll(int n) {
        return n != 0;
    }

    @Inject
    public AHelper(SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.n = squireBlueDragonKillerConfig;
    }

    private static boolean llIlIIIlIIlIll(int n, int n2) {
        return n < n2;
    }

    private static void llIlIIIlIIIIII() {
        lIIlllIlIlll = new String[lIIlllIllIIl[4]];
        a.lIIlllIlIlll[a.lIIlllIllIIl[0]] = "Attack";
        a.lIIlllIlIlll[a.lIIlllIllIIl[1]] = "Attack";
        a.lIIlllIlIlll[a.lIIlllIllIIl[2]] = "Attack";
        a.lIIlllIlIlll[a.lIIlllIllIIl[3]] = "Blue dragon";
    }

    static {
        a.llIlIIIlIIIlIl();
        a.llIlIIIlIIIIII();
    }
}

