/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.client.Static
 */
package gg.squire.quest.tasks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.client.Static;
import gg.squire.quest.tasks.MHelper;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.l;

public class VHelper
implements l {
    private final  String ak;
    
    private final  boolean al;
    private final  boolean am;
    private final  String aj;
    private static  int ah;

    private static void lIlllIIIIlllIIl() {
        lIlIIIllIlllI = new String[lIlIIIllIllll[6]];
        v.lIlIIIllIlllI[v.lIlIIIllIllll[1]] = "Magic Instructor";
        v.lIlIIIllIlllI[v.lIlIIIllIllll[0]] = "walkign closer";
    }

    private static boolean lIlllIIIIllllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlllIIIIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIIIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean D() {
        void var1;
        v var2;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (v.lIlllIIIIllllII(nPC.getName().equals(this.aj) ? 1 : 0) && v.lIlllIIIIllllII(nPC.getWorldLocation().toWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), Players.getLocal().getWorldLocation()) ? 1 : 0) && v.lIlllIIIIlllIll(nPC.getInteracting()) && v.lIlllIIIlIIIIII(nPC.isDead() ? 1 : 0)) {
                n2 = lIlIIIllIllll[0];

                if ((0x56 ^ 0x58 ^ (0xCB ^ 0xC1)) < 0) {
                    return ((0xF5 ^ 0x91 ^ (0x7B ^ 1)) & (0x41 ^ 0x50 ^ (0x7E ^ 0x71) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIllIllll[1];
            }
            return n2 != 0;
        });
        if (v.lIlllIIIIlllIll(nPC2)) {
            if (v.lIlllIIIIllllII(this.am ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIllIllll[0]];
                stringArray[v.lIlIIIllIllll[1]] = lIlIIIllIlllI[lIlIIIllIllll[1]];
                Movement.walkTo((Locatable)NPCs.getNearest((String[])stringArray));

                return lIlIIIllIllll[1];
            }
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIIllllIl(Players.getLocal().getInteracting())) {
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIIlllllI(ah, lIlIIIllIllll[0])) {
            ah -= lIlIIIllIllll[0];
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIIllllll(Players.getLocal().getAnimation(), lIlIIIllIllll[2])) {
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIlIIIIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIllIllll[1];
        }
        if (v.lIlllIIIlIIIIII(var2.al ? 1 : 0) && v.lIlllIIIlIIIIII(var2.am ? 1 : 0) && v.lIlllIIIlIIIIII(Reachable.isInteractable((Locatable)var1) ? 1 : 0)) {
            System.out.println(lIlIIIllIlllI[lIlIIIllIllll[0]]);
            var2.a((NPC)var1);
            return lIlIIIllIllll[0];
        }
        if (v.lIlllIIIlIIIIII(var2.am ? 1 : 0) && v.lIlllIIIIlllllI(var1.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIlIIIllIllll[3])) {
            var2.a((NPC)var1);
            return lIlIIIllIllll[0];
        }
        if (v.lIlllIIIIllllII(var2.am ? 1 : 0)) {
            Magic.cast((Spell)SpellBook.Standard.WIND_STRIKE, (NPC)var1);
            return lIlIIIllIllll[0];
        }
        nPC2.interact(this.ak);
        ah = M.a(lIlIIIllIllll[0], lIlIIIllIllll[4]);
        return lIlIIIllIllll[0];
    }

    static {
        v.lIlllIIIIlllIlI();
        v.lIlllIIIIlllIIl();
    }

    private static boolean lIlllIIIIlllIll(Object object) {
        return object == null;
    }

    private static boolean lIlllIIIIllllIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public void a(NPC nPC) {
        void var5_5;
        void var4_4;
        void var2_2;
        void var3;
        if (v.lIlllIIIIlllIll(nPC)) {
            return;
        }
        WorldPoint var4 = var3.getWorldLocation();
        Random var5 = new Random();
        int var6 = var5.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        int var7 = var5.nextInt(lIlIIIllIllll[3]) - lIlIIIllIllll[5];
        if (v.lIlllIIIlIIIIII(var6) && v.lIlllIIIlIIIIII(var7)) {
            var6 = lIlIIIllIllll[0];
        }
        WorldPoint worldPoint = new WorldPoint(var2_2.getX() + var4_4, var2_2.getY() + var5_5, var2_2.getPlane());
        Walker.walkTo((WorldPoint)worldPoint);

        ah = M.a(lIlIIIllIllll[0], lIlIIIllIllll[4]);
    }

    private static boolean lIlllIIIlIIIIII(int n2) {
        return n2 == 0;
    }

    @Override
    public String y() {
        return this.aj;
    }

    @Override
    public String z() {
        return this.ak;
    }

    public VHelper(String string, String string2, boolean bl, boolean bl2) {
        this.aj = string;
        this.ak = string2;
        this.al = bl;
        this.am = bl2;
    }
}

